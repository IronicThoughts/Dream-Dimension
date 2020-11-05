package com.ironicthoughts.dreamdimension.world.biomes;

import com.ironicthoughts.dreamdimension.world.feature.DefaultModBiomeFeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;

public class JoyfulPlains extends Biome {

	public JoyfulPlains(Builder biomeBuilder) {
		super(biomeBuilder);
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultBiomeFeatures.addSedimentDisks(this);
		DefaultModBiomeFeatures.addJoyfulTrees(this);
		//DefaultModBiomeFeatures.addJoyfulGrass(this);
		DefaultModBiomeFeatures.addModOres(this);
		DefaultModBiomeFeatures.addExtraChrysoliteOre(this);
	}

	@Override
	public int getGrassColor(double posX, double posZ) {
		return 0xFFF6B0;
	}

	@Override
	public int getFoliageColor() {
		return 0xFFF6B0;
	}
}