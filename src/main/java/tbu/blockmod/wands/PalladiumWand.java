package tbu.blockmod.wands;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PalladiumWand extends Item {

    public PalladiumWand(Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

            FireballEntity fireballEntity = new FireballEntity(playerEntity.world, playerEntity, 5, 5, 5, 5);
            fireballEntity.setPosition(playerEntity.getX(), playerEntity.getBodyY(0.5D) + 0.5D, fireballEntity.getZ());
            world.spawnEntity(fireballEntity);


            return TypedActionResult.success(playerEntity.getStackInHand(hand));
        }


}
