package com.ironicthoughts.dreamdimension.world.biomes;

import com.ironicthoughts.dreamdimension.world.feature.DefaultModBiomeFeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;

public class EnviousRainforest extends Biome {

	public EnviousRainforest(Builder biomeBuilder) {
		super(biomeBuilder);
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultBiomeFeatures.addSedimentDisks(this);		
		DefaultModBiomeFeatures.addEnviousTrees(this);
		//DefaultModBiomeFeatures.addEnviousGrass(this);
		DefaultModBiomeFeatures.addModOres(this);
		DefaultModBiomeFeatures.addExtraApatiteOre(this);
	}

	@Override
	public int getGrassColor(double posX, double posZ) {
		return 0x43CC7F;
	}

	@Override                                        
	public int getFoliageColor() {
		return 0x43CC7F;
	}
}