package com.ironicthoughts.dreamdimension.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.potion.Effect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class ModFlowerBlock extends ModBushBlock {
   protected static final VoxelShape SHAPE = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D);
   private final Effect stewEffect;
   private final int stewEffectDuration;

   public ModFlowerBlock(Effect p_i49984_1_, int effectDuration, Properties properties) {
      super(properties);
      this.stewEffect = p_i49984_1_;
      if (p_i49984_1_.isInstant()) {
         this.stewEffectDuration = effectDuration;
      } else {
         this.stewEffectDuration = effectDuration * 20;
      }

   }

   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
      Vec3d vec3d = state.getOffset(worldIn, pos);
      return SHAPE.withOffset(vec3d.x, vec3d.y, vec3d.z);
   }

   public Block.OffsetType getOffsetType() {
      return Block.OffsetType.XZ;
   }

   public Effect getStewEffect() {
      return this.stewEffect;
   }

   public int getStewEffectDuration() {
      return this.stewEffectDuration;
   }
}