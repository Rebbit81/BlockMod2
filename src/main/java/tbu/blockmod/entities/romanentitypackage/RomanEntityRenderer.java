package tbu.blockmod.entities.romanentitypackage;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.util.Identifier;
import tbu.blockmod.init.renderinit;

public class RomanEntityRenderer extends MobEntityRenderer<RomanEntity, ZombieEntityModel<RomanEntity>> {

    public RomanEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ZombieEntityModel<>(context.getPart(renderinit.ZOMBIE_LAYER)), 0.7F);

    }


    @Override
    public Identifier getTexture(RomanEntity entity) {
        return new Identifier("blockmod:textures/entity/alex/test123.png");
    }
}
