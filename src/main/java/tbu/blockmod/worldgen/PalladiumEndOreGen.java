package tbu.blockmod.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import tbu.blockmod.blocks.ModBlocks;

public class PalladiumEndOreGen {

    private static ConfiguredFeature<?, ?> PALLADIUM_ORE_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // Base block is end stone in The End biomes
                    ModBlocks.Palladium_ORE_BLOCK.getDefaultState(),
                    9))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(64))))
            .spreadHorizontally()
            .repeat(20);


    public static void register() {
        RegistryKey<ConfiguredFeature<?, ?>> orePalladiumEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("blockmod", "ore_palladium_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePalladiumEnd.getValue(), PALLADIUM_ORE_END);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_MIDLANDS), GenerationStep.Feature.UNDERGROUND_ORES, orePalladiumEnd);
    }
}
