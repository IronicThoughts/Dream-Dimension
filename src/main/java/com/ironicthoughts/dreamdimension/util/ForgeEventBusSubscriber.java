package com.ironicthoughts.dreamdimension.util;

import com.ironicthoughts.dreamdimension.DreamDimension;
import com.ironicthoughts.dreamdimension.init.DimensionInit;

import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DreamDimension.MOD_ID, bus = Bus.FORGE)
public class ForgeEventBusSubscriber {

	@SubscribeEvent
	public static void registerDimensions(final RegisterDimensionsEvent event) {
		if (DimensionType.byName(DreamDimension.DREAM_DIMENSION_TYPE) == null) {
			DimensionManager.registerDimension(DreamDimension.DREAM_DIMENSION_TYPE, DimensionInit.DREAM_DIMENSION.get(), null,
					true);
		}
		DreamDimension.LOGGER.info("Dimensions Registered!");
	}
}