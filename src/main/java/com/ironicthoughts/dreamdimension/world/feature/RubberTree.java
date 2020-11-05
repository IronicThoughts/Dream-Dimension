package com.ironicthoughts.dreamdimension.world.feature;

import java.util.Random;

import net.minecraft.block.trees.BigTree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.HugeTreeFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class RubberTree extends BigTree {

	   protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
	      return null;
	   }

	   protected ConfiguredFeature<HugeTreeFeatureConfig, ?> getHugeTreeFeature(Random p_225547_1_) {
	      return Feature.DARK_OAK_TREE.withConfiguration(DefaultModBiomeFeatures.RUBBER_TREE_CONFIG);
	   }
	}