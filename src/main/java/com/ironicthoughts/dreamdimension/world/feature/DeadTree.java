package com.ironicthoughts.dreamdimension.world.feature;

import java.util.Random;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class DeadTree extends Tree {
	
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.FANCY_TREE.withConfiguration(DefaultModBiomeFeatures.DEAD_TREE_CONFIG);
	}
	
	protected void canBeReplacedByLogs() {
	}
}