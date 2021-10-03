package tbu.blockmod.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tbu.blockmod.Blockmod;
import tbu.blockmod.entities.EntityRegister;
public class ModItems {

    // Erze
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MISC));

    // Fleisch
    public static final Item RAW_CATMEAT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(1.8f).build()));
    public static final Item COOKED_CATMEAT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(20.8f).build()));
    public static final Item RAW_HORSEMEAT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.8f).build()));
    public static final Item COOKED_HORSEMEAT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(20.8f).build()));


    // Spawn Eier
    public static final Item ALEX_ENTITY_SPAWN_EGG = new SpawnEggItem(EntityRegister.ALEX, 12895428, 11382189, new Item.Settings().group(ItemGroup.MISC));


    public static void register(){

        Registry.register(Registry.ITEM, new Identifier(Blockmod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "raw_horsemeat"), RAW_HORSEMEAT);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "cooked_horsemeat"), COOKED_HORSEMEAT);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "raw_catmeat"), RAW_CATMEAT);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "cooked_catmeat"), COOKED_CATMEAT);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "alex_entity_spawn_egg"), ALEX_ENTITY_SPAWN_EGG);
    }
}
