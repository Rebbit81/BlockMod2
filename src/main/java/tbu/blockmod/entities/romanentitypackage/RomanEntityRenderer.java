package tbu.blockmod.entities.romanentitypackage;


import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.model.PiglinEntityModel;
import net.minecraft.util.Identifier;
import tbu.blockmod.client.RomanEntityClient;


public class RomanEntityRenderer extends MobEntityRenderer<RomanEntity, PiglinEntityModel<RomanEntity>> {


    public RomanEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new PiglinEntityModel<>(context.getPart(RomanEntityClient.MODEL_ROMAN_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(RomanEntity entity) {
        return new Identifier("entityregister", "textures/entity/roman/romanskin.png");
    }
}
