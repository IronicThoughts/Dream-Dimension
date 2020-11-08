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
public class dreamTeleport extends DreamDimension {

	@SubscribeEvent
	public static void isDreaming(PlayerSleepInBedEvent event) {
		boolean isDreaming = Math.random() < 0.5;
		if (isDreaming == true) {
			PlayerEntity playerEntity = event.getPlayer();
			Entity entity = playerEntity.changeDimension(DimensionType.byName(DREAM));
			playerEntity.getEntityWorld().setDayTime(1000L);

			DreamDimension.LOGGER.info("Sleep Event Triggered!");
		} else {
			return;
		}
	}
}
