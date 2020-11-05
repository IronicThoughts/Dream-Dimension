package com.ironicthoughts.dreamdimension.init;

import com.ironicthoughts.dreamdimension.DreamDimension;
import com.ironicthoughts.dreamdimension.DreamDimension.DreamItemGroup;

import net.minecraft.item.Item;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			DreamDimension.MOD_ID);
	
	public static final RegistryObject<WallOrFloorItem> DREAM_TORCH = ITEMS.register("dream_torch", () -> new WallOrFloorItem(BlockInit.DREAM_TORCH.get(), BlockInit.DREAM_WALL_TORCH.get(), new Item.Properties().group(DreamItemGroup.DREAM)));
	public static final RegistryObject<WallOrFloorItem> NIGHTMARE_TORCH = ITEMS.register("nightmare_torch", () -> new WallOrFloorItem(BlockInit.NIGHTMARE_TORCH.get(), BlockInit.NIGHTMARE_WALL_TORCH.get(), new Item.Properties().group(DreamItemGroup.DREAM)));

}