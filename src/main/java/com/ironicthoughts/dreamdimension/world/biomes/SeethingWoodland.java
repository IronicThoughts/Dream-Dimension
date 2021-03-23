package com.ironicthoughts.dreamdimension.world.biomes;

import com.ironicthoughts.dreamdimension.world.feature.DefaultModBiomeFeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;

public class SeethingWoodland extends Biome {

	public SeethingWoodland(Builder biomeBuilder) {
		super(biomeBuilder);
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addSprings(this);
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultBiomeFeatures.addSedimentDisks(this);
		DefaultModBiomeFeatures.addSeethingTrees(this);
		DefaultModBiomeFeatures.addSeethingGrass(this);
		DefaultModBiomeFeatures.addModOres(this);
		DefaultModBiomeFeatures.addExtraShungiteOre(this);
	}

	public int getGrassColor(double posX, double posZ) {
		return 0x741500;
	}

	@Override
	public int getFoliageColor() {
		return 0x741500;
	}
}