package com.ironicthoughts.dreamdimension.objects.blocks;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class DreamAltarPillarBlock extends Block {
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

	private static final VoxelShape SHAPE_N = Stream.of(Block.makeCuboidShape(12, 6, 7, 13, 13, 9),
			Block.makeCuboidShape(12, 7, 6, 13, 12, 7), Block.makeCuboidShape(12, 7, 9, 13, 12, 10),
			Block.makeCuboidShape(2, 0, 2, 14, 2, 14), Block.makeCuboidShape(2, 15, 2, 14, 17, 14),
			Block.makeCuboidShape(7, 6, 3, 9, 13, 4), Block.makeCuboidShape(6, 7, 3, 7, 12, 4),
			Block.makeCuboidShape(9, 7, 3, 10, 12, 4), Block.makeCuboidShape(7, 6, 12, 9, 13, 13),
			Block.makeCuboidShape(6, 7, 12, 7, 12, 13), Block.makeCuboidShape(9, 7, 12, 10, 12, 13),
			Block.makeCuboidShape(3, 6, 7, 4, 13, 9), Block.makeCuboidShape(3, 7, 6, 4, 12, 7),
			Block.makeCuboidShape(3, 7, 9, 4, 12, 10), Block.makeCuboidShape(3, 2, 3, 13, 6, 13),
			Block.makeCuboidShape(3, 13, 3, 13, 15, 13), Block.makeCuboidShape(4, 6, 4, 12, 13, 12)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_S = Stream.of(Block.makeCuboidShape(3, 6, 7, 4, 13, 9),
			Block.makeCuboidShape(3, 7, 9, 4, 12, 10), Block.makeCuboidShape(3, 7, 6, 4, 12, 7),
			Block.makeCuboidShape(2, 0, 2, 14, 2, 14), Block.makeCuboidShape(2, 15, 2, 14, 17, 14),
			Block.makeCuboidShape(7, 6, 12, 9, 13, 13), Block.makeCuboidShape(9, 7, 12, 10, 12, 13),
			Block.makeCuboidShape(6, 7, 12, 7, 12, 13), Block.makeCuboidShape(7, 6, 3, 9, 13, 4),
			Block.makeCuboidShape(9, 7, 3, 10, 12, 4), Block.makeCuboidShape(6, 7, 3, 7, 12, 4),
			Block.makeCuboidShape(12, 6, 7, 13, 13, 9), Block.makeCuboidShape(12, 7, 9, 13, 12, 10),
			Block.makeCuboidShape(12, 7, 6, 13, 12, 7), Block.makeCuboidShape(3, 2, 3, 13, 6, 13),
			Block.makeCuboidShape(3, 13, 3, 13, 15, 13), Block.makeCuboidShape(4, 6, 4, 12, 13, 12)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_E = Stream.of(Block.makeCuboidShape(7, 6, 12, 9, 13, 13),
			Block.makeCuboidShape(9, 7, 12, 10, 12, 13), Block.makeCuboidShape(6, 7, 12, 7, 12, 13),
			Block.makeCuboidShape(2, 0, 2, 14, 2, 14), Block.makeCuboidShape(2, 15, 2, 14, 17, 14),
			Block.makeCuboidShape(12, 6, 7, 13, 13, 9), Block.makeCuboidShape(12, 7, 6, 13, 12, 7),
			Block.makeCuboidShape(12, 7, 9, 13, 12, 10), Block.makeCuboidShape(3, 6, 7, 4, 13, 9),
			Block.makeCuboidShape(3, 7, 6, 4, 12, 7), Block.makeCuboidShape(3, 7, 9, 4, 12, 10),
			Block.makeCuboidShape(7, 6, 3, 9, 13, 4), Block.makeCuboidShape(9, 7, 3, 10, 12, 4),
			Block.makeCuboidShape(6, 7, 3, 7, 12, 4), Block.makeCuboidShape(3, 2, 3, 13, 6, 13),
			Block.makeCuboidShape(3, 13, 3, 13, 15, 13), Block.makeCuboidShape(4, 6, 4, 12, 13, 12)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	private static final VoxelShape SHAPE_W = Stream.of(Block.makeCuboidShape(7, 6, 3, 9, 13, 4),
			Block.makeCuboidShape(6, 7, 3, 7, 12, 4), Block.makeCuboidShape(9, 7, 3, 10, 12, 4),
			Block.makeCuboidShape(2, 0, 2, 14, 2, 14), Block.makeCuboidShape(2, 15, 2, 14, 17, 14),
			Block.makeCuboidShape(3, 6, 7, 4, 13, 9), Block.makeCuboidShape(3, 7, 9, 4, 12, 10),
			Block.makeCuboidShape(3, 7, 6, 4, 12, 7), Block.makeCuboidShape(12, 6, 7, 13, 13, 9),
			Block.makeCuboidShape(12, 7, 9, 13, 12, 10), Block.makeCuboidShape(12, 7, 6, 13, 12, 7),
			Block.makeCuboidShape(7, 6, 12, 9, 13, 13), Block.makeCuboidShape(6, 7, 12, 7, 12, 13),
			Block.makeCuboidShape(9, 7, 12, 10, 12, 13), Block.makeCuboidShape(3, 2, 3, 13, 6, 13),
			Block.makeCuboidShape(3, 13, 3, 13, 15, 13), Block.makeCuboidShape(4, 6, 4, 12, 13, 12)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public DreamAltarPillarBlock(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
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

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
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
		builder.add(FACING);
	}
}
