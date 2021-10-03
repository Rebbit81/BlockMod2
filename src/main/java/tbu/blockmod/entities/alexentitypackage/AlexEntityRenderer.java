package tbu.blockmod.entities.alexentitypackage;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import tbu.blockmod.client.AlexEntityClient;

public class AlexEntityRenderer extends MobEntityRenderer<AlexEntity, AlexEntityModel> {


    public AlexEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new AlexEntityModel(context.getPart(AlexEntityClient.MODEL_ALEX_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(AlexEntity entity) {
        return new Identifier("entityregister", "textures/entity/alex/alexentityskin.png");
    }
}
