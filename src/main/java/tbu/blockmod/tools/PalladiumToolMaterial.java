package tbu.blockmod.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import tbu.blockmod.Blockmod;
import tbu.blockmod.items.ModItems;

public class PalladiumToolMaterial implements ToolMaterial {

    public static final PalladiumToolMaterial INSTANCE = new PalladiumToolMaterial();


    @Override
    public int getDurability() {
        return 2892;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }

    @Override
    public float getAttackDamage() {
        return 6.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 27;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.PALLADIUM_INGOT);
    }
}
