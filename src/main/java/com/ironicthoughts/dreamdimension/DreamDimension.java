package com.ironicthoughts.dreamdimension;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ironicthoughts.dreamdimension.init.BiomeInit;
import com.ironicthoughts.dreamdimension.init.BlockInit;
import com.ironicthoughts.dreamdimension.init.DimensionInit;
import com.ironicthoughts.dreamdimension.init.ItemInit;
import com.ironicthoughts.dreamdimension.init.ItemInitOld;
import com.ironicthoughts.dreamdimension.objects.blocks.ModTorchBlock;
import com.ironicthoughts.dreamdimension.objects.blocks.ModWallTorchBlock;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("dreamdimension")
@Mod.EventBusSubscriber(modid = "dreamdimension", bus = Mod.EventBusSubscriber.Bus.MOD)
public class DreamDimension {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "dreamdimension";
	public static DreamDimension instance;
	public static final ResourceLocation DREAM_DIMENSION_TYPE = new ResourceLocation(MOD_ID, "dream");

	public DreamDimension() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::doClientStuff);

		ItemInit.ITEMS.register(modEventBus);
		BlockInit.BLOCKS.register(modEventBus);
		BiomeInit.BIOMES.register(modEventBus);
		DimensionInit.MOD_DIMENSIONS.register(modEventBus);
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)
		.filter(block -> !(block instanceof ModWallTorchBlock)
				&& !(block instanceof ModTorchBlock))
		.forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(DreamItemGroup.DREAM);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		LOGGER.debug("Registered Block Items!");
	}

	@SubscribeEvent
	public static void onRegisterBiome(final RegistryEvent.Register<Biome> event) {
		BiomeInit.registerBiomes();
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	private void doClientStuff(final FMLClientSetupEvent event) {

	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {

	}

	public static class DreamItemGroup extends ItemGroup {
		public static final DreamItemGroup DREAM = new DreamItemGroup(ItemGroup.GROUPS.length, "Dream Dimension");

		private DreamItemGroup(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemInitOld.SHUNGITE_SWORD, hasSearchBar(true));
		}

		private int hasSearchBar(boolean b) {
			return 1;
		}
	}
}
