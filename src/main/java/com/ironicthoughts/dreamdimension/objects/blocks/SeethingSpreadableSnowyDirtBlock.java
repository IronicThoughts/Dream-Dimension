package com.ironicthoughts.dreamdimension.objects.blocks;

/*public class SeethingSpreadableSnowyDirtBlock extends SpreadableSnowyDirtBlock {
	protected SeethingSpreadableSnowyDirtBlock(Block.Properties builder) {
	      super(builder);
	   }
	private static boolean func_220257_b(BlockState p_220257_0_, IWorldReader p_220257_1_, BlockPos p_220257_2_) {
	      BlockPos blockpos = p_220257_2_.up();
	      BlockState blockstate = p_220257_1_.getBlockState(blockpos);
	      if (blockstate.getBlock() == Blocks.SNOW && blockstate.get(SnowBlock.LAYERS) == 1) {
	         return true;
	      } else {
	         int i = LightEngine.func_215613_a(p_220257_1_, p_220257_0_, p_220257_2_, blockstate, blockpos, Direction.UP, blockstate.getOpacity(p_220257_1_, blockpos));
	         return i < p_220257_1_.getMaxLightLevel();
	      }
	   }
	
	   private static boolean func_220256_c(BlockState p_220256_0_, IWorldReader p_220256_1_, BlockPos p_220256_2_) {
		      BlockPos blockpos = p_220256_2_.up();
		      return func_220257_b(p_220256_0_, p_220256_1_, p_220256_2_) && !p_220256_1_.getFluidState(blockpos).isTagged(FluidTags.WATER);
		   }
	   
	   public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
	      if (!func_220257_b(state, worldIn, pos)) {
	         if (!worldIn.isAreaLoaded(pos, 3)) return;
	         worldIn.setBlockState(pos, BlockInit.SEETHING_DIRT.get().getDefaultState());
	      } else {
	         if (worldIn.getLight(pos.up()) >= 9) {
	            BlockState blockstate = this.getDefaultState();

	            for(int i = 0; i < 4; ++i) {
	               BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
	               if (worldIn.getBlockState(blockpos).getBlock() == BlockInit.SEETHING_DIRT.get() && func_220256_c(blockstate, worldIn, blockpos)) {
	                  worldIn.setBlockState(blockpos, blockstate.with(SNOWY, Boolean.valueOf(worldIn.getBlockState(blockpos.up()).getBlock() == Blocks.SNOW)));
	               }
	            }
	         }

	      }
	   }
	}*/