package com.stuff.stuffmod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * AwesomeSword - baconeggninja
 * Created using Tabula 5.1.0
 */
public class AwesomeSwordRenderer extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape6;

    public AwesomeSwordRenderer() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape3 = new ModelRenderer(this, 0, 0);
        this.shape3.setRotationPoint(-18.0F, 2.0F, 0.1F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 24, 2, 0, 0.0F);
        this.setRotateAngle(shape3, -1.0471975511965976F, 0.05F, 0.0F);
        this.shape5 = new ModelRenderer(this, 0, 0);
        this.shape5.setRotationPoint(-18.0F, 3.0F, -1.7F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 24, 2, 0, 0.0F);
        this.setRotateAngle(shape5, 1.0471975511965976F, 0.05F, 0.0F);
        this.shape6 = new ModelRenderer(this, 0, 0);
        this.shape6.setRotationPoint(-18.0F, 3.0F, 1.8F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 24, 2, 0, 0.0F);
        this.setRotateAngle(shape6, -1.0471975511965976F, 0.05F, 0.0F);
        this.shape4 = new ModelRenderer(this, 0, 0);
        this.shape4.setRotationPoint(-18.0F, 3.0F, 1.8F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 24, 2, 0, 0.0F);
        this.setRotateAngle(shape4, -2.0943951023931953F, 0.05F, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(6.0F, 2.0F, -1.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F);
        this.setRotateAngle(shape1, 0.0F, 0.05F, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 0);
        this.shape2.setRotationPoint(10.5F, 1.0F, -2.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 3, 4, 4, -0.5F);
        this.setRotateAngle(shape2, 0.0F, 0.05F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape3.render(f5);
        this.shape5.render(f5);
        this.shape6.render(f5);
        this.shape4.render(f5);
        this.shape1.render(f5);
        this.shape2.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
