package com.ironicthoughts.dreamdimension.world.biomes;

import com.ironicthoughts.dreamdimension.world.feature.DefaultModBiomeFeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;

public class MelancholyMeadow extends Biome {

	public MelancholyMeadow(Builder biomeBuilder) {
		super(biomeBuilder);
		
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addSprings(this);
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addJungleGrass(this);
		DefaultBiomeFeatures.addSedimentDisks(this);
		DefaultModBiomeFeatures.addMelancholyTrees(this);
		DefaultModBiomeFeatures.addMelancholyGrass(this);
		DefaultModBiomeFeatures.addModOres(this);
		DefaultModBiomeFeatures.addExtraJetOre(this);
	}

	@Override
	public int getGrassColor(double posX, double posZ) {
		return 0x38575F;
	}

	@Override
	public int getFoliageColor() {
		return 0x38575F;
	}
}