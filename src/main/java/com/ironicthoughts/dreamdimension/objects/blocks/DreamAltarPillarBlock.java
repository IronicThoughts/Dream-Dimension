/*package com.ironicthoughts.dreamdimension.objects.blocks;

import java.util.Random;
import java.util.stream.Stream;

import com.ironicthoughts.dreamdimension.init.ItemInitOld;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
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
import net.minecraft.world.server.ServerWorld;

public class DreamAltarPillarBlock extends Block {
	private int harvestLevel;
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
	public static final BooleanProperty LIT = BlockStateProperties.LIT;
	
	private static final VoxelShape SHAPE_N = Stream.of(Block.makeCuboidShape(12, 5, 7, 13, 12, 9),
			Block.makeCuboidShape(12, 6, 6, 13, 11, 7), Block.makeCuboidShape(12, 6, 9, 13, 11, 10),
			Block.makeCuboidShape(2, 0, 2, 14, 2, 14), Block.makeCuboidShape(2, 14, 2, 14, 16, 14),
			Block.makeCuboidShape(7, 5, 3, 9, 12, 4), Block.makeCuboidShape(6, 6, 3, 7, 11, 4),
			Block.makeCuboidShape(9, 6, 3, 10, 11, 4), Block.makeCuboidShape(7, 5, 12, 9, 12, 13),
			Block.makeCuboidShape(6, 6, 12, 7, 11, 13), Block.makeCuboidShape(9, 6, 12, 10, 11, 13),
			Block.makeCuboidShape(3, 5, 7, 4, 12, 9), Block.makeCuboidShape(3, 6, 6, 4, 11, 7),
			Block.makeCuboidShape(3, 6, 9, 4, 11, 10), Block.makeCuboidShape(3, 2, 3, 13, 5, 13),
			Block.makeCuboidShape(3, 12, 3, 13, 14, 13), Block.makeCuboidShape(4, 5, 4, 12, 12, 12)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_S = Stream.of(Block.makeCuboidShape(3, 5, 7, 4, 12, 9),
			Block.makeCuboidShape(3, 6, 9, 4, 11, 10), Block.makeCuboidShape(3, 6, 6, 4, 11, 7),
			Block.makeCuboidShape(2, 0, 2, 14, 2, 14), Block.makeCuboidShape(2, 14, 2, 14, 16, 14),
			Block.makeCuboidShape(7, 5, 12, 9, 12, 13), Block.makeCuboidShape(9, 6, 12, 10, 11, 13),
			Block.makeCuboidShape(6, 6, 12, 7, 11, 13), Block.makeCuboidShape(7, 5, 3, 9, 12, 4),
			Block.makeCuboidShape(9, 6, 3, 10, 11, 4), Block.makeCuboidShape(6, 6, 3, 7, 11, 4),
			Block.makeCuboidShape(12, 5, 7, 13, 12, 9), Block.makeCuboidShape(12, 6, 9, 13, 11, 10),
			Block.makeCuboidShape(12, 6, 6, 13, 11, 7), Block.makeCuboidShape(3, 2, 3, 13, 5, 13),
			Block.makeCuboidShape(3, 12, 3, 13, 14, 13), Block.makeCuboidShape(4, 5, 4, 12, 12, 12)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_E = Stream.of(Block.makeCuboidShape(7, 5, 12, 9, 12, 13),
			Block.makeCuboidShape(9, 6, 12, 10, 11, 13), Block.makeCuboidShape(6, 6, 12, 7, 11, 13),
			Block.makeCuboidShape(2, 0, 2, 14, 2, 14), Block.makeCuboidShape(2, 14, 2, 14, 16, 14),
			Block.makeCuboidShape(12, 5, 7, 13, 12, 9), Block.makeCuboidShape(12, 6, 6, 13, 11, 7),
			Block.makeCuboidShape(12, 6, 9, 13, 11, 10), Block.makeCuboidShape(3, 5, 7, 4, 12, 9),
			Block.makeCuboidShape(3, 6, 6, 4, 11, 7), Block.makeCuboidShape(3, 6, 9, 4, 11, 10),
			Block.makeCuboidShape(7, 5, 3, 9, 12, 4), Block.makeCuboidShape(9, 6, 3, 10, 11, 4),
			Block.makeCuboidShape(6, 6, 3, 7, 11, 4), Block.makeCuboidShape(3, 2, 3, 13, 5, 13),
			Block.makeCuboidShape(3, 12, 3, 13, 14, 13), Block.makeCuboidShape(4, 5, 4, 12, 12, 12)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_W = Stream.of(Block.makeCuboidShape(7, 5, 3, 9, 12, 4),
			Block.makeCuboidShape(6, 6, 3, 7, 11, 4), Block.makeCuboidShape(9, 6, 3, 10, 11, 4),
			Block.makeCuboidShape(2, 0, 2, 14, 2, 14), Block.makeCuboidShape(2, 14, 2, 14, 16, 14),
			Block.makeCuboidShape(3, 5, 7, 4, 12, 9), Block.makeCuboidShape(3, 6, 9, 4, 11, 10),
			Block.makeCuboidShape(3, 6, 6, 4, 11, 7), Block.makeCuboidShape(12, 5, 7, 13, 12, 9),
			Block.makeCuboidShape(12, 6, 9, 13, 11, 10), Block.makeCuboidShape(12, 6, 6, 13, 11, 7),
			Block.makeCuboidShape(7, 5, 12, 9, 12, 13), Block.makeCuboidShape(6, 6, 12, 7, 11, 13),
			Block.makeCuboidShape(9, 6, 12, 10, 11, 13), Block.makeCuboidShape(3, 2, 3, 13, 5, 13),
			Block.makeCuboidShape(3, 12, 3, 13, 14, 13), Block.makeCuboidShape(4, 5, 4, 12, 12, 12)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public DreamAltarPillarBlock(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
		this.setDefaultState(this.stateContainer.getBaseState().with(POWERED, Boolean.valueOf(false)));
		this.setDefaultState(this.stateContainer.getBaseState().with(LIT, Boolean.valueOf(false)));
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch (state.get(FACING)) {
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

	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(LIT, Boolean.valueOf(false)).with(POWERED, Boolean.valueOf(false));
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
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
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
	
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		ItemStack itemstack = player.getHeldItem(handIn);
		if (itemstack.isEmpty()) {
			return ActionResultType.PASS;
		} else {
			Item item = itemstack.getItem();
			if (item == ItemInitOld.DREAM_DUST) {
				itemstack.shrink(1);
				int item1 = itemstack.getStack().getCount();
				BlockState blockstate1 = this.isPowered(state, worldIn, pos);
				float f = blockstate1.get(POWERED) ? 0.6F : 0.5F;
				worldIn.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_BEACON_ACTIVATE, SoundCategory.BLOCKS, 0.3F, f);
			}
		}
		return ActionResultType.CONSUME;
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
}*/