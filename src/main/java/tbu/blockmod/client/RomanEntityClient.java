package tbu.blockmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import tbu.blockmod.entities.EntityRegister;
import tbu.blockmod.entities.alexentitypackage.AlexEntityModel;
import tbu.blockmod.entities.alexentitypackage.AlexEntityRenderer;
import tbu.blockmod.entities.romanentitypackage.RomanEntityRenderer;

public class RomanEntityClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_ROMAN_LAYER = new EntityModelLayer(new Identifier("entityregister", "roman"), "ronam");

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(EntityRegister.ROMAN, (context) -> {
            return new RomanEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_ROMAN_LAYER, AlexEntityModel::getTexturedModelData);


    }
}
