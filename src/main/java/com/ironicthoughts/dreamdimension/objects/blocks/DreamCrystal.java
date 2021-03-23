package com.ironicthoughts.dreamdimension.objects.blocks;

import java.util.Random;
import java.util.stream.Stream;

import com.ironicthoughts.dreamdimension.init.ItemInitOld;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DreamCrystal extends Block {
	private int harvestLevel;
	public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
	public static final BooleanProperty LIT = BlockStateProperties.LIT;
	
	private static final VoxelShape SHAPE = Stream.of(
			Block.makeCuboidShape(7, 3.039999999999999, 6, 8, 11.989999999999998, 10),
			Block.makeCuboidShape(7, 4, 10, 8, 11, 11), Block.makeCuboidShape(7, 4, 5, 8, 11, 6),
			Block.makeCuboidShape(5.5, 3, 7.5, 9.5, 12, 8.5), Block.makeCuboidShape(9.5, 4, 7.5, 10.5, 11, 8.5),
			Block.makeCuboidShape(4.5, 4, 7.5, 5.5, 11, 8.5), Block.makeCuboidShape(6, 4, 6.5, 9, 11, 9.5),
			Block.makeCuboidShape(5, 5, 6.5, 10, 10, 9.5), Block.makeCuboidShape(6, 5, 5.5, 9, 10, 10.5)).reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

	public DreamCrystal(Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(POWERED, Boolean.valueOf(false)));
		this.setDefaultState(this.stateContainer.getBaseState().with(LIT, Boolean.valueOf(false)));
	}
	
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
	
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(LIT, Boolean.valueOf(false)).with(POWERED, Boolean.valueOf(false));
	}

	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(POWERED, LIT);
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
		if (rand.nextInt(100) == 0) {
			if(stateIn.get(LIT) == true) {
				worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_BEACON_AMBIENT, SoundCategory.BLOCKS, 0.5F, rand.nextFloat() * 0.4F + 0.8F, false);
			}
		}
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
}