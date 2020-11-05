package com.ironicthoughts.dreamdimension.init;

import com.ironicthoughts.dreamdimension.DreamDimension;
import com.ironicthoughts.dreamdimension.objects.blocks.ModDoorBlock;
import com.ironicthoughts.dreamdimension.objects.blocks.ModLadderBlock;
import com.ironicthoughts.dreamdimension.objects.blocks.ModPressurePlateBlock;
import com.ironicthoughts.dreamdimension.objects.blocks.ModSaplingBlock;
import com.ironicthoughts.dreamdimension.objects.blocks.ModTorchBlock;
import com.ironicthoughts.dreamdimension.objects.blocks.ModWallTorchBlock;
import com.ironicthoughts.dreamdimension.objects.blocks.ModWoodButtonBlock;
import com.ironicthoughts.dreamdimension.world.feature.DeadTree;
import com.ironicthoughts.dreamdimension.world.feature.EbonyTree;
import com.ironicthoughts.dreamdimension.world.feature.IvoryTree;
import com.ironicthoughts.dreamdimension.world.feature.MahoeTree;
import com.ironicthoughts.dreamdimension.world.feature.MapleTree;
import com.ironicthoughts.dreamdimension.world.feature.PoplarTree;
import com.ironicthoughts.dreamdimension.world.feature.RajadoTree;
import com.ironicthoughts.dreamdimension.world.feature.RubberTree;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			DreamDimension.MOD_ID);

	// Gem Blocks
	public static final RegistryObject<Block> SHUNGITE_BLOCK = BLOCKS.register("shungite_block", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> JET_BLOCK = BLOCKS.register("jet_block", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> CHRYSOLITE_BLOCK = BLOCKS.register("chrysolite_block", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> PURPLE_APATITE_BLOCK = BLOCKS.register("purple_apatite_block", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> WHITE_ONYX_BLOCK = BLOCKS.register("white_onyx_block", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));

	/*
	// Grass, Dirt, and Stone Blocks
	public static final RegistryObject<SeethingGrassBlock> SEETHING_GRASS_BLOCK = BLOCKS.register("seething_grass_block", () -> new SeethingGrassBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.RED_TERRACOTTA).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)));
	
	public static final RegistryObject<Block> SEETHING_DIRT = BLOCKS.register("seething_dirt", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(0.5F).sound(SoundType.GROUND)));
	
	public static final RegistryObject<Block> SEETHING_STONE = BLOCKS.register("seething_stone", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE)));
	*/
	// Ores
	public static final RegistryObject<OreBlock> SHUNGITE_ORE = BLOCKS.register("shungite_ore", () -> new OreBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<OreBlock> JET_ORE = BLOCKS.register("jet_ore", () -> new OreBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<OreBlock> CHRYSOLITE_ORE = BLOCKS.register("chrysolite_ore", () -> new OreBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<OreBlock> PURPLE_APATITE_ORE = BLOCKS.register("purple_apatite_ore", () -> new OreBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<OreBlock> WHITE_ONYX_ORE = BLOCKS.register("white_onyx_ore", () -> new OreBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	public static final RegistryObject<OreBlock> TOPAZ_ORE = BLOCKS.register("topaz_ore", () -> new OreBlock(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F).sound(SoundType.STONE)));
	
	/*
	// Cobblestone Blocks
	public static final RegistryObject<Block> SEETHING_COBBLESTONE = BLOCKS.register("seething_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(2.0F, 6.0F).sound(SoundType.STONE)));
	*/
	
	// Saplings and Leaves
	public static final RegistryObject<ModSaplingBlock> RAJADO_SAPLING = BLOCKS.register("rajado_sapling", () -> new ModSaplingBlock(() -> new RajadoTree(), Block.Properties.create(Material.PLANTS, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));
	public static final RegistryObject<ModSaplingBlock> MAHOE_SAPLING = BLOCKS.register("mahoe_sapling", () -> new ModSaplingBlock(() -> new MahoeTree(), Block.Properties.create(Material.PLANTS, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));
	public static final RegistryObject<ModSaplingBlock> IVORY_SAPLING = BLOCKS.register("ivory_sapling", () -> new ModSaplingBlock(() -> new IvoryTree(), Block.Properties.create(Material.PLANTS, MaterialColor.PINK_TERRACOTTA).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));
	public static final RegistryObject<ModSaplingBlock> MAPLE_SAPLING = BLOCKS.register("maple_sapling", () -> new ModSaplingBlock(() -> new MapleTree(), Block.Properties.create(Material.PLANTS, MaterialColor.YELLOW_TERRACOTTA).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));
	public static final RegistryObject<ModSaplingBlock> POPLAR_SAPLING = BLOCKS.register("poplar_sapling", () -> new ModSaplingBlock(() -> new PoplarTree(), Block.Properties.create(Material.PLANTS, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));
	public static final RegistryObject<ModSaplingBlock> EBONY_SAPLING = BLOCKS.register("ebony_sapling", () -> new ModSaplingBlock(() -> new EbonyTree(), Block.Properties.create(Material.PLANTS, MaterialColor.LIGHT_GRAY).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));
	public static final RegistryObject<ModSaplingBlock> DEAD_SAPLING = BLOCKS.register("dead_sapling", () -> new ModSaplingBlock(() -> new DeadTree(), Block.Properties.create(Material.PLANTS, MaterialColor.GRAY).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));
	public static final RegistryObject<ModSaplingBlock> RUBBER_SAPLING = BLOCKS.register("rubber_sapling", () -> new ModSaplingBlock(() -> new RubberTree(), Block.Properties.create(Material.PLANTS, MaterialColor.BROWN).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));

	public static final RegistryObject<LeavesBlock> RAJADO_LEAVES = BLOCKS.register("rajado_leaves", () -> new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.RED_TERRACOTTA).tickRandomly().notSolid().hardnessAndResistance(0.2F).sound(SoundType.PLANT)));
	public static final RegistryObject<LeavesBlock> MAHOE_LEAVES = BLOCKS.register("mahoe_leaves", () -> new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.BLUE_TERRACOTTA).tickRandomly().notSolid().hardnessAndResistance(0.2F).sound(SoundType.PLANT)));
	public static final RegistryObject<LeavesBlock> IVORY_LEAVES = BLOCKS.register("ivory_leaves", () -> new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.PINK_TERRACOTTA).tickRandomly().notSolid().hardnessAndResistance(0.2F).sound(SoundType.PLANT)));
	public static final RegistryObject<LeavesBlock> MAPLE_LEAVES = BLOCKS.register("maple_leaves", () -> new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.YELLOW_TERRACOTTA).tickRandomly().notSolid().hardnessAndResistance(0.2F).sound(SoundType.PLANT)));
	public static final RegistryObject<LeavesBlock> POPLAR_LEAVES = BLOCKS.register("poplar_leaves", () -> new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.GREEN_TERRACOTTA).tickRandomly().notSolid().hardnessAndResistance(0.2F).sound(SoundType.PLANT)));
	public static final RegistryObject<LeavesBlock> EBONY_LEAVES = BLOCKS.register("ebony_leaves", () -> new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.LIGHT_GRAY).tickRandomly().notSolid().hardnessAndResistance(0.2F).sound(SoundType.PLANT)));
	public static final RegistryObject<LeavesBlock> DEAD_LEAVES = BLOCKS.register("dead_leaves", () -> new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.GRAY).tickRandomly().notSolid().hardnessAndResistance(0.2F).sound(SoundType.PLANT)));
	public static final RegistryObject<LeavesBlock> RUBBER_LEAVES = BLOCKS.register("rubber_leaves", () -> new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.GREEN).tickRandomly().notSolid().hardnessAndResistance(0.2F).sound(SoundType.PLANT)));

	// Logs, Wood, Stripped Logs, and Stripped Wood
	public static final RegistryObject<LogBlock> RAJADO_LOG = BLOCKS.register("rajado_log", () -> new LogBlock(MaterialColor.RED_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> MAHOE_LOG = BLOCKS.register("mahoe_log", () -> new LogBlock(MaterialColor.BLUE_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> IVORY_LOG = BLOCKS.register("ivory_log", () -> new LogBlock(MaterialColor.PINK_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> MAPLE_LOG = BLOCKS.register("maple_log", () -> new LogBlock(MaterialColor.YELLOW_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> POPLAR_LOG = BLOCKS.register("poplar_log", () -> new LogBlock(MaterialColor.GREEN_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> EBONY_LOG = BLOCKS.register("ebony_log", () -> new LogBlock(MaterialColor.LIGHT_GRAY, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> DEAD_LOG = BLOCKS.register("dead_log", () -> new LogBlock(MaterialColor.GRAY, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> RUBBER_LOG = BLOCKS.register("rubber_log", () -> new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<LogBlock> RAJADO_WOOD = BLOCKS.register("rajado_wood", () -> new LogBlock(MaterialColor.RED_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> MAHOE_WOOD = BLOCKS.register("mahoe_wood", () -> new LogBlock(MaterialColor.BLUE_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> IVORY_WOOD = BLOCKS.register("ivory_wood", () -> new LogBlock(MaterialColor.PINK_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> MAPLE_WOOD = BLOCKS.register("maple_wood", () -> new LogBlock(MaterialColor.YELLOW_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> POPLAR_WOOD = BLOCKS.register("poplar_wood", () -> new LogBlock(MaterialColor.GREEN_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> EBONY_WOOD = BLOCKS.register("ebony_wood", () -> new LogBlock(MaterialColor.LIGHT_GRAY, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> DEAD_WOOD = BLOCKS.register("dead_wood", () -> new LogBlock(MaterialColor.GRAY, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> RUBBER_WOOD = BLOCKS.register("rubber_wood", () -> new LogBlock(MaterialColor.BROWN, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	
	/*public static final RegistryObject<LogBlock> STRIPPED_RAJADO_LOG = BLOCKS.register("stripped_rajado_log", () -> new LogBlock(MaterialColor.RED_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_MAHOE_LOG = BLOCKS.register("stripped_mahoe_log", () -> new LogBlock(MaterialColor.BLUE_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_IVORY_LOG = BLOCKS.register("stripped_ivory_log", () -> new LogBlock(MaterialColor.PINK_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_MAPLE_LOG = BLOCKS.register("stripped_maple_log", () -> new LogBlock(MaterialColor.YELLOW_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_POPLAR_LOG = BLOCKS.register("stripped_poplar_log", () -> new LogBlock(MaterialColor.GREEN_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_EBONY_LOG = BLOCKS.register("stripped_ebony_log", () -> new LogBlock(MaterialColor.LIGHT_GRAY, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_DEAD_LOG = BLOCKS.register("stripped_dead_log", () -> new LogBlock(MaterialColor.GRAY, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_RUBBER_LOG = BLOCKS.register("stripped_rubber_log", () -> new LogBlock(MaterialColor.PINK, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<LogBlock> STRIPPED_RAJADO_WOOD = BLOCKS.register("stripped_rajado_wood", () -> new LogBlock(MaterialColor.RED_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_MAHOE_WOOD = BLOCKS.register("stripped_mahoe_wood", () -> new LogBlock(MaterialColor.BLUE_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_IVORY_WOOD = BLOCKS.register("stripped_ivory_wood", () -> new LogBlock(MaterialColor.PINK_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_MAPLE_WOOD = BLOCKS.register("stripped_maple_wood", () -> new LogBlock(MaterialColor.YELLOW_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_POPLAR_WOOD = BLOCKS.register("stripped_poplar_wood", () -> new LogBlock(MaterialColor.GREEN_TERRACOTTA, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_EBONY_WOOD = BLOCKS.register("stripped_ebony_wood", () -> new LogBlock(MaterialColor.LIGHT_GRAY, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_DEAD_WOOD = BLOCKS.register("stripped_dead_wood", () -> new LogBlock(MaterialColor.GRAY, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<LogBlock> STRIPPED_RUBBER_WOOD = BLOCKS.register("stripped_rubber_wood", () -> new LogBlock(MaterialColor.PINK, Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)));
	*/
	
	// Plank Blocks
	public static final RegistryObject<Block> RAJADO_PLANKS = BLOCKS.register("rajado_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MAHOE_PLANKS = BLOCKS.register("mahoe_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.BLUE_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> IVORY_PLANKS = BLOCKS.register("ivory_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MAPLE_PLANKS = BLOCKS.register("maple_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.YELLOW_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> POPLAR_PLANKS = BLOCKS.register("poplar_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> EBONY_PLANKS = BLOCKS.register("ebony_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DEAD_PLANKS = BLOCKS.register("dead_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.GRAY).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> RUBBER_PLANKS = BLOCKS.register("rubber_planks", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.PINK).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)));

	// Wall Blocks
	//public static final RegistryObject<WallBlock> SEETHING_COBBLESTONE_WALL = BLOCKS.register("seething_cobblestone_wall", () -> new WallBlock(Block.Properties.from(BlockInit.SEETHING_COBBLESTONE.get())));
	
	// Stair Blocks
	//public static final RegistryObject<StairsBlock> SEETHING_STONE_STAIRS = BLOCKS.register("seething_stone_stairs", () -> new StairsBlock(() -> BlockInit.SEETHING_STONE.get().getDefaultState(), Block.Properties.from(BlockInit.SEETHING_STONE.get())));
	//public static final RegistryObject<StairsBlock> SEETHING_COBBLESTONE_STAIRS = BLOCKS.register("seething_cobblestone_stairs", () -> new StairsBlock(() -> BlockInit.SEETHING_COBBLESTONE.get().getDefaultState(), Block.Properties.from(BlockInit.SEETHING_COBBLESTONE.get())));
	public static final RegistryObject<StairsBlock> RAJADO_STAIRS = BLOCKS.register("rajado_stairs", () -> new StairsBlock(() -> BlockInit.RAJADO_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.RAJADO_PLANKS.get())));
	public static final RegistryObject<StairsBlock> MAHOE_STAIRS = BLOCKS.register("mahoe_stairs", () -> new StairsBlock(() -> BlockInit.MAHOE_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.MAHOE_PLANKS.get())));
	public static final RegistryObject<StairsBlock> IVORY_STAIRS = BLOCKS.register("ivory_stairs", () -> new StairsBlock(() -> BlockInit.IVORY_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.IVORY_PLANKS.get())));
	public static final RegistryObject<StairsBlock> MAPLE_STAIRS = BLOCKS.register("maple_stairs", () -> new StairsBlock(() -> BlockInit.MAPLE_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.MAPLE_PLANKS.get())));
	public static final RegistryObject<StairsBlock> POPLAR_STAIRS = BLOCKS.register("poplar_stairs", () -> new StairsBlock(() -> BlockInit.POPLAR_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.POPLAR_PLANKS.get())));
	public static final RegistryObject<StairsBlock> EBONY_STAIRS = BLOCKS.register("ebony_stairs", () -> new StairsBlock(() -> BlockInit.EBONY_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.EBONY_PLANKS.get())));
	public static final RegistryObject<StairsBlock> DEAD_STAIRS = BLOCKS.register("dead_stairs", () -> new StairsBlock(() -> BlockInit.DEAD_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.DEAD_PLANKS.get())));
	public static final RegistryObject<StairsBlock> RUBBER_STAIRS = BLOCKS.register("rubber_stairs", () -> new StairsBlock(() -> BlockInit.RUBBER_PLANKS.get().getDefaultState(), Block.Properties.from(BlockInit.RUBBER_PLANKS.get())));
	
	// Slab
	//public static final RegistryObject<SlabBlock> SEETHING_STONE_SLAB = BLOCKS.register("seething_stone_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.SEETHING_STONE.get())));
	//public static final RegistryObject<SlabBlock> SEETHING_COBBLESTONE_SLAB = BLOCKS.register("seething_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.SEETHING_COBBLESTONE.get())));
	public static final RegistryObject<SlabBlock> RAJADO_SLAB = BLOCKS.register("rajado_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RAJADO_PLANKS.get())));
	public static final RegistryObject<SlabBlock> MAHOE_SLAB = BLOCKS.register("mahoe_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAHOE_PLANKS.get())));
	public static final RegistryObject<SlabBlock> IVORY_SLAB = BLOCKS.register("ivory_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.IVORY_PLANKS.get())));
	public static final RegistryObject<SlabBlock> MAPLE_SLAB = BLOCKS.register("maple_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.MAPLE_PLANKS.get())));
	public static final RegistryObject<SlabBlock> POPLAR_SLAB = BLOCKS.register("poplar_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.POPLAR_PLANKS.get())));
	public static final RegistryObject<SlabBlock> EBONY_SLAB = BLOCKS.register("ebony_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.EBONY_PLANKS.get())));
	public static final RegistryObject<SlabBlock> DEAD_SLAB = BLOCKS.register("dead_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.DEAD_PLANKS.get())));
	public static final RegistryObject<SlabBlock> RUBBER_SLAB = BLOCKS.register("rubber_slab", () -> new SlabBlock(Block.Properties.from(BlockInit.RUBBER_PLANKS.get())));
	
	// Fences and Fence Gates
	public static final RegistryObject<FenceBlock> RAJADO_FENCE = BLOCKS.register("rajado_fence", () -> new FenceBlock(Block.Properties.from(BlockInit.RAJADO_PLANKS.get())));
	public static final RegistryObject<FenceBlock> MAHOE_FENCE = BLOCKS.register("mahoe_fence", () -> new FenceBlock(Block.Properties.from(BlockInit.MAHOE_PLANKS.get())));
	public static final RegistryObject<FenceBlock> IVORY_FENCE = BLOCKS.register("ivory_fence", () -> new FenceBlock(Block.Properties.from(BlockInit.IVORY_PLANKS.get())));
	public static final RegistryObject<FenceBlock> MAPLE_FENCE = BLOCKS.register("maple_fence", () -> new FenceBlock(Block.Properties.from(BlockInit.MAPLE_PLANKS.get())));
	public static final RegistryObject<FenceBlock> POPLAR_FENCE = BLOCKS.register("poplar_fence", () -> new FenceBlock(Block.Properties.from(BlockInit.POPLAR_PLANKS.get())));
	public static final RegistryObject<FenceBlock> EBONY_FENCE = BLOCKS.register("ebony_fence", () -> new FenceBlock(Block.Properties.from(BlockInit.EBONY_PLANKS.get())));
	public static final RegistryObject<FenceBlock> DEAD_FENCE = BLOCKS.register("dead_fence", () -> new FenceBlock(Block.Properties.from(BlockInit.DEAD_PLANKS.get())));
	public static final RegistryObject<FenceBlock> RUBBER_FENCE = BLOCKS.register("rubber_fence", () -> new FenceBlock(Block.Properties.from(BlockInit.RUBBER_PLANKS.get())));
	
	public static final RegistryObject<FenceGateBlock> RAJADO_FENCE_GATE = BLOCKS.register("rajado_fence_gate", () -> new FenceGateBlock(Block.Properties.from(BlockInit.RAJADO_PLANKS.get())));
	public static final RegistryObject<FenceGateBlock> MAHOE_FENCE_GATE = BLOCKS.register("mahoe_fence_gate", () -> new FenceGateBlock(Block.Properties.from(BlockInit.MAHOE_PLANKS.get())));
	public static final RegistryObject<FenceGateBlock> IVORY_FENCE_GATE = BLOCKS.register("ivory_fence_gate", () -> new FenceGateBlock(Block.Properties.from(BlockInit.IVORY_PLANKS.get())));
	public static final RegistryObject<FenceGateBlock> MAPLE_FENCE_GATE = BLOCKS.register("maple_fence_gate", () -> new FenceGateBlock(Block.Properties.from(BlockInit.MAPLE_PLANKS.get())));
	public static final RegistryObject<FenceGateBlock> POPLAR_FENCE_GATE = BLOCKS.register("poplar_fence_gate", () -> new FenceGateBlock(Block.Properties.from(BlockInit.POPLAR_PLANKS.get())));
	public static final RegistryObject<FenceGateBlock> EBONY_FENCE_GATE = BLOCKS.register("ebony_fence_gate", () -> new FenceGateBlock(Block.Properties.from(BlockInit.EBONY_PLANKS.get())));	
	public static final RegistryObject<FenceGateBlock> DEAD_FENCE_GATE = BLOCKS.register("dead_fence_gate", () -> new FenceGateBlock(Block.Properties.from(BlockInit.DEAD_PLANKS.get())));
	public static final RegistryObject<FenceGateBlock> RUBBER_FENCE_GATE = BLOCKS.register("rubber_fence_gate", () -> new FenceGateBlock(Block.Properties.from(BlockInit.RUBBER_PLANKS.get())));

	// Doors and Trapdoors
	public static final RegistryObject<ModDoorBlock> RAJADO_DOOR = BLOCKS.register("rajado_door", () -> new ModDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModDoorBlock> MAHOE_DOOR = BLOCKS.register("mahoe_door", () -> new ModDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.BLUE_TERRACOTTA).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModDoorBlock> IVORY_DOOR = BLOCKS.register("ivory_door", () -> new ModDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModDoorBlock> MAPLE_DOOR = BLOCKS.register("maple_door", () -> new ModDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.YELLOW_TERRACOTTA).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModDoorBlock> POPLAR_DOOR = BLOCKS.register("poplar_door", () -> new ModDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.GREEN_TERRACOTTA).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModDoorBlock> EBONY_DOOR = BLOCKS.register("ebony_door", () -> new ModDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModDoorBlock> DEAD_DOOR = BLOCKS.register("dead_door", () -> new ModDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.GRAY).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModDoorBlock> RUBBER_DOOR = BLOCKS.register("rubber_door", () -> new ModDoorBlock(Block.Properties.create(Material.WOOD, MaterialColor.PINK).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD)));
	
	// Pressure Plates and Buttons
	//public static final RegistryObject<ModPressurePlateBlock> SEETHING_STONE_PRESSURE_PLATE = BLOCKS.register("seething_stone_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.STONE)));
	public static final RegistryObject<ModPressurePlateBlock> RAJADO_PRESSURE_PLATE = BLOCKS.register("rajado_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModPressurePlateBlock> MAHOE_PRESSURE_PLATE = BLOCKS.register("mahoe_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModPressurePlateBlock> IVORY_PRESSURE_PLATE = BLOCKS.register("ivory_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.PINK_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModPressurePlateBlock> MAPLE_PRESSURE_PLATE = BLOCKS.register("maple_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.YELLOW_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModPressurePlateBlock> POPLAR_PRESSURE_PLATE = BLOCKS.register("poplar_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModPressurePlateBlock> EBONY_PRESSURE_PLATE = BLOCKS.register("ebony_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.LIGHT_GRAY).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModPressurePlateBlock> DEAD_PRESSURE_PLATE = BLOCKS.register("dead_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.GRAY).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModPressurePlateBlock> RUBBER_PRESSURE_PLATE = BLOCKS.register("rubber_pressure_plate", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.PINK).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));

	//public static final RegistryObject<ModWoodButtonBlock> SEETHING_STONE_BUTTON = BLOCKS.register("seething_stone_button", () -> new ModWoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModWoodButtonBlock> RAJADO_BUTTON = BLOCKS.register("rajado_button", () -> new ModWoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModWoodButtonBlock> MAHOE_BUTTON = BLOCKS.register("mahoe_button", () -> new ModWoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModWoodButtonBlock> IVORY_BUTTON = BLOCKS.register("ivory_button", () -> new ModWoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.PINK_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModWoodButtonBlock> MAPLE_BUTTON = BLOCKS.register("maple_button", () -> new ModWoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.YELLOW_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModWoodButtonBlock> POPLAR_BUTTON = BLOCKS.register("poplar_button", () -> new ModWoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModWoodButtonBlock> EBONY_BUTTON = BLOCKS.register("ebony_button", () -> new ModWoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.LIGHT_GRAY).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModWoodButtonBlock> DEAD_BUTTON = BLOCKS.register("dead_button", () -> new ModWoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.GRAY).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<ModWoodButtonBlock> RUBBER_BUTTON = BLOCKS.register("rubber_button", () -> new ModWoodButtonBlock(Block.Properties.create(Material.MISCELLANEOUS, MaterialColor.PINK).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));

	// Torches
	public static final RegistryObject<ModTorchBlock> DREAM_TORCH = BLOCKS.register("dream_torch", () -> new ModTorchBlock(Block.Properties.from(Blocks.TORCH)));
	public static final RegistryObject<ModTorchBlock> NIGHTMARE_TORCH = BLOCKS.register("nightmare_torch", () -> new ModTorchBlock(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().lightValue(8).hardnessAndResistance(0.0F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<ModWallTorchBlock> DREAM_WALL_TORCH = BLOCKS.register("dream_wall_torch", () -> new ModWallTorchBlock(Block.Properties.from(Blocks.WALL_TORCH)));
	public static final RegistryObject<ModWallTorchBlock> NIGHTMARE_WALL_TORCH = BLOCKS.register("nightmare_wall_torch", () -> new ModWallTorchBlock(Block.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().lightValue(8).hardnessAndResistance(0.0F).sound(SoundType.WOOD)));

	// Ladders
	public static final RegistryObject<ModLadderBlock> DREAM_LADDER = BLOCKS.register("dream_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
	public static final RegistryObject<ModLadderBlock> NIGHTMARE_LADDER = BLOCKS.register("nightmare_ladder", () -> new ModLadderBlock(Block.Properties.from(Blocks.LADDER)));
	
	/* Plants and Flowers
	public static final RegistryObject<ModTallGrassBlock> TORPID_GRASS = BLOCKS.register("torpid_grass", () -> new ModTallGrassBlock(Block.Properties.create(Material.PLANTS, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));
	public static final RegistryObject<ModFlowerBlock> SEETHING_PLANT = BLOCKS.register("seething_plant", () -> new ModFlowerBlock(Effects.STRENGTH, 7, Block.Properties.create(Material.PLANTS, MaterialColor.RED_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0F).sound(SoundType.PLANT)));

	public static final RegistryObject<ModTallGrassBlock> MELANCHOLY_GRASS = BLOCKS.register("melancholy_grass", () -> new ModTallGrassBlock(Block.Properties.create(Material.PLANTS, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));
	public static final RegistryObject<ModTallGrassBlock> MELANCHOLY_VINE = BLOCKS.register("melancholy_vine", () -> new ModTallGrassBlock(Block.Properties.create(Material.PLANTS, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));
	public static final RegistryObject<ModFlowerBlock> WOEFUL_IVY = BLOCKS.register("woeful_ivy", () -> new ModFlowerBlock(Effects.SLOWNESS, 5, Block.Properties.create(Material.PLANTS, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));
	public static final RegistryObject<ModFlowerBlock> WEEPING_WISTERIA = BLOCKS.register("weeping_wisteria", () -> new ModFlowerBlock(Effects.GLOWING, 9, Block.Properties.create(Material.PLANTS, MaterialColor.BLUE_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));
	
	public static final RegistryObject<ModTallGrassBlock> LUSTFUL_IVY = BLOCKS.register("lustful_ivy", () -> new ModTallGrassBlock(Block.Properties.create(Material.PLANTS, MaterialColor.PINK_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));
	public static final RegistryObject<ModFlowerBlock> LUSTFUL_LILY = BLOCKS.register("lustful_lily", () -> new ModFlowerBlock(Effects.ABSORPTION, 7, Block.Properties.create(Material.PLANTS, MaterialColor.PINK_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));

	public static final RegistryObject<ModTallGrassBlock> JOYFUL_GRASS = BLOCKS.register("joyful_grass", () -> new ModTallGrassBlock(Block.Properties.create(Material.PLANTS, MaterialColor.YELLOW_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));
	public static final RegistryObject<ModTallGrassBlock> JOYFUL_VINE = BLOCKS.register("joyful_vine", () -> new ModTallGrassBlock(Block.Properties.create(Material.PLANTS, MaterialColor.YELLOW_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));

	public static final RegistryObject<ModTallGrassBlock> ENVIOUS_VINE = BLOCKS.register("envious_vine", () -> new ModTallGrassBlock(Block.Properties.create(Material.PLANTS, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));
	public static final RegistryObject<ModTallGrassBlock> ENVIOUS_BUSH = BLOCKS.register("envious_bush", () -> new ModTallGrassBlock(Block.Properties.create(Material.PLANTS, MaterialColor.GREEN_TERRACOTTA).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)));
	*/
}