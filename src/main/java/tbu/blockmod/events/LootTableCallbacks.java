package tbu.blockmod.events;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import tbu.blockmod.items.ModItems;

public class LootTableCallbacks {

    private static final Identifier HORSE_LOOT_TABLE_ID = EntityType.HORSE.getLootTableId();
    private static final Identifier OCELOT_LOOT_TABLE_ID = EntityType.OCELOT.getLootTableId();
    private static final Identifier CAT_LOOT_TABLE_ID = EntityType.CAT.getLootTableId();

    public static void init(){


        // Rohes Pferdefleich Drop
        net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (HORSE_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(4))
                        .with(ItemEntry.builder(ModItems.RAW_HORSEMEAT));


                table.pool(poolBuilder);
            }
        });

        // Rohes Catfleich Drop (Ocelot)
        net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (OCELOT_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.RAW_CATMEAT));


                table.pool(poolBuilder);
            }
        });


        // Rohes Catfleich Drop (Cat)
        net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (CAT_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.RAW_CATMEAT));


                table.pool(poolBuilder);
            }
        });
    }
}
