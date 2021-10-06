package tbu.blockmod.wands;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class PalladiumWand extends Item {

    public PalladiumWand(Settings settings) {
        super(settings);
    }


    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {


             Vec3d vec3d = playerEntity.getEyePos();
             double d = playerEntity.getEyePos().length();
             vec3d = playerEntity.getEyePos().normalize();

            double e = 4.0D;
            Vec3d vec3dd = playerEntity.getRotationVec(1.0F);
            double f = playerEntity.getX() - (playerEntity.getX() + vec3dd.x * 4.0D);
            double g = playerEntity.getBodyY(0.5D) - (0.5D + playerEntity.getBodyY(0.5D));
            double h = playerEntity.getZ() - (playerEntity.getZ() + vec3dd.z * 4.0D);

            FireballEntity fireballEntity = new FireballEntity(playerEntity.world, playerEntity, d, e, f, 5);
            fireballEntity.setPosition(playerEntity.getX(), playerEntity.getBodyY(0.5D) + 0.5D, fireballEntity.getZ());
            world.spawnEntity(fireballEntity);


            return TypedActionResult.success(playerEntity.getStackInHand(hand));
        }

    }

