package com.ironicthoughts.dreamdimension.world.gen;

import com.ironicthoughts.dreamdimension.init.BiomeInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreGen {
	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			if (biome == BiomeInit.SEETHING_WOODLAND.get() || biome == BiomeInit.MELANCHOLY_MEADOW.get() || biome == BiomeInit.LUSTFUL_FLATLAND.get() || biome == BiomeInit.JOYFUL_PLAINS.get() || biome == BiomeInit.ENVIOUS_RAINFOREST.get() || biome == BiomeInit.DREADFUL_UPLAND.get()) {
				ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure((new CountRangeConfig(20, 5, 5, 25)));
			}
		}
	}
}