package tbu.blockmod.worldgen;

import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import tbu.blockmod.Blockmod;
import tbu.blockmod.blocks.ModBlocks;
import tbu.blockmod.init.BiomeInit;

import static tbu.blockmod.init.BiomeInit.ARES_PLAINS_KEY;


public class Trees {

    public static final ConfiguredFeature<?, ?> TREE_CHERRY = Feature.TREE
            // Configure the feature using the builder
            .configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.CHERRY_WOOD.getDefaultState()), // Trunk block provider
                    new StraightTrunkPlacer(6, 2, 0), // places a straight trunk
                    new SimpleBlockStateProvider(ModBlocks.CHERRY_WOOD_LEAVES.getDefaultState()), // Foliage block provider
                    new SimpleBlockStateProvider(Blocks.OAK_SAPLING.getDefaultState()), // Sapling provider; used to determine what blocks the tree can generate on
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1) // The width of the tree at different layers; used to see how tall the tree can be without clipping into blocks
            ).ignoreVines().build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)))
            .applyChance(2); // About a 50% chance to generate per chunk (1/x)

    public static final ConfiguredFeature<?, ?> TREE_ORANGE = Feature.TREE
            // Configure the feature using the builder
            .configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.DARK_OAK_LOG.getDefaultState()), // Trunk block provider
                    new StraightTrunkPlacer(6, 2, 0), // places a straight trunk
                    new SimpleBlockStateProvider(ModBlocks.ORANGE_WOOD_LEAVES.getDefaultState()), // Foliage block provider
                    new SimpleBlockStateProvider(Blocks.OAK_SAPLING.getDefaultState()), // Sapling provider; used to determine what blocks the tree can generate on
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1) // The width of the tree at different layers; used to see how tall the tree can be without clipping into blocks
            ).ignoreVines().build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)))
            .applyChance(2); // About a 50% chance to generate per chunk (1/x)

    public static final ConfiguredFeature<?, ?> TREE_YELLOW = Feature.TREE
            // Configure the feature using the builder
            .configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), // Trunk block provider
                    new StraightTrunkPlacer(6, 2, 0), // places a straight trunk
                    new SimpleBlockStateProvider(ModBlocks.YELLOW_WOOD_LEAVES.getDefaultState()), // Foliage block provider
                    new SimpleBlockStateProvider(Blocks.OAK_SAPLING.getDefaultState()), // Sapling provider; used to determine what blocks the tree can generate on
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1) // The width of the tree at different layers; used to see how tall the tree can be without clipping into blocks
            ).ignoreVines().build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)))
            .applyChance(2); // About a 50% chance to generate per chunk (1/x)

    public static final ConfiguredFeature<?, ?> ARES_TREES = Feature.RANDOM_SELECTOR.configure(
                            new RandomFeatureConfig(
                                    ImmutableList.of(
                                            TREE_YELLOW.withChance(0.33F),
                                            TREE_ORANGE.withChance(0.33F),
                                            TREE_CHERRY.withChance(0.33F)
                                    ), ConfiguredFeatures.OAK
                            )
                    ).decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)))
                    .decorate(Decorator.COUNT_EXTRA.configure(
                            new CountExtraDecoratorConfig(10, 0.1F, 1)));


    public static void init(){

        RegistryKey<ConfiguredFeature<?, ?>> treeCherry = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("blockmod", "tree_cherry"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeCherry.getValue(), TREE_CHERRY);

        RegistryKey<ConfiguredFeature<?, ?>> treeOrange = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("blockmod", "tree_orange"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeOrange.getValue(), TREE_ORANGE);

        RegistryKey<ConfiguredFeature<?, ?>> treeYellow = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("blockmod", "tree_yellow"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeYellow.getValue(), TREE_YELLOW);

        RegistryKey<ConfiguredFeature<?, ?>> aresTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("blockmod", "ares_trees"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, aresTrees.getValue(), ARES_TREES);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ARES_PLAINS_KEY), GenerationStep.Feature.VEGETAL_DECORATION, aresTrees);




    }
}
