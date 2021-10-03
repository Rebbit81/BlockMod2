package tbu.blockmod.entities.romanentitypackage;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.util.Identifier;
import org.lwjgl.system.CallbackI;

public class RomanEntityRenderer extends MobEntityRenderer<RomanEntity, ZombieEntityModel<RomanEntity>> {

    public RomanEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new ZombieEntityModel<>(0.0f, false), 0.5);
    }


    @Override
    public Identifier getTexture(RomanEntity entity) {
        return new Identifier("blockmod:textures/entity/alex/test123.png");
    }
}
