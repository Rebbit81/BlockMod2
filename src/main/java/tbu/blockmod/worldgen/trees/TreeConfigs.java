package tbu.blockmod.worldgen.trees;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import tbu.blockmod.blocks.ModBlocks;

public class TreeConfigs {

    public static final TreeFeatureConfig ORANGE_TREE_CONFIG = oakLike(Blocks.DARK_OAK_LOG, ModBlocks.ORANGE_WOOD_LEAVES, ModBlocks.ORANGE_TREE_SAPLING_BLOCK, 4);
    public static final TreeFeatureConfig YELLOW_TREE_CONFIG = oakLike(Blocks.OAK_LOG, ModBlocks.YELLOW_WOOD_LEAVES, ModBlocks.YELLOW_TREE_SAPLING_BLOCK, 4);
    public static final TreeFeatureConfig CHERRY_TREE_CONFIG = oakLike(ModBlocks.CHERRY_WOOD, ModBlocks.CHERRY_WOOD_LEAVES, ModBlocks.CHERRY_SAPLING_BLOCK, 6);










    private static TreeFeatureConfig oakLike(Block trunk, Block leaves, Block sapling, int height) {
        return new TreeFeatureConfig.Builder(
                new SimpleBlockStateProvider(trunk.getDefaultState()),
                new StraightTrunkPlacer(height, 2, 0),
                new SimpleBlockStateProvider(leaves.getDefaultState()),
                new SimpleBlockStateProvider(sapling.getDefaultState()),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).ignoreVines().build();
    }
}
