package tbu.blockmod.entities;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;
import tbu.blockmod.entities.alexentitypackage.AlexEntity;
import tbu.blockmod.entities.romanentitypackage.RomanEntity;

public class EntityRegister implements ModInitializer {

    //Registering
    public static final EntityType<AlexEntity> ALEX = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("blockmod", "alex"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE , AlexEntity::new).dimensions(EntityDimensions.fixed(1.0f, 2.0f)).build()
    );

    public static final EntityType<RomanEntity> ROMAN = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("blockmod", "roman"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, (EntityType.EntityFactory<RomanEntity>) RomanEntity::new).dimensions(EntityDimensions.fixed(1,2)).build()
    );


    @Override
    public void onInitialize() {

        FabricDefaultAttributeRegistry.register(ALEX, AlexEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(ROMAN, RomanEntity.createMobAttributes());
    }
}
