package com.ironicthoughts.dreamdimension.init;

import com.ironicthoughts.dreamdimension.DreamDimension;
import com.ironicthoughts.dreamdimension.world.biomes.DreadfulUpland;
import com.ironicthoughts.dreamdimension.world.biomes.DreadfulUplandSurfaceBuilder;
import com.ironicthoughts.dreamdimension.world.biomes.EnlightenedWoods;
import com.ironicthoughts.dreamdimension.world.biomes.EnlightenedWoodsSurfaceBuilder;
import com.ironicthoughts.dreamdimension.world.biomes.EnviousRainforest;
import com.ironicthoughts.dreamdimension.world.biomes.EnviousRainforestSurfaceBuilder;
import com.ironicthoughts.dreamdimension.world.biomes.JoyfulPlains;
import com.ironicthoughts.dreamdimension.world.biomes.JoyfulPlainsSurfaceBuilder;
import com.ironicthoughts.dreamdimension.world.biomes.LustfulFlatland;
import com.ironicthoughts.dreamdimension.world.biomes.LustfulFlatlandSurfaceBuilder;
import com.ironicthoughts.dreamdimension.world.biomes.MelancholyMeadow;
import com.ironicthoughts.dreamdimension.world.biomes.MelancholyMeadowSurfaceBuilder;
import com.ironicthoughts.dreamdimension.world.biomes.NightmareForest;
import com.ironicthoughts.dreamdimension.world.biomes.NightmareForestSurfaceBuilder;
import com.ironicthoughts.dreamdimension.world.biomes.SeethingWoodland;
import com.ironicthoughts.dreamdimension.world.biomes.SeethingWoodlandSurfaceBuilder;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES,
			DreamDimension.MOD_ID);

	// Seething Woodland or Anger
	public static final RegistryObject<Biome> SEETHING_WOODLAND = BIOMES.register("seething_woodland",
			() -> new SeethingWoodland(new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.FOREST)
					.depth(0.1F).scale(0.2F).temperature(1.0F).downfall(0.1F).waterColor(0xD56F3E)
					.waterFogColor(0xFFBA9B).parent((String) null)
					.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
						register("seething_surface", new SeethingWoodlandSurfaceBuilder(
						SurfaceBuilderConfig::deserialize)),
						new SurfaceBuilderConfig(Blocks.DIRT.getDefaultState(),
								Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())))));

	// Melancholy Meadow or Sadness
	public static final RegistryObject<Biome> MELANCHOLY_MEADOW = BIOMES.register("melancholy_meadow",
			() -> new MelancholyMeadow(new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.PLAINS)
					.depth(0.1F).scale(0.2F).temperature(0.4F).downfall(1.0F).waterColor(0x32DCAE)
					.waterFogColor(0x9FEBD6).parent((String) null)
					.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
						register("melancholy_surface", new MelancholyMeadowSurfaceBuilder(
						SurfaceBuilderConfig::deserialize)),
						new SurfaceBuilderConfig(Blocks.DIRT.getDefaultState(),
								Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())))));
	
	// Lustful Flatland or Love
	public static final RegistryObject<Biome> LUSTFUL_FLATLAND = BIOMES.register("lustful_flatland",
			() -> new LustfulFlatland(new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.PLAINS)
					.depth(0.1F).scale(0.2F).temperature(0.4F).downfall(1.0F).waterColor(0xEB3C66)
					.waterFogColor(0xF896AE).parent((String) null)
					.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
						register("lustful_surface", new LustfulFlatlandSurfaceBuilder(
						SurfaceBuilderConfig::deserialize)),
						new SurfaceBuilderConfig(Blocks.DIRT.getDefaultState(),
								Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())))));
	
	// Joyful Plains or Happiness
	public static final RegistryObject<Biome> JOYFUL_PLAINS = BIOMES.register("joyful_plains",
			() -> new JoyfulPlains(new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.PLAINS)
					.depth(0.1F).scale(0.2F).temperature(0.4F).downfall(1.0F).waterColor(0xEDDA44)
					.waterFogColor(0xFFF393).parent((String) null)
					.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
						register("joyful_surface", new JoyfulPlainsSurfaceBuilder(
						SurfaceBuilderConfig::deserialize)),
						new SurfaceBuilderConfig(Blocks.DIRT.getDefaultState(),
								Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())))));
	
	// Envious Rainforest or Jealousy
		public static final RegistryObject<Biome> ENVIOUS_RAINFOREST = BIOMES.register("envious_rainforest",
				() -> new EnviousRainforest(new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.JUNGLE)
						.depth(0.1F).scale(0.2F).temperature(0.4F).downfall(1.0F).waterColor(0x479940)
						.waterFogColor(0x92C78E).parent((String) null)
						.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
							register("envious_surface", new EnviousRainforestSurfaceBuilder(
							SurfaceBuilderConfig::deserialize)),
							new SurfaceBuilderConfig(Blocks.DIRT.getDefaultState(),
									Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())))));
		
	// Dreadful Upland or Fear
	public static final RegistryObject<Biome> DREADFUL_UPLAND = BIOMES.register("dreadful_upland",
			() -> new DreadfulUpland(new Biome.Builder().precipitation(Biome.RainType.SNOW).category(Biome.Category.EXTREME_HILLS)
					.depth(0.1F).scale(0.2F).temperature(0.4F).downfall(1.0F).waterColor(0x545454)
					.waterFogColor(0xb6b6b6).parent((String) null)
					.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
						register("dreadful_surface", new DreadfulUplandSurfaceBuilder(
						SurfaceBuilderConfig::deserialize)),
						new SurfaceBuilderConfig(Blocks.DIRT.getDefaultState(),
								Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())))));
	
	// Nightmare Forest or Nightmare Biome
		public static final RegistryObject<Biome> NIGHTMARE_FOREST = BIOMES.register("nightmare_forest",
				() -> new NightmareForest(new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.FOREST)
						.depth(0.1F).scale(0.2F).temperature(0.4F).downfall(1.0F).waterColor(0x890000)
						.waterFogColor(0x683026).parent((String) null)
						.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
							register("nightmare_surface", new NightmareForestSurfaceBuilder(
							SurfaceBuilderConfig::deserialize)),
							new SurfaceBuilderConfig(Blocks.DIRT.getDefaultState(),
									Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())))));
	
	// Enlightened Woods or Dream Biome
		public static final RegistryObject<Biome> ENLIGHTENED_WOODS = BIOMES.register("enlightened_woods",
				() -> new EnlightenedWoods(new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST)
						.depth(0.1F).scale(0.2F).temperature(0.4F).downfall(1.0F).waterColor(0x004DFF)
						.waterFogColor(0x7C9FEF).parent((String) null)
						.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
							register("enlightened_surface", new EnlightenedWoodsSurfaceBuilder(
							SurfaceBuilderConfig::deserialize)),
							new SurfaceBuilderConfig(Blocks.DIRT.getDefaultState(),
									Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())))));
	
	public static void registerBiomes() {
		registerBiome(SEETHING_WOODLAND.get(), Type.HOT, Type.DRY, Type.FOREST, Type.WASTELAND, Type.SPOOKY);
		registerBiome(MELANCHOLY_MEADOW.get(), Type.COLD, Type.WET, Type.PLAINS);
		registerBiome(LUSTFUL_FLATLAND.get(), Type.HOT, Type.LUSH);
		registerBiome(JOYFUL_PLAINS.get(), Type.DRY, Type.PLAINS);
		registerBiome(ENVIOUS_RAINFOREST.get(), Type.LUSH, Type.JUNGLE, Type.DENSE, Type.HOT, Type.WET);
		registerBiome(DREADFUL_UPLAND.get(), Type.MOUNTAIN, Type.COLD, Type.SNOWY, Type.WASTELAND);
		registerBiome(NIGHTMARE_FOREST.get(), Type.FOREST, Type.DEAD, Type.RARE, Type.WASTELAND, Type.SPARSE, Type.SPOOKY);
		registerBiome(ENLIGHTENED_WOODS.get(), Type.FOREST, Type.LUSH, Type.RARE, Type.DENSE);
	}

	private static void registerBiome(Biome biome, Type... types) {
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
		return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
	}
}