package com.ironicthoughts.dreamdimension.events;

import com.ironicthoughts.dreamdimension.DreamDimension;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DreamDimension.MOD_ID, bus = Bus.FORGE)
public class dreamDimensionTeleport {
	
	@SubscribeEvent
	public static void dreamDimensionTeleport(PlayerSleepInBedEvent event) {
		DreamDimension.LOGGER.info("Sleep Event Fired!");
		PlayerEntity playerEntity = event.getPlayer();
		Entity entity = playerEntity.changeDimension(DimensionType.THE_END);
	}
}
