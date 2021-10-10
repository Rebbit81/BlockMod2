package tbu.blockmod.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import tbu.blockmod.blocks.ModBlocks;


public class Trees {


    public static final ConfiguredFeature<?, ?> TREE_CHERRY = Feature.TREE
            // Configure the feature using the builder
            .configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.NETHERITE_BLOCK.getDefaultState()), // Trunk block provider
                    new StraightTrunkPlacer(8, 3, 0), // places a straight trunk
                    new SimpleBlockStateProvider(ModBlocks.CHERRY_WOOD_LEAVES.getDefaultState()), // Foliage block provider
                    new SimpleBlockStateProvider(Blocks.OAK_SAPLING.getDefaultState()), // Sapling provider; used to determine what blocks the tree can generate on
                    new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3), // places leaves as a blob (radius, offset from trunk, height)
                    new TwoLayersFeatureSize(1, 0, 1) // The width of the tree at different layers; used to see how tall the tree can be without clipping into blocks
            ).build())
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING)))
            .spreadHorizontally()
            .applyChance(2); // About a 50% chance to generate per chunk (1/x)


    public static void init(){
        RegistryKey<ConfiguredFeature<?, ?>> treeRich = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("blockmod", "tree_rich"));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, treeRich.getValue(), TREE_CHERRY);

        // You should use the VEGETAL_DECORATION generation step for trees
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, treeRich);
    }
}
