package tbu.blockmod.worldgen.trees;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import tbu.blockmod.Blockmod;

public class Trees {

    public static final ConfiguredFeature<TreeFeatureConfig, ?> ORANGE_TREE_CONFIG = register("orange_tree", Feature.TREE.configure(TreeConfigs.ORANGE_TREE_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> YELLOW_TREE_CONFIG = register("yellow_tree", Feature.TREE.configure(TreeConfigs.YELLOW_TREE_CONFIG));
    public static final ConfiguredFeature<TreeFeatureConfig, ?> CHERRY_TREE_CONFIG = register("cherry_tree", Feature.TREE.configure(TreeConfigs.CHERRY_TREE_CONFIG));


    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String id, ConfiguredFeature<FC, ?> feature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Blockmod.MOD_ID, id), feature);

    }
}