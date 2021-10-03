package tbu.blockmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import tbu.blockmod.entities.EntityRegister;

public class RomanEntityClient implements ClientModInitializer {

    EntityRendererRegistry.INSTANCE.register(EntityRegister.ROMAN, (dispatcher, context) -> new RomanEntityRenderer(dispatcher));


    @Override
    public void onInitializeClient() {

    }
}
