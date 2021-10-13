package tbu.blockmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import tbu.blockmod.blocks.ModBlocks;
import tbu.blockmod.dimensions.portals;
import tbu.blockmod.events.LootTableCallbacks;
import tbu.blockmod.init.BiomeInit;
import tbu.blockmod.init.DimensionInit;
import tbu.blockmod.items.ModItems;
import tbu.blockmod.worldgen.PalladiumEndOreGen;

public class Blockmod implements ModInitializer {
    public static String MOD_ID = "blockmod";

    public static final ItemGroup BM_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("blockmod", "bm_group")).icon(()
                    -> new ItemStack(ModBlocks.PALLADIUM_ORE_BLOCK)).build();

    public void onInitialize() {
        ModItems.init();
        ModBlocks.init();
        PalladiumEndOreGen.init();
        LootTableCallbacks.init();
        DimensionInit.init();
        portals.init();
        BiomeInit.init();
    }
}