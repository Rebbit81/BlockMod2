package tbu.blockmod.entities.romanentitypackage;

import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class RomanEntity extends  ZombieEntity{

    public RomanEntity(EntityType <? extends ZombieEntity> entityType, World world) {
        super(entityType, world);
    }




    @Override
    public boolean isSpectator() {
        return false;
    }

}




