package com.ironicthoughts.dreamdimension.world.feature;

import com.google.common.collect.ImmutableList;
import com.ironicthoughts.dreamdimension.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.HugeTreeFeatureConfig;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraftforge.common.IPlantable;

public class DefaultModBiomeFeatures extends DefaultBiomeFeatures {
	
	// Ores
	public static final BlockState SHUNGITE_ORE = BlockInit.SHUNGITE_ORE.get().getDefaultState();
	public static final BlockState JET_ORE = BlockInit.JET_ORE.get().getDefaultState();
	public static final BlockState CHRYSOLITE_ORE = BlockInit.CHRYSOLITE_ORE.get().getDefaultState();
	public static final BlockState PURPLE_APATITE_ORE = BlockInit.PURPLE_APATITE_ORE.get().getDefaultState();
	public static final BlockState WHITE_ONYX_ORE = BlockInit.WHITE_ONYX_ORE.get().getDefaultState();
	public static final BlockState TOPAZ_ORE = BlockInit.TOPAZ_ORE.get().getDefaultState();
	
	// Logs and Leaves
	public static final BlockState RAJADO_LOG = BlockInit.RAJADO_LOG.get().getDefaultState();
	public static final BlockState MAHOE_LOG = BlockInit.MAHOE_LOG.get().getDefaultState();
	public static final BlockState IVORY_LOG = BlockInit.IVORY_LOG.get().getDefaultState();
	public static final BlockState MAPLE_LOG = BlockInit.MAPLE_LOG.get().getDefaultState();
	public static final BlockState POPLAR_LOG = BlockInit.POPLAR_LOG.get().getDefaultState();
	public static final BlockState EBONY_LOG = BlockInit.EBONY_LOG.get().getDefaultState();
	public static final BlockState DEAD_LOG = BlockInit.DEAD_LOG.get().getDefaultState();
	public static final BlockState RUBBER_LOG = BlockInit.RUBBER_LOG.get().getDefaultState();
	
	public static final BlockState RAJADO_LEAVES = BlockInit.RAJADO_LEAVES.get().getDefaultState();
	public static final BlockState MAHOE_LEAVES = BlockInit.MAHOE_LEAVES.get().getDefaultState();
	public static final BlockState IVORY_LEAVES = BlockInit.IVORY_LEAVES.get().getDefaultState();
	public static final BlockState MAPLE_LEAVES = BlockInit.MAPLE_LEAVES.get().getDefaultState();
	public static final BlockState POPLAR_LEAVES = BlockInit.POPLAR_LEAVES.get().getDefaultState();
	public static final BlockState EBONY_LEAVES = BlockInit.EBONY_LEAVES.get().getDefaultState();
	public static final BlockState DEAD_LEAVES = BlockInit.DEAD_LEAVES.get().getDefaultState();
	public static final BlockState RUBBER_LEAVES = BlockInit.RUBBER_LEAVES.get().getDefaultState();
	
	/*
	// Plants and Flowers
	public static final BlockState SEETHING_PLANT = BlockInit.SEETHING_PLANT.get().getDefaultState();
	public static final BlockState TORPID_GRASS = BlockInit.TORPID_GRASS.get().getDefaultState();
	public static final BlockState MELANCHOLY_GRASS = BlockInit.MELANCHOLY_GRASS.get().getDefaultState();
	public static final BlockState MELANCHOLY_VINE = BlockInit.MELANCHOLY_VINE.get().getDefaultState();
	public static final BlockState WOEFUL_IVY = BlockInit.WOEFUL_IVY.get().getDefaultState();
	public static final BlockState WEEPING_WISTERIA = BlockInit.WEEPING_WISTERIA.get().getDefaultState();
	public static final BlockState LUSTFUL_IVY = BlockInit.LUSTFUL_IVY.get().getDefaultState();
	public static final BlockState LUSTFUL_LILY = BlockInit.LUSTFUL_LILY.get().getDefaultState();
	public static final BlockState JOYFUL_GRASS = BlockInit.JOYFUL_GRASS.get().getDefaultState();
	public static final BlockState JOYFUL_VINE = BlockInit.JOYFUL_VINE.get().getDefaultState();
	public static final BlockState ENVIOUS_VINE = BlockInit.ENVIOUS_VINE.get().getDefaultState();
	public static final BlockState ENVIOUS_BUSH = BlockInit.ENVIOUS_BUSH.get().getDefaultState();
	
	// Grass Decoration Configs
	public static final BlockClusterFeatureConfig SEETHING_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(TORPID_GRASS, 3).addWeightedBlockstate(SEETHING_PLANT, 3), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig MELANCHOLY_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(MELANCHOLY_GRASS, 3).addWeightedBlockstate(MELANCHOLY_VINE, 3).addWeightedBlockstate(WOEFUL_IVY, 1).addWeightedBlockstate(WEEPING_WISTERIA, 1), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig LUSTFUL_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(LUSTFUL_IVY, 3).addWeightedBlockstate(LUSTFUL_LILY, 3), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig JOYFUL_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(JOYFUL_GRASS, 3).addWeightedBlockstate(JOYFUL_VINE, 2), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig ENVIOUS_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(ENVIOUS_VINE, 3).addWeightedBlockstate(ENVIOUS_BUSH, 2), new SimpleBlockPlacer())).tries(20).build();
	*/
	
	// Tree Configs
	public static final TreeFeatureConfig RAJADO_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(RAJADO_LOG), new SimpleBlockStateProvider(RAJADO_LEAVES), new SpruceFoliagePlacer(2, 0))).baseHeight(8).heightRandA(3).trunkHeight(1).trunkHeightRandom(1).trunkTopOffsetRandom(2).ignoreVines().setSapling((IPlantable) BlockInit.RAJADO_SAPLING.get()).build();
	public static final TreeFeatureConfig MAHOE_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(MAHOE_LOG), new SimpleBlockStateProvider(MAHOE_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((IPlantable) BlockInit.MAHOE_SAPLING.get()).build();
	public static final TreeFeatureConfig IVORY_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(IVORY_LOG), new SimpleBlockStateProvider(IVORY_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((IPlantable) BlockInit.IVORY_SAPLING.get()).build();
	public static final TreeFeatureConfig MAPLE_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(MAPLE_LOG), new SimpleBlockStateProvider(MAPLE_LEAVES), new AcaciaFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).heightRandB(2).trunkHeight(0).ignoreVines().setSapling((IPlantable) BlockInit.MAPLE_SAPLING.get()).build();
	public static final TreeFeatureConfig POPLAR_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(POPLAR_LOG), new SimpleBlockStateProvider(POPLAR_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(8).foliageHeight(3).ignoreVines().setSapling((IPlantable) BlockInit.POPLAR_SAPLING.get()).build();
	public static final HugeTreeFeatureConfig MEGA_POPLAR_TREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(POPLAR_LOG), new SimpleBlockStateProvider(POPLAR_LEAVES))).baseHeight(10).heightInterval(20).decorators(ImmutableList.of(new TrunkVineTreeDecorator(), new LeaveVineTreeDecorator())).setSapling((IPlantable) BlockInit.POPLAR_SAPLING.get()).build();
	public static final TreeFeatureConfig EBONY_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(EBONY_LOG), new SimpleBlockStateProvider(EBONY_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((IPlantable) BlockInit.EBONY_SAPLING.get()).build();
	public static final TreeFeatureConfig DEAD_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(DEAD_LOG), new SimpleBlockStateProvider(DEAD_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((IPlantable) BlockInit.DEAD_SAPLING.get()).build();
	public static final HugeTreeFeatureConfig RUBBER_TREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(RUBBER_LOG), new SimpleBlockStateProvider(RUBBER_LEAVES))).baseHeight(6).setSapling((IPlantable) BlockInit.RUBBER_SAPLING.get()).build();

    // Adds ores from the Dream Dimension mod to custom biomes
    public static void addModOres(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SHUNGITE_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(11, 0, 0, 64))));
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, JET_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 0, 0, 64))));
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, CHRYSOLITE_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(14, 0, 0, 64))));
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, PURPLE_APATITE_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(18, 0, 0, 64))));
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WHITE_ONYX_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(9, 0, 0, 128))));
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, TOPAZ_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(13, 0, 0, 64))));
    }

    // Adds extra ores from the Dream Dimension mod to custom biomes
    public static void addExtraShungiteOre(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, SHUNGITE_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 0, 0, 64))));
    }
    
    public static void addExtraJetOre(Biome biomeIn) {
 	   biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, JET_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 0, 0, 64))));
    }
    
    public static void addExtraChrysoliteOre(Biome biomeIn) {
 	   biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, CHRYSOLITE_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 0, 0, 64))));
    }
    
    public static void addExtraApatiteOre(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, PURPLE_APATITE_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 0, 0, 64))));
    }
    
    public static void addExtraWhiteOnyxOre(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, WHITE_ONYX_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 0, 0, 128))));
    }
    
    public static void addExtraTopazOre(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, TOPAZ_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 0, 0, 64))));
    }
    
    // Adds tree decoration into the custom biomes in the Dream Dimension mod
    public static void addSeethingTrees(Biome biomeIn) {
    	biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(RAJADO_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(50, 0.1F, 1))));
    }
    
    public static void addMelancholyTrees(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(MAHOE_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }
    
    public static void addLustfulTrees(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(IVORY_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(6, 0.1F, 1))));
    }
    
    public static void addJoyfulTrees(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.ACACIA_TREE.withConfiguration(MAPLE_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));
    }
    
    public static void addEnviousTrees(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.MEGA_JUNGLE_TREE.withConfiguration(MEGA_POPLAR_TREE_CONFIG).withChance(1.0F)), Feature.NORMAL_TREE.withConfiguration(POPLAR_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(50, 0.1F, 1))));
    }
    
    public static void addDreadfulTrees(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(EBONY_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
    }
    
    public static void addNightmareTrees(Biome biomeIn) {
    	biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FANCY_TREE.withConfiguration(DEAD_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));
    }
    
    public static void addEnlightenedTrees(Biome biomeIn) {
    	biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.DARK_OAK_TREE.withConfiguration(RUBBER_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(40, 0.1F, 1))));
    }
    
    /*
    // Adds grass decoration to the custom biomes in the Dream Dimension mod
    public static void addSeethingGrass(Biome biomeIn) {
 	    biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(SEETHING_GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
    }
    
    public static void addMelancholyGrass(Biome biomeIn) {
	     biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(MELANCHOLY_GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
    }
    
    public static void addLustfulGrass(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(LUSTFUL_GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
    }
    
    public static void addJoyfulGrass(Biome biomeIn) {
 	   biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(JOYFUL_GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
    }
    
    public static void addEnviousGrass(Biome biomeIn) {
	    biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(ENVIOUS_GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
    }
    */
}
