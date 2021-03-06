package tbu.blockmod.wands;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class PalladiumWand extends Item {



    public PalladiumWand(Settings settings) {
        super(settings);
    }


    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack heldStack = user.getEquippedStack(hand == Hand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND);

        user.getItemCooldownManager().set(this, 100);
        user.playSound(SoundEvents.ENTITY_ENDER_DRAGON_SHOOT,5,1);
        Vec3d mouseLocation = user.getRotationVec(0.5F);
        double XCord = mouseLocation.getX();
        double YCord = mouseLocation.getY();
        double ZCord = mouseLocation.getZ();
        DragonFireballEntity dragonFireballEntity = new DragonFireballEntity(user.world, user, XCord, YCord, ZCord);
        dragonFireballEntity.updatePosition(user.getX(), user.getY() + 0.5D, user.getZ());
        user.world.spawnEntity(dragonFireballEntity);
        heldStack.damage(1, user, consumedPlayer -> consumedPlayer.sendToolBreakStatus(hand));


        return TypedActionResult.success(user.getStackInHand(hand));

    }

}
