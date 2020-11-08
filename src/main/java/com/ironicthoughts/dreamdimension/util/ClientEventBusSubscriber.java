package com.ironicthoughts.dreamdimension.util;

import com.ironicthoughts.dreamdimension.DreamDimension;
import com.ironicthoughts.dreamdimension.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DreamDimension.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		
		/*
		// Grass Blocks
		RenderTypeLookup.setRenderLayer(BlockInit.SEETHING_GRASS_BLOCK.get(), RenderType.getCutout());
		
		// Plants and Flowers
		RenderTypeLookup.setRenderLayer(BlockInit.SEETHING_PLANT.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.TORPID_GRASS.get(), RenderType.getCutout());

		RenderTypeLookup.setRenderLayer(BlockInit.MELANCHOLY_GRASS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MELANCHOLY_VINE.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WOEFUL_IVY.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WEEPING_WISTERIA.get(), RenderType.getCutout());

		RenderTypeLookup.setRenderLayer(BlockInit.LUSTFUL_IVY.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.LUSTFUL_LILY.get(), RenderType.getCutout());

		RenderTypeLookup.setRenderLayer(BlockInit.JOYFUL_GRASS.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JOYFUL_VINE.get(), RenderType.getCutout());

		RenderTypeLookup.setRenderLayer(BlockInit.ENVIOUS_VINE.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ENVIOUS_BUSH.get(), RenderType.getCutout());
		*/
		
		// Saplings
		RenderTypeLookup.setRenderLayer(BlockInit.RAJADO_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MAHOE_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.IVORY_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MAPLE_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.POPLAR_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.EBONY_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DEAD_SAPLING.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RUBBER_SAPLING.get(), RenderType.getCutout());
		
		// Doors
		RenderTypeLookup.setRenderLayer(BlockInit.RAJADO_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MAHOE_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.IVORY_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.MAPLE_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.POPLAR_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.EBONY_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DEAD_DOOR.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RUBBER_DOOR.get(), RenderType.getCutout());
		
		// Torches
		RenderTypeLookup.setRenderLayer(BlockInit.DREAM_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.NIGHTMARE_TORCH.get(), RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.DREAM_WALL_TORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.NIGHTMARE_WALL_TORCH.get(), RenderType.getCutout());
		
		// Ladders
		RenderTypeLookup.setRenderLayer(BlockInit.DREAM_LADDER.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.NIGHTMARE_LADDER.get(), RenderType.getCutout());
	}
}