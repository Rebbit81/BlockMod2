//package tbu.blockmod.events;
//
//import net.minecraft.entity.passive.SheepEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraft.sound.SoundCategory;
//import net.minecraft.util.ActionResult;
//import net.minecraft.util.Hand;
//import net.minecraft.world.event.GameEvent;
//
//public class SwordShear {
//
//
//    public ActionResult interactMob(PlayerEntity player, SheepEntity entity, Hand hand) {
//        ItemStack itemStack = player.getStackInHand(hand);
//        if (itemStack.isOf(Items.DIAMOND_SWORD)) {
//            if (entity.isShearable()) {
//                entity.sheared(SoundCategory.PLAYERS);
//                entity.emitGameEvent(GameEvent.SHEAR, player);
//                return ActionResult.SUCCESS;
//            }}
//                return ActionResult.FAIL;
//            }}
//
