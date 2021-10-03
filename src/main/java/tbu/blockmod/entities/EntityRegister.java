package tbu.blockmod.entities;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tbu.blockmod.entities.alexentitypackage.AlexEntity;

public class EntityRegister implements ModInitializer {

    //Registering
    public static final EntityType<AlexEntity> ALEX = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("blockmod", "alex"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE , AlexEntity::new).dimensions(EntityDimensions.fixed(1.0f, 2.0f)).build()
    );



    @Override
    public void onInitialize() {

        FabricDefaultAttributeRegistry.register(ALEX, AlexEntity.createMobAttributes());
    }
}
