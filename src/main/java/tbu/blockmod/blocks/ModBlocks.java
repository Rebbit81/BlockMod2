package tbu.blockmod.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f));
    public static final Block RUBY_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f));


    public static void register() {


        Registry.register(Registry.BLOCK, new Identifier("blockmod", "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "ruby_block"), new BlockItem(RUBY_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.BLOCK, new Identifier("blockmod", "ruby_ore_block"), RUBY_ORE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "ruby_ore_block"), new BlockItem(RUBY_ORE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
    }
}
