package tbu.blockmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tbu.blockmod.blocks.ModBlocks;
import tbu.blockmod.events.LootTableCallbacks;
import tbu.blockmod.items.ModItems;
import tbu.blockmod.worldgen.PalladiumEndOreGen;

public class Blockmod implements ModInitializer {


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