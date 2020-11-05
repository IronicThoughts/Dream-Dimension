package com.ironicthoughts.dreamdimension.init;

import com.ironicthoughts.dreamdimension.DreamDimension;
import com.ironicthoughts.dreamdimension.world.dimension.DreamModDimension;

import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {
	public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, DreamDimension.MOD_ID);
	
	public static final RegistryObject<ModDimension> DREAM_DIMENSION = MOD_DIMENSIONS.register("dream", () -> new DreamModDimension());
}