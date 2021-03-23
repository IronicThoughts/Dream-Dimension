package com.ironicthoughts.dreamdimension.world.biomes;

import com.ironicthoughts.dreamdimension.world.feature.DefaultModBiomeFeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;

public class NightmarishWastelands extends Biome {

	public NightmarishWastelands(Builder biomeBuilder) {
		super(biomeBuilder);
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addSprings(this);
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultModBiomeFeatures.addNightmareTrees(this);
		DefaultBiomeFeatures.addSedimentDisks(this);
		DefaultModBiomeFeatures.addModOres(this);
	}

	@Override
	public int getGrassColor(double posX, double posZ) {
		return 0x4d4841;
	}

	@Override
	public int getFoliageColor() {
		return 0x977E59;
	}
}