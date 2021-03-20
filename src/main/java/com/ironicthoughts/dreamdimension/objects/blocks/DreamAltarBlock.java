/* package com.ironicthoughts.dreamdimension.objects.blocks;

import java.util.Random;
import java.util.stream.Stream;

import com.ironicthoughts.dreamdimension.DreamDimension;
import com.ironicthoughts.dreamdimension.init.BlockInit;
import com.ironicthoughts.dreamdimension.init.ItemInitOld;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DreamAltarBlock extends Block {
	private int harvestLevel;
	private static BlockPattern portalShape;
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
	public static final BooleanProperty LIT = BlockStateProperties.LIT;
	public static final ResourceLocation DREAM = DreamDimension.DREAM;
	static BlockPattern shape1 = portalShape;
	static BlockPattern shape2 = portalShape;
	static BlockPattern shape3 = portalShape;
	static BlockPattern shape4 = portalShape;
	static BlockPattern shape5 = portalShape;
	
	public static final VoxelShape SHAPE_W = Stream.of(Block.makeCuboidShape(0, 0, 0, 16, 2, 16),
			Block.makeCuboidShape(4, 2, 4, 12, 12, 12), Block.makeCuboidShape(5, 12, 4, 12, 13, 12),
			Block.makeCuboidShape(7, 13, 4, 12, 15, 12), Block.makeCuboidShape(2, 13, 0, 15, 17, 16),
			Block.makeCuboidShape(3, 4, 9, 4, 9, 10), Block.makeCuboidShape(3, 4, 6, 4, 9, 6.999999999999999),
			Block.makeCuboidShape(3, 3, 7.000000000000001, 4, 10, 9)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public static final VoxelShape SHAPE_N = Stream
			.of(Block.makeCuboidShape(0, 0, 0, 16, 2, 16), Block.makeCuboidShape(4, 2, 4, 12, 12, 12),
					Block.makeCuboidShape(4, 12, 5, 12, 13, 12), Block.makeCuboidShape(4, 13, 7, 12, 15, 12),
					Block.makeCuboidShape(0, 12.84897303706013, 2.9259304818301075, 16, 16.84897303706013,15.925930481830108),
					Block.makeCuboidShape(7, 3, 3, 9, 10, 4), Block.makeCuboidShape(6, 4, 3, 7, 9, 4),
					Block.makeCuboidShape(9, 4, 3, 10, 9, 4)).reduce((v1, v2) -> {
						return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public static final VoxelShape SHAPE_E = Stream
			.of(Block.makeCuboidShape(0, 0, 0, 16, 2, 16), Block.makeCuboidShape(4, 2, 4, 12, 12, 12),
					Block.makeCuboidShape(4, 12, 4, 11, 13, 12), Block.makeCuboidShape(4, 13, 4, 9, 15, 12),
					Block.makeCuboidShape(2, 12, 0, 15, 16, 16), Block.makeCuboidShape(12, 3, 7, 13, 10, 9),
					Block.makeCuboidShape(12, 4, 6, 13, 9, 7), Block.makeCuboidShape(12, 4, 9, 13, 9, 10)).reduce((v1, v2) -> {
						return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public static final VoxelShape SHAPE_S = Stream
			.of(Block.makeCuboidShape(0, 0, 0, 16, 2, 16), Block.makeCuboidShape(4, 2, 4, 12, 12, 12),
					Block.makeCuboidShape(4, 12, 4, 12, 13, 11), Block.makeCuboidShape(4, 13, 4, 12, 15, 9),
					Block.makeCuboidShape(0, 12, 2, 16, 16, 15), Block.makeCuboidShape(7, 3, 12, 9, 10, 13),
					Block.makeCuboidShape(9, 4, 12, 10, 9, 13), Block.makeCuboidShape(6, 4, 12, 7, 9, 13)).reduce((v1, v2) -> {
						return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

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
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(LIT, Boolean.valueOf(false)).with(POWERED, Boolean.valueOf(false));
	}

	public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
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
	/* 
	 * ? = Any Block
	 * A = Dark Stone
	 * B = Chiseled Dark Stone
	 * C = Cut Dark Stone
	 * D = Dark Stone Stairs Facing North, E = Dark Stone Stairs Facing East, F = Darks Stone Stairs Facing South, G = Dark Stone Stairs Facing West
	 * H = Dark Stone Bottom Slab
	 * J = Dream Altar Pillar Facing North, K = Dream Altar Pillar Facing East, L = Dream Altar Pillar Facing South, M = Dream Altar Pillar Facing West
	 * N = Dream Crystal
	 */
	/*public static BlockPattern CreatePortalShape() {
		if (portalShape == null) {
			shape1 = BlockPatternBuilder.start().aisle("BDDDDDB", "EAAAAAG", "EAAAAAG", "EAAAAAG", "EAAAAAG", "BFFFFFB").where('A', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DARK_STONE.get()))).where('B', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.CHISELED_DARK_STONE.get()))).where('D', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DARK_STONE_STAIRS.get()).where(FACING, Predicates.equalTo(Direction.NORTH)))).where('E', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DARK_STONE_STAIRS.get()).where(FACING, Predicates.equalTo(Direction.EAST)))).where('F', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DARK_STONE_STAIRS.get()).where(FACING, Predicates.equalTo(Direction.SOUTH)))).where('G', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DARK_STONE_STAIRS.get()).where(FACING, Predicates.equalTo(Direction.WEST)))).where('J', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DREAM_ALTAR_PILLAR.get()).where(POWERED, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.NORTH)))).where('N', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DREAM_CRYSTAL.get()).where(POWERED, Predicates.equalTo(true)))).aisle("C?????C", "???????", "??C?C??", "??CCC??", "???????", "C?????C").where('?', CachedBlockInfo.hasState(BlockStateMatcher.ANY)).where('C', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.CUT_DARK_STONE.get()))).build();
			shape2 = BlockPatternBuilder.start().aisle("C?????C", "???????", "??C?C??", "??CCC??", "???????", "C?????C").where('?', CachedBlockInfo.hasState(BlockStateMatcher.ANY)).where('C', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.CUT_DARK_STONE.get()))).build();
			shape3 = BlockPatternBuilder.start().aisle("L?????L", "???????", "???????", "???H???", "???????", "K?????M").where('?', CachedBlockInfo.hasState(BlockStateMatcher.ANY)).where('H', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DARK_STONE_SLAB.get()).where(SlabBlock.TYPE, Predicates.equalTo(SlabType.BOTTOM)))).where('L', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DREAM_ALTAR_PILLAR.get()).where(POWERED, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.SOUTH)))).where('K', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DREAM_ALTAR_PILLAR.get()).where(POWERED, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.EAST)))).where('M', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DREAM_ALTAR_PILLAR.get()).where(POWERED, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.WEST)))).build();
			shape4 = BlockPatternBuilder.start().aisle("M?????K", "???????", "???????", "???????", "???????", "M?????J").where('?', CachedBlockInfo.hasState(BlockStateMatcher.ANY)).where('M', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DREAM_ALTAR_PILLAR.get()).where(POWERED, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.WEST)))).where('K', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DREAM_ALTAR_PILLAR.get()).where(POWERED, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.EAST)))).where('K', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DREAM_ALTAR_PILLAR.get()).where(POWERED, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.NORTH)))).build();
			shape5 = BlockPatternBuilder.start().aisle("N?????N", "???????", "???????", "???????", "???????", "N?????N").where('?', CachedBlockInfo.hasState(BlockStateMatcher.ANY)).where('N', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(BlockInit.DREAM_CRYSTAL.get()).where(POWERED, Predicates.equalTo(true)))).build();
		}
		return portalShape;
	}
	
	
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if(stateIn.get(LIT) == true) {
			for(int i = 0; i < 4; ++i) {
				double d0 = (double)pos.getX() + (double)rand.nextFloat();
				double d1 = (double)pos.getY() + (double)rand.nextFloat();
				double d2 = (double)pos.getZ() + (double)rand.nextFloat();
				double d3 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
				double d4 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
				double d5 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
				int j = rand.nextInt(2) * 2 - 1;
					if (worldIn.getBlockState(pos.west()).getBlock() != this && worldIn.getBlockState(pos.east()).getBlock() != this) {
						d0 = (double)pos.getX() + 0.5D + 0.25D * (double)j;
						d3 = (double)(rand.nextFloat() * 2.0F * (float)j);
					} else {
						d2 = (double)pos.getZ() + 0.5D + 0.25D * (double)j;
						d5 = (double)(rand.nextFloat() * 2.0F * (float)j);
					}
					worldIn.addParticle(ParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
				}
			}
		}
	
	// Powers and unpowers the Dream Altar block when clicked with Dream Dust
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		ItemStack itemstack = player.getHeldItem(handIn);
		if(itemstack.isEmpty()) {
			return ActionResultType.PASS;
		} else {
			Item item = itemstack.getItem();
			if(item == ItemInitOld.DREAM_DUST) {
				itemstack.shrink(1);
				BlockState blockstate1 = this.isPowered(state, worldIn, pos);
				float f = blockstate1.get(POWERED) ? 0.6F : 0.5F;
				worldIn.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_BEACON_ACTIVATE, SoundCategory.BLOCKS, 0.3F, f);
				return ActionResultType.CONSUME;
			}
		}
		return ActionResultType.PASS;
	}
	
	/*
	 * Teleports the player to the Dream Dimension if the Dream Altar is part of the portal. 
	 * Also teleports the player if the Dream Altar isnt part of the portal (must be powered for both)
	 
	public ActionResultType onDreamTeleport(World worldIn, BlockPos pos, PlayerEntity player) {
		BlockPattern portalshape = portalShape;
		Block block = BlockInit.DREAM_ALTAR.get();
		BlockState blockstate = block.getDefaultState();
		Boolean b = blockstate.get(POWERED);
		if(portalshape == shape1 && portalshape == shape2 && portalshape == shape3 && portalshape == shape4 && portalshape == shape5 && b == true || b == true) {
			float f = blockstate.get(POWERED) ? 0.6F : 0.5F;
			player.changeDimension(DimensionType.byName(DREAM));
			worldIn.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_PORTAL_TRAVEL, SoundCategory.BLOCKS, 0.3F, f);
			return ActionResultType.SUCCESS;
		} else {
			return ActionResultType.PASS;
		}
	}
	
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
*/
