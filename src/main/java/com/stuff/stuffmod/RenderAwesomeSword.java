package com.stuff.stuffmod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import com.stuff.stuffmod.AwesomeSwordRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RenderAwesomeSword implements IItemRenderer {
	
	private AwesomeSwordRenderer awesomeSwordModel;
	
	public static ResourceLocation texture = new ResourceLocation(Stuff.MODID + ":" + "textures/items/AwesomeSword.png");
	
	public RenderAwesomeSword(){
		awesomeSwordModel = new AwesomeSwordRenderer();
	}
	
	@Override
	public boolean handleRenderType(ItemStack arg0, ItemRenderType type) {
		switch(type){
		case EQUIPPED: return true;
		
		case EQUIPPED_FIRST_PERSON: return true;
				
		default: return false;
		
		}
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack arg1, Object... arg2) {
		switch(type){
		case EQUIPPED: {
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			GL11.glScalef(1.4F, 1.0F, 1.4F);
			this.awesomeSwordModel.render(null, 0, 0, 0, 0, 0, 0.0625F);
			GL11.glPopMatrix();
		}
		case EQUIPPED_FIRST_PERSON: {
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			GL11.glScalef(1.4F, 1.0F, 1.4F);
			
			this.awesomeSwordModel.render(null, 0, 0, 0, 0, 0, 0.0625F);
			GL11.glPopMatrix();
		}
		default: break;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack arg1, ItemRendererHelper arg2) {
		return false;
		
	}

}
