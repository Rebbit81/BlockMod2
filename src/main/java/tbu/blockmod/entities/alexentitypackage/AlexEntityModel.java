package tbu.blockmod.entities.alexentitypackage;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;



public class AlexEntityModel extends EntityModel<AlexEntity> {

    private final ModelPart root;
    private final ModelPart left_arm;
    private final ModelPart right_arm;
    private final ModelPart leg_right;
    private final ModelPart leg_left;
    private final ModelPart body;
    private final ModelPart head;

    public AlexEntityModel(ModelPart root) {
        this.root = root;
        this.right_arm = root.getChild(EntityModelPartNames.RIGHT_ARM);
        this.left_arm = root.getChild(EntityModelPartNames.LEFT_ARM);
        this.leg_right = root.getChild(EntityModelPartNames.RIGHT_LEG);
        this.leg_left = root.getChild(EntityModelPartNames.LEFT_LEG);
        this.body = root.getChild(EntityModelPartNames.BODY);
        this.head = root.getChild(EntityModelPartNames.HEAD);
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData right_arm = modelPartData.addChild(EntityModelPartNames.RIGHT_ARM, ModelPartBuilder.create().uv(22, 63).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

        ModelPartData left_arm = modelPartData.addChild(EntityModelPartNames.LEFT_ARM, ModelPartBuilder.create().uv(56, 59).cuboid(-2.0F, -1.0F, -2.0F, 2.0F, 12.0F, 2.0F), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

        ModelPartData leg_right = modelPartData.addChild(EntityModelPartNames.RIGHT_LEG, ModelPartBuilder.create().uv(48, 59).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), ModelTransform.pivot(2.0F, 12.0F, 0.0F));

        ModelPartData leg_left = modelPartData.addChild(EntityModelPartNames.LEFT_LEG, ModelPartBuilder.create().uv(40, 59).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));

        ModelPartData body = modelPartData.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create().uv(0, 38).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head = modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(32, 32).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));



        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(AlexEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.root).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });

    }
}
