package tbu.blockmod.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import tbu.blockmod.items.ModItems;

public class PalladiumAmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {4, 7, 9, 4};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 42;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_AMETHYST_BLOCK_CHIME;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.PALLADIUM_INGOT);
    }

    @Override
    public String getName() {
        // Must be all lowercase
        return "palladium";
    }

    @Override
    public float getToughness() {
        return 4.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.15F;
    }
}
