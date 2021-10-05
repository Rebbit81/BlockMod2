package tbu.blockmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import tbu.blockmod.blocks.ModBlocks;
import tbu.blockmod.events.LootTableCallbacks;
import tbu.blockmod.items.ModItems;
import tbu.blockmod.worldgen.PalladiumEndOreGen;

public class Blockmod implements ModInitializer {


    public static String createItemModelJson(String id, String type) {
        if ("generated".equals(type) || "handheld".equals(type)) {
            //The two types of items. "handheld" is used mostly for tools and the like, while "generated" is used for everything else.
            return "{\n" +
                    "  \"parent\": \"item/" + type + "\",\n" +
                    "  \"textures\": {\n" +
                    "    \"layer0\": \"blockmod:item/" + id + "\"\n" +
                    "  }\n" +
                    "}";
        } else if ("block".equals(type)) {
            //However, if the item is a block-item, it will have a different model json than the previous two.
            return "{\n" +
                    "  \"parent\": \"blockmod:block/" + id + "\"\n" +
                    "}";
        }
        else {
            //If the type is invalid, return an empty json string.
            return "";
        }
    }























    public static final ItemGroup BM_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("blockmod", "bm_group")).icon(()
                    -> new ItemStack(ModBlocks.PALLADIUM_ORE_BLOCK)).build();

    public void onInitialize() {
        ModItems.init();
        ModBlocks.init();
        PalladiumEndOreGen.init();
        LootTableCallbacks.init();
    }
}