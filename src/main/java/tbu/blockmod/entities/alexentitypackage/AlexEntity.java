package tbu.blockmod.entities.alexentitypackage;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class AlexEntity extends AnimalEntity {
        public AlexEntity(EntityType<? extends AnimalEntity> entityType, World world) {super(entityType, world);
        }

        private Identifier lootTableId;


    // Prioritäten
        protected void initGoals() {
            this.goalSelector.add(0, new WanderAroundGoal(this, 1.0D));
            this.goalSelector.add(1, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        }
        //Attributes
        public static DefaultAttributeContainer.Builder createAlexAttributes() {
            return MobEntity.createMobAttributes()
                    .add(EntityAttributes.GENERIC_MAX_HEALTH, 15.0D)
                    .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2D);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }
}



