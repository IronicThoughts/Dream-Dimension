package com.ironicthoughts.dreamdimension.world.biomes;

import com.ironicthoughts.dreamdimension.world.feature.DefaultModBiomeFeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;

public class LustfulFlatland extends Biome {

	public LustfulFlatland(Builder biomeBuilder) {
		super(biomeBuilder);
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultBiomeFeatures.addSedimentDisks(this);
		DefaultModBiomeFeatures.addLustfulTrees(this);
		//DefaultModBiomeFeatures.addLustfulGrass(this);
		DefaultModBiomeFeatures.addModOres(this);
		DefaultModBiomeFeatures.addExtraTopazOre(this);
	}

	@Override
	public int getGrassColor(double posX, double posZ) {
		return 0xFF3792;
	}

	@Override
	public int getFoliageColor() {
		return 0xFF3792;
	}
}