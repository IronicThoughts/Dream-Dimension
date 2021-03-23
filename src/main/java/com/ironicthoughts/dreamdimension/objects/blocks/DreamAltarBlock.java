package com.ironicthoughts.dreamdimension.objects.blocks;

import java.util.Random;
import java.util.stream.Stream;

import com.ironicthoughts.dreamdimension.DreamDimension;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DreamAltarBlock extends Block {
	private int harvestLevel;
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
	public static final BooleanProperty LIT = BlockStateProperties.LIT;
	public static final ResourceLocation DREAM = DreamDimension.DREAM;

	public static final VoxelShape SHAPE_W = Stream.of(Block.makeCuboidShape(0, 0, 0, 16, 2, 16),
			Block.makeCuboidShape(4, 2, 4, 12, 12, 12), Block.makeCuboidShape(5, 12, 4, 12, 13, 12),
			Block.makeCuboidShape(7, 13, 4, 12, 15, 12), Block.makeCuboidShape(2, 13, 0, 15, 17, 16),
			Block.makeCuboidShape(3, 4, 9, 4, 9, 10), Block.makeCuboidShape(3, 4, 6, 4, 9, 6.999999999999999),
			Block.makeCuboidShape(3, 3, 7.000000000000001, 4, 10, 9)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	public static final VoxelShape SHAPE_N = Stream
			.of(Block.makeCuboidShape(0, 0, 0, 16, 2, 16), Block.makeCuboidShape(4, 2, 4, 12, 12, 12),
					Block.makeCuboidShape(4, 12, 5, 12, 13, 12), Block.makeCuboidShape(4, 13, 7, 12, 15, 12),
					Block.makeCuboidShape(0, 12.84897303706013, 2.9259304818301075, 16, 16.84897303706013,
							15.925930481830108),
					Block.makeCuboidShape(7, 3, 3, 9, 10, 4), Block.makeCuboidShape(6, 4, 3, 7, 9, 4),
					Block.makeCuboidShape(9, 4, 3, 10, 9, 4))
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	public static final VoxelShape SHAPE_E = Stream
			.of(Block.makeCuboidShape(0, 0, 0, 16, 2, 16), Block.makeCuboidShape(4, 2, 4, 12, 12, 12),
					Block.makeCuboidShape(4, 12, 4, 11, 13, 12), Block.makeCuboidShape(4, 13, 4, 9, 15, 12),
					Block.makeCuboidShape(2, 12, 0, 15, 16, 16), Block.makeCuboidShape(12, 3, 7, 13, 10, 9),
					Block.makeCuboidShape(12, 4, 6, 13, 9, 7), Block.makeCuboidShape(12, 4, 9, 13, 9, 10))
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	public static final VoxelShape SHAPE_S = Stream
			.of(Block.makeCuboidShape(0, 0, 0, 16, 2, 16), Block.makeCuboidShape(4, 2, 4, 12, 12, 12),
					Block.makeCuboidShape(4, 12, 4, 12, 13, 11), Block.makeCuboidShape(4, 13, 4, 12, 15, 9),
					Block.makeCuboidShape(0, 12, 2, 16, 16, 15), Block.makeCuboidShape(7, 3, 12, 9, 10, 13),
					Block.makeCuboidShape(9, 4, 12, 10, 9, 13), Block.makeCuboidShape(6, 4, 12, 7, 9, 13))
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	public DreamAltarBlock(Block.Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
		this.setDefaultState(this.stateContainer.getBaseState().with(LIT, Boolean.valueOf(false)));
		this.setDefaultState(this.stateContainer.getBaseState().with(POWERED, Boolean.valueOf(false)));
	}

	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return SHAPE_N;
	}

	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite())
				.with(LIT, Boolean.valueOf(false)).with(POWERED, Boolean.valueOf(false));
	}

	public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos,
			ISelectionContext context) {
		return SHAPE_N;
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch ((Direction) state.get(FACING)) {
		case NORTH:
			return SHAPE_N;
		case SOUTH:
			return SHAPE_S;
		case EAST:
			return SHAPE_E;
		case WEST:
			return SHAPE_W;
		default:
			return SHAPE_N;
		}
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING, rot.rotate(state.get(FACING)));
	}

	@Override
	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
	}

	@Override
	public void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(FACING, POWERED, LIT);
	}

	@SuppressWarnings("deprecation")
	public int getLightValue(BlockState state) {
		return state.get(LIT) ? super.getLightValue(state) : 0;
	}

	@SuppressWarnings("deprecation")
	public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
		super.onBlockAdded(state, worldIn, pos, oldState, isMoving);
	}

	@Override
	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
		if (state.get(LIT)) {
			worldIn.setBlockState(pos, state.cycle(LIT), 2);
		}
	}

	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if (stateIn.get(LIT) == true) {
			for (int i = 0; i < 4; ++i) {
				double d0 = (double) pos.getX() + (double) rand.nextFloat();
				double d1 = (double) pos.getY() + (double) rand.nextFloat();
				double d2 = (double) pos.getZ() + (double) rand.nextFloat();
				double d3 = ((double) rand.nextFloat() - 0.5D) * 0.5D;
				double d4 = ((double) rand.nextFloat() - 0.5D) * 0.5D;
				double d5 = ((double) rand.nextFloat() - 0.5D) * 0.5D;
				int j = rand.nextInt(2) * 2 - 1;
				if (worldIn.getBlockState(pos.west()).getBlock() != this
						&& worldIn.getBlockState(pos.east()).getBlock() != this) {
					d0 = (double) pos.getX() + 0.5D + 0.25D * (double) j;
					d3 = (double) (rand.nextFloat() * 2.0F * (float) j);
				} else {
					d2 = (double) pos.getZ() + 0.5D + 0.25D * (double) j;
					d5 = (double) (rand.nextFloat() * 2.0F * (float) j);
				}
				worldIn.addParticle(ParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
			}
		}
	}

	// Powers and unpowers the Dream Altar block when clicked with Dream Dust
	/*public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		ItemStack itemstack = player.getHeldItem(handIn);
		Item item = itemstack.getItem();
		BlockState blockstate1 = this.isPowered(state, worldIn, pos);
		if (item != ItemInitOld.DREAM_DUST && blockstate1 == state.cycle(POWERED) || itemstack == itemstack.isEmpty()) {
			float f = blockstate1.get(POWERED) ? 0.6F : 0.5F;
			player.changeDimension(DimensionType.byName(DREAM));
			worldIn.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_PORTAL_TRAVEL, SoundCategory.BLOCKS, 0.3F, f);
			return ActionResultType.SUCCESS;
		} else {
			if (item == ItemInitOld.DREAM_DUST) {
				itemstack.shrink(1);
				float f = blockstate1.get(POWERED) ? 0.6F : 0.5F;
				worldIn.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_BEACON_ACTIVATE, SoundCategory.BLOCKS,
						0.3F, f);
				return ActionResultType.CONSUME;
			}
		}
		return ActionResultType.PASS;
	}

	public ActionResultType onDreamTeleport(World worldIn, BlockPos pos, PlayerEntity player, Hand handIn,
			BlockRayTraceResult hit) {
		Block block = BlockInit.DREAM_ALTAR.get();
		BlockState blockstate = block.getDefaultState();
		Boolean b = blockstate.get(POWERED);
		if (b == true) {
			float f = blockstate.get(POWERED) ? 0.6F : 0.5F;
			player.changeDimension(DimensionType.byName(DREAM));
			worldIn.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_PORTAL_TRAVEL, SoundCategory.BLOCKS, 0.3F, f);
			return ActionResultType.SUCCESS;
		} else {
			return ActionResultType.PASS;
		}
	}*/

	@SuppressWarnings("deprecation")
	public BlockState isPowered(BlockState state, World worldIn, BlockPos pos) {
		state = state.cycle(LIT);
		state = state.cycle(POWERED);
		worldIn.setBlockState(pos, state, 3);
		this.updateNeighbors(state, worldIn, pos, harvestLevel);
		return state;
	}

	public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
		return false;
	}

	public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
		return true;
	}

	public boolean isTransparent(BlockState state) {
		return true;
	}
}