package com.ironicthoughts.dreamdimension.world.dimension;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class DreamBiomeProviderSettings implements IBiomeProviderSettings {

	private final long seed;
	private final WorldType worldType;
	private DreamGenSettings generatorSettings = new DreamGenSettings();

	public DreamBiomeProviderSettings(WorldInfo info) {
		this.seed = info.getSeed();
		this.worldType = info.getGenerator();
	}

	public DreamBiomeProviderSettings setGeneratorSettings(DreamGenSettings settings) {
		this.generatorSettings = settings;
		return this;
	}

	public long getSeed() {
		return this.seed;
	}

	public WorldType getWorldType() {
		return this.worldType;
	}

	public DreamGenSettings getGeneratorSettings() {
		return this.generatorSettings;
	}
}