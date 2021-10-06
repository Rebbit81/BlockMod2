package tbu.blockmod.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tbu.blockmod.Blockmod;

public class ModBlocks {

    public static String MOD_ID = "blockmod";

    public static final Block PALLADIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).breakByHand(false));
    public static final Block PALLADIUM_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 4));


    public static void init() {


        Registry.register(Registry.BLOCK, new Identifier("blockmod", "palladium_block"), PALLADIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_block"),
                new BlockItem(PALLADIUM_BLOCK, new FabricItemSettings().group(Blockmod.BM_GROUP.MISC)));
        Registry.register(Registry.BLOCK, new Identifier("blockmod", "palladium_ore_block"), PALLADIUM_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_ore_block"),
                new BlockItem(PALLADIUM_ORE_BLOCK, new FabricItemSettings().group(Blockmod.BM_GROUP.MISC)));
    }
}
