package tbu.blockmod.entities.romanentitypackage;


import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.model.PiglinEntityModel;
import net.minecraft.util.Identifier;


public class RomanEntityRenderer extends MobEntityRenderer<RomanEntity, PiglinEntityModel<RomanEntity>> {



    public RomanEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new PiglinEntityModel<>(context.getPart(RomanEntityClient.MODEL_ROMAN_LAYER)), 0.5f);    }

    @Override
    public Identifier getTexture(RomanEntity romanEntity) {
        return new Identifier("roman_entity:textures/entity/roman/romanskin.png");
    }
}
