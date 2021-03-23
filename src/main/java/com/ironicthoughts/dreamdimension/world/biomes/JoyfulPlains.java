package com.ironicthoughts.dreamdimension.world.biomes;

import javax.annotation.Nullable;

import com.ironicthoughts.dreamdimension.world.feature.DefaultModBiomeFeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.INoiseRandom;

public class JoyfulPlains extends Biome {

	public JoyfulPlains(Builder biomeBuilder) {
		super(biomeBuilder);

		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addPlainsTallGrass(this);
		DefaultBiomeFeatures.addSprings(this);
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultBiomeFeatures.addSedimentDisks(this);
		DefaultModBiomeFeatures.addJoyfulTrees(this);
		DefaultModBiomeFeatures.addJoyfulGrass(this);
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

	@Nullable
	public Biome getHill(INoiseRandom rand) {
		return null;
	}
}