package com.ironicthoughts.dreamdimension.init;

import java.util.function.Supplier;

import com.ironicthoughts.dreamdimension.DreamDimension;
import com.ironicthoughts.dreamdimension.DreamDimension.DreamItemGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = DreamDimension.MOD_ID, bus = Bus.MOD)
@ObjectHolder(DreamDimension.MOD_ID)
public class ItemInitOld {

	// Sticks
	public static final Item DREAM_STICK = null;
	public static final Item NIGHTMARE_STICK = null;

	// Ingots and Gems
	public static final Item SHUNGITE_INGOT = null;
	public static final Item JET_INGOT = null;
	public static final Item CHRYSOLITE = null;
	public static final Item APATITE = null;
	public static final Item WHITE_ONYX_INGOT = null;
	public static final Item TOPAZ = null;

	// Tools
	public static final Item SHUNGITE_SWORD = null;
	public static final Item JET_SWORD = null;
	public static final Item CHRYSOLITE_SWORD = null;
	public static final Item APATITE_SWORD = null;
	public static final Item WHITE_ONYX_SWORD = null;
	public static final Item TOPAZ_SWORD = null;
	
	public static final Item SHUNGITE_PICKAXE = null;
	public static final Item JET_PICKAXE = null;
	public static final Item CHRYSOLITE_PICKAXE = null;
	public static final Item APATITE_PICKAXE = null;
	public static final Item WHITE_ONYX_PIACKAXE = null;
	public static final Item TOPAZ_PICKAXE = null;
	
	public static final Item SHUNGITE_AXE = null;
	public static final Item JET_AXE = null;
	public static final Item CHRYSOLITE_AXE = null;
	public static final Item APATITE_AXE = null;
	public static final Item WHITE_ONYX_AXE = null;
	public static final Item TOPAZ_AXE = null;
	
	public static final Item SHUNGITE_SHOVEL = null;
	public static final Item JET_SHOVEL = null;
	public static final Item CHRYSOLITE_SHOVEL = null;
	public static final Item APATITE_SHOVEL = null;
	public static final Item WHITE_ONYX_SHOVEL = null;
	public static final Item TOPAZ_SHOVEL = null;
	
	public static final Item SHUNGITE_HOE = null;
	public static final Item JET_HOE = null;
	public static final Item CHRYSOLITE_HOE = null;
	public static final Item APATITE_HOE = null;
	public static final Item WHITE_ONYX_HOE = null;
	public static final Item TOPAZ_HOE = null;

	// Armour
	public static final Item SHUNGITE_HELMET = null;
	public static final Item JET_HELMET = null;
	public static final Item CHRYSOLITE_HELMET = null;
	public static final Item APATITE_HELMET = null;
	public static final Item WHITE_ONYX_HELMET = null;
	public static final Item TOPAZ_HELMET = null;

	public static final Item SHUNGITE_CHESTPLATE = null;
	public static final Item JET_CHESTPLATE = null;
	public static final Item CHRYSOLITE_CHESTPLATE = null;
	public static final Item APATITE_CHESTPLATE = null;
	public static final Item WHITE_ONYX_CHESTPLATE = null;
	public static final Item TOPAZ_CHESTPLATE = null;
	
	public static final Item SHUNGITE_LEGGINGS = null;
	public static final Item JET_LEGGINGS = null;
	public static final Item CHRYSOLITE_LEGGINGS = null;
	public static final Item APATITE_LEGGINGS = null;
	public static final Item WHITE_ONYX_LEGGINGS = null;
	public static final Item TOPAZ_LEGGINGS = null;
	
	public static final Item SHUNGITE_BOOTS = null;
	public static final Item JET_BOOTS = null;
	public static final Item CHRYSOLITE_BOOTS = null;
	public static final Item APATITE_BOOTS = null;
	public static final Item WHITE_ONYX_BOOTS = null;
	public static final Item TOPAZ_BOOTS = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {

		// Sticks
		event.getRegistry().register(new Item(new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("dream_stick"));
		event.getRegistry().register(new Item(new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("nightmare_stick"));

		// Ingots and Gems
		event.getRegistry().register(new Item(new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite"));
		event.getRegistry().register(new Item(new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite"));
		event.getRegistry().register(new Item(new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_ingot"));
		event.getRegistry().register(new Item(new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz"));

		// Tools
		event.getRegistry().register(new SwordItem(ModItemTier.SHUNGITE, 7, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_sword"));
		event.getRegistry().register(new SwordItem(ModItemTier.JET, 7, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_sword"));
		event.getRegistry().register(new SwordItem(ModItemTier.CHRYSOLITE, 7, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite_sword"));
		event.getRegistry().register(new SwordItem(ModItemTier.APATITE, 7, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite_sword"));
		event.getRegistry().register(new SwordItem(ModItemTier.WHITE_ONYX, 7, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_sword"));
		event.getRegistry().register(new SwordItem(ModItemTier.TOPAZ, 7, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz_sword"));

		event.getRegistry().register(new PickaxeItem(ModItemTier.SHUNGITE, 4, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_pickaxe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.JET, 4, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_pickaxe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.CHRYSOLITE, 4, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite_pickaxe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.APATITE, 4, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite_pickaxe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.WHITE_ONYX, 4, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_pickaxe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.TOPAZ, 4, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz_pickaxe"));

		event.getRegistry().register(new AxeItem(ModItemTier.SHUNGITE, 11, 3.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_axe"));
		event.getRegistry().register(new AxeItem(ModItemTier.JET, 11, 3.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_axe"));
		event.getRegistry().register(new AxeItem(ModItemTier.CHRYSOLITE, 11, 3.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite_axe"));
		event.getRegistry().register(new AxeItem(ModItemTier.APATITE, 11, 3.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite_axe"));
		event.getRegistry().register(new AxeItem(ModItemTier.WHITE_ONYX, 11, 3.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_axe"));
		event.getRegistry().register(new AxeItem(ModItemTier.TOPAZ, 11, 3.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz_axe"));

		event.getRegistry().register(new ShovelItem(ModItemTier.SHUNGITE, 2, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_shovel"));
		event.getRegistry().register(new ShovelItem(ModItemTier.JET, 2, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_shovel"));
		event.getRegistry().register(new ShovelItem(ModItemTier.CHRYSOLITE, 2, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite_shovel"));
		event.getRegistry().register(new ShovelItem(ModItemTier.APATITE, 2, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite_shovel"));
		event.getRegistry().register(new ShovelItem(ModItemTier.WHITE_ONYX, 2, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_shovel"));
		event.getRegistry().register(new ShovelItem(ModItemTier.TOPAZ, 2, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz_shovel"));

		event.getRegistry().register(new HoeItem(ModItemTier.SHUNGITE, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_hoe"));
		event.getRegistry().register(new HoeItem(ModItemTier.JET, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_hoe"));
		event.getRegistry().register(new HoeItem(ModItemTier.CHRYSOLITE, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite_hoe"));
		event.getRegistry().register(new HoeItem(ModItemTier.APATITE, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite_hoe"));
		event.getRegistry().register(new HoeItem(ModItemTier.WHITE_ONYX, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_hoe"));
		event.getRegistry().register(new HoeItem(ModItemTier.TOPAZ, 5.0f, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz_hoe"));

		// Armour
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SHUNGITE, EquipmentSlotType.HEAD, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.JET, EquipmentSlotType.HEAD, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.CHRYSOLITE, EquipmentSlotType.HEAD, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.APATITE, EquipmentSlotType.HEAD, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.WHITE_ONYX, EquipmentSlotType.HEAD, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz_helmet"));

		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SHUNGITE, EquipmentSlotType.CHEST, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.JET, EquipmentSlotType.CHEST, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.CHRYSOLITE, EquipmentSlotType.CHEST, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.APATITE, EquipmentSlotType.CHEST, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.WHITE_ONYX, EquipmentSlotType.CHEST, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz_chestplate"));

		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SHUNGITE, EquipmentSlotType.LEGS, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.JET, EquipmentSlotType.LEGS, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.CHRYSOLITE, EquipmentSlotType.LEGS, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.APATITE, EquipmentSlotType.LEGS, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.WHITE_ONYX, EquipmentSlotType.LEGS, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz_leggings"));

		event.getRegistry().register(new ArmorItem(ModArmorMaterial.SHUNGITE, EquipmentSlotType.FEET, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("shungite_boots"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.JET, EquipmentSlotType.FEET, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("jet_boots"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.CHRYSOLITE, EquipmentSlotType.FEET, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("chrysolite_boots"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.APATITE, EquipmentSlotType.FEET, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("apatite_boots"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.WHITE_ONYX, EquipmentSlotType.FEET, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("white_onyx_boots"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.TOPAZ, EquipmentSlotType.FEET, new Item.Properties().group(DreamItemGroup.DREAM)).setRegistryName("topaz_boots"));

	}

	public enum ModItemTier implements IItemTier {
		// harvestLevel, maxUses, efficiency, attackDamage, enchantability
		SHUNGITE(3, 1854, 10.0F, 3.0F, 13, () -> {
			return Ingredient.fromItems(ItemInitOld.SHUNGITE_INGOT);
		}),
		JET(3, 895, 15.0F, 1.5F, 9, () -> {
			return Ingredient.fromItems(ItemInitOld.JET_INGOT);
		}),
		CHRYSOLITE(3, 1346, 8.0F, 4.5F, 11, () -> {
			return Ingredient.fromItems(ItemInitOld.CHRYSOLITE);
		}),
		APATITE(3, 764, 14.0F, 6.5F, 13, () -> {
			return Ingredient.fromItems(ItemInitOld.APATITE);
		}),
		WHITE_ONYX(3, 2016, 9.0F, 4.0F, 15, () -> {
			return Ingredient.fromItems(ItemInitOld.WHITE_ONYX_INGOT);
		}),
		TOPAZ(3, 1638, 7.0F, 5.6F, 8, () -> {
			return Ingredient.fromItems(ItemInitOld.TOPAZ);
		});
		
		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;

		private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
				Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
	}

	public enum ModArmorMaterial implements IArmorMaterial {
		// Max Damage Factor, Damage Reduction Array, Enchantability, Sound Event, Toughness
		SHUNGITE(DreamDimension.MOD_ID + ":shungite", 45, new int[] { 5, 8, 10, 5 }, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F, () -> {
			return Ingredient.fromItems(ItemInitOld.SHUNGITE_INGOT);
				}),
		JET(DreamDimension.MOD_ID + ":jet", 60, new int[] { 7, 10, 12, 7 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F, () -> {
			return Ingredient.fromItems(ItemInitOld.JET_INGOT);
				}),
		CHRYSOLITE(DreamDimension.MOD_ID + ":chrysolite", 30, new int[] { 3, 6, 8, 3 }, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F, () -> {
			return Ingredient.fromItems(ItemInitOld.CHRYSOLITE);
				}),
		APATITE(DreamDimension.MOD_ID + ":apatite", 28, new int[] { 2, 5, 7, 2 }, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F, () -> {
			return Ingredient.fromItems(ItemInitOld.APATITE);
				}),
		WHITE_ONYX(DreamDimension.MOD_ID + ":white_onyx", 35, new int[] { 3, 6, 8, 3 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5F, () -> {
			return Ingredient.fromItems(ItemInitOld.WHITE_ONYX_INGOT);
				}),
		TOPAZ(DreamDimension.MOD_ID + ":topaz", 35, new int[] { 3, 6, 8, 3 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F, () -> {
			return Ingredient.fromItems(ItemInitOld.TOPAZ);
				});
		
		private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 18, 19, 14 };
		private final String name;
		private final int maxDamageFactor;
		private final int[] damageReductionAmountArray;
		private final int enchantability;
		private final SoundEvent soundEvent;
		private final float toughness;
		private final LazyValue<Ingredient> repairMaterial;

		private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
				int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
				Supplier<Ingredient> repairMaterialIn) {
			this.name = nameIn;
			this.maxDamageFactor = maxDamageFactorIn;
			this.damageReductionAmountArray = damageReductionAmountIn;
			this.enchantability = enchantabilityIn;
			this.soundEvent = soundEventIn;
			this.toughness = toughnessIn;
			this.repairMaterial = new LazyValue<>(repairMaterialIn);
		}

		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return this.damageReductionAmountArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return this.soundEvent;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public float getToughness() {
			return this.toughness;
		}
	}
}