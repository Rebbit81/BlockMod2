package tbu.blockmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import tbu.blockmod.entities.alexentitypackage.AlexEntityModel;
import tbu.blockmod.entities.alexentitypackage.AlexEntityRenderer;
import tbu.blockmod.entities.EntityRegister;

public class AlexEntityClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_ALEX_LAYER = new EntityModelLayer(new Identifier("entityregister", "alex"), "aleks");

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(EntityRegister.ALEX, (context) -> {
            return new AlexEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_ALEX_LAYER, AlexEntityModel::getTexturedModelData);


    }
}
