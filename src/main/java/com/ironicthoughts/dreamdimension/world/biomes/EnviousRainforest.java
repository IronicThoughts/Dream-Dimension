package com.ironicthoughts.dreamdimension.world.biomes;

import com.ironicthoughts.dreamdimension.world.feature.DefaultModBiomeFeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;

public class EnviousRainforest extends Biome {

	public EnviousRainforest(Builder biomeBuilder) {
		super(biomeBuilder);
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addSprings(this);
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultBiomeFeatures.addSedimentDisks(this);		
		DefaultModBiomeFeatures.addEnviousTrees(this);
		DefaultModBiomeFeatures.addModOres(this);
		DefaultModBiomeFeatures.addExtraApatiteOre(this);
		DefaultModBiomeFeatures.addEnviousBushes(this);
	}

	@Override
	public int getGrassColor(double posX, double posZ) {
		return 0x5f803b;
	}

	@Override                                        
	public int getFoliageColor() {
		return 0x5f803b;
	}
}