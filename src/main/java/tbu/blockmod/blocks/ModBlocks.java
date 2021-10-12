package tbu.blockmod.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tbu.blockmod.Blockmod;
import tbu.blockmod.worldgen.CherrySaplingBlock;
import tbu.blockmod.worldgen.CherrySaplingGenerator;
import static tbu.blockmod.worldgen.Trees.TREE_CHERRY;

public class ModBlocks {

    // wood

    public static final Block CHERRY_WOOD = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG));
    public static final Block CHERRY_WOOD_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));
    public static final Block CHERRY_WOOD_LEAVES = new Block(FabricBlockSettings.of(Material.LEAVES).breakByTool(FabricToolTags.SHEARS).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque());
    public static final Block YELLOW_WOOD_LEAVES = new Block(FabricBlockSettings.of(Material.LEAVES).breakByTool(FabricToolTags.SHEARS).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque());
    public static final Block ORANGE_WOOD_LEAVES = new Block(FabricBlockSettings.of(Material.LEAVES).breakByTool(FabricToolTags.SHEARS).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque());



    public static final Block PALLADIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByHand(false));
    public static final Block PALLADIUM_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 4));
    public static final CherrySaplingBlock CHERRY_SAPLING_BLOCK = new CherrySaplingBlock(new CherrySaplingGenerator(TREE_CHERRY), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));

    public static void init() {

        Registry.register(Registry.BLOCK, new Identifier("blockmod", "palladium_block"), PALLADIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_block"), new BlockItem(PALLADIUM_BLOCK, new FabricItemSettings().group(Blockmod.BM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("blockmod", "palladium_ore_block"), PALLADIUM_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_ore_block"), new BlockItem(PALLADIUM_ORE_BLOCK, new FabricItemSettings().group(Blockmod.BM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("blockmod", "cherry_tree_sapling"), CHERRY_SAPLING_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "cherry_tree_sapling"), new BlockItem(CHERRY_SAPLING_BLOCK, new FabricItemSettings().group(Blockmod.BM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("blockmod", "cherry_wood"), CHERRY_WOOD);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "cherry_wood"), new BlockItem(CHERRY_WOOD, new FabricItemSettings().group(Blockmod.BM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("blockmod", "cherry_wood_leaves"), CHERRY_WOOD_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "cherry_wood_leaves"), new BlockItem(CHERRY_WOOD_LEAVES, new FabricItemSettings().group(Blockmod.BM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("blockmod", "cherry_wood_planks"), CHERRY_WOOD_PLANKS);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "cherry_wood_planks"), new BlockItem(CHERRY_WOOD_PLANKS, new FabricItemSettings().group(Blockmod.BM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("blockmod", "orange_wood_leaves"), ORANGE_WOOD_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "orange_wood_leaves"), new BlockItem(ORANGE_WOOD_LEAVES, new FabricItemSettings().group(Blockmod.BM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("blockmod", "yellow_wood_leaves"), YELLOW_WOOD_LEAVES);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "yellow_wood_leaves"), new BlockItem(YELLOW_WOOD_LEAVES, new FabricItemSettings().group(Blockmod.BM_GROUP)));
    }
}
