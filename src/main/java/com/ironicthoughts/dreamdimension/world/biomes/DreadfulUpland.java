package com.ironicthoughts.dreamdimension.world.biomes;

import com.ironicthoughts.dreamdimension.world.feature.DefaultModBiomeFeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;

public class DreadfulUpland extends Biome {

	public DreadfulUpland(Builder biomeBuilder) {
		super(biomeBuilder);
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultBiomeFeatures.addSedimentDisks(this);
		DefaultModBiomeFeatures.addDreadfulTrees(this);
		DefaultModBiomeFeatures.addModOres(this);
		DefaultModBiomeFeatures.addExtraWhiteOnyxOre(this);
	}

	@Override
	public int getGrassColor(double posX, double posZ) {
		return 0x6D2FA4;
	}

	@Override
	public int getFoliageColor() {
		return 0x6D2FA4;
	}
}