package tbu.blockmod.entities.romanentitypackage;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.PiglinEntityModel;
import net.minecraft.util.Identifier;

public class RomanEntityRenderer extends MobEntityRenderer<RomanEntity, PiglinEntityModel<RomanEntity>> {


    public RomanEntityRenderer(EntityRenderDispatcher entityRenderDispatcher_1) {
        super(entityRenderDispatcher_1, new PiglinEntityModel<>(), 1);
    }

    @Override
    public Identifier getTexture(RomanEntity romanEntity) {
        return new Identifier("roman_entity:textures/entity/roman/romanskin.png");
    }
}
