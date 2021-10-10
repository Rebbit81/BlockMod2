package tbu.blockmod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import tbu.blockmod.Blockmod;
import tbu.blockmod.armor.PalladiumAmorMaterial;
import tbu.blockmod.entities.EntityRegister;
import tbu.blockmod.tools.PalladiumAxe;
import tbu.blockmod.tools.PalladiumHoe;
import tbu.blockmod.tools.PalladiumPickaxe;
import tbu.blockmod.tools.PalladiumToolMaterial;
import tbu.blockmod.wands.PalladiumWand;

public class ModItems{
    public static String MOD_ID = "blockmod";



    // Netherite Bowl
    public static final Item NETHERITE_BOWL = new Item(new Item.Settings().group(Blockmod.BM_GROUP));

    // Palladium
    public static final Item PALLADIUM_DUST = new Item((new Item.Settings().group(Blockmod.BM_GROUP)).rarity(Rarity.EPIC));
    public static final Item PALLADIUM_INGOT = new Item((new Item.Settings().group(Blockmod.BM_GROUP).rarity(Rarity.EPIC)).recipeRemainder(PALLADIUM_DUST));
    public static final Item PALLADIUM_NUGGET = new Item(new Item.Settings().group(Blockmod.BM_GROUP).rarity(Rarity.EPIC));
    public static final Item PALLADIUM_DUST_BOWL = new Item(new Item.Settings().group(Blockmod.BM_GROUP).rarity(Rarity.EPIC).recipeRemainder(NETHERITE_BOWL).maxCount(1));
    public static final PalladiumWand PALLADIUM_WAND = new PalladiumWand(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1).rarity(Rarity.EPIC));

    // Palladium Armor
    public static final ArmorMaterial PALLADIUM_ARMOR_MATERIAL = new PalladiumAmorMaterial();
    public static final Item PALLADIUM_HELMET = new ArmorItem(PALLADIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Blockmod.BM_GROUP));
    public static final Item PALLADIUM_CHESTPLATE = new ArmorItem(PALLADIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Blockmod.BM_GROUP));
    public static final Item PALLADIUM_LEGGINGS = new ArmorItem(PALLADIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Blockmod.BM_GROUP));
    public static final Item PALLADIUM_BOOTS = new ArmorItem(PALLADIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Blockmod.BM_GROUP));

    // Fleisch
    public static final Item RAW_HORSEMEAT = new Item(new Item.Settings().group(Blockmod.BM_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(1.8f).build()));
    public static final Item COOKED_HORSEMEAT = new Item(new Item.Settings().group(Blockmod.BM_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(20.8f).build()));

    // Palladium Tools
    public static final ToolItem PALLADIUM_SHOVEL = new ShovelItem(PalladiumToolMaterial.INSTANCE, 3F, -2F, new Item.Settings().group(Blockmod.BM_GROUP).rarity(Rarity.EPIC));
    public static final ToolItem PALLADIUM_SWORD = new SwordItem(PalladiumToolMaterial.INSTANCE, 5, -1F, new Item.Settings().group(Blockmod.BM_GROUP).rarity(Rarity.EPIC));
    public static final ToolItem PALLADIUM_PICKAXE = new PalladiumPickaxe(PalladiumToolMaterial.INSTANCE, 7, -1.8F, new Item.Settings().group(Blockmod.BM_GROUP).rarity(Rarity.EPIC));
    public static final ToolItem PALLADIUM_HOE = new PalladiumHoe(PalladiumToolMaterial.INSTANCE, 5, -2F, new Item.Settings().group(Blockmod.BM_GROUP).rarity(Rarity.EPIC));
    public static final ToolItem PALLADIUM_AXE = new PalladiumAxe(PalladiumToolMaterial.INSTANCE, 7, -1.6F, new Item.Settings().group(Blockmod.BM_GROUP).rarity(Rarity.EPIC));


    // Spawn Eier
    public static final Item ALEX_ENTITY_SPAWN_EGG = new SpawnEggItem(EntityRegister.ALEX, 12895428, 11382189, new Item.Settings().group(Blockmod.BM_GROUP));


    public static void init(){
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_dust"), PALLADIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_nugget"), PALLADIUM_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_ingot"), PALLADIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "raw_horsemeat"), RAW_HORSEMEAT);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "cooked_horsemeat"), COOKED_HORSEMEAT);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "alex_entity_spawn_egg"), ALEX_ENTITY_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "netherite_bowl"), NETHERITE_BOWL);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_dust_bowl"), PALLADIUM_DUST_BOWL);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_helmet"), PALLADIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_chestplate"), PALLADIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_leggings"), PALLADIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_boots"), PALLADIUM_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_shovel"), PALLADIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_sword"), PALLADIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_pickaxe"), PALLADIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_hoe"), PALLADIUM_HOE);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_axe"), PALLADIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier("blockmod", "palladium_wand"), PALLADIUM_WAND);








    }
}
