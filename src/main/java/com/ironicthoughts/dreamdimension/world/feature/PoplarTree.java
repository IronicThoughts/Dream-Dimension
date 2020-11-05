package com.ironicthoughts.dreamdimension.world.feature;

import java.util.Random;

import net.minecraft.block.trees.BigTree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.HugeTreeFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class PoplarTree extends BigTree {

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.NORMAL_TREE.withConfiguration(DefaultModBiomeFeatures.POPLAR_TREE_CONFIG);
	}

	@Override
	protected ConfiguredFeature<HugeTreeFeatureConfig, ?> getHugeTreeFeature(Random randomIn) {
		return Feature.MEGA_JUNGLE_TREE.withConfiguration(DefaultModBiomeFeatures.MEGA_POPLAR_TREE_CONFIG);
	}

	protected void canBeReplacedByLogs() {
	}
}