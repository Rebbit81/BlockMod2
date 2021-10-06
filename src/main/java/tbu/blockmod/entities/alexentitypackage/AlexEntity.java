package tbu.blockmod.entities.alexentitypackage;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.world.World;

public class AlexEntity extends PathAwareEntity {


        public AlexEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
            super(entityType, world);
        }
    }



