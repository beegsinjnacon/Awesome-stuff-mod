package com.stuff.stuffmod.items;

import net.minecraft.item.Item.ToolMaterial;

import com.stuff.stuffmod.Stuff;

import net.minecraft.item.ItemSword;

public class AwesomeSword extends ItemSword {
	
	public AwesomeSword(ToolMaterial material, String name){
		super(material);
		setUnlocalizedName(Stuff.MODID + ":" + name);
		setTextureName(Stuff.MODID + ":" + name);
		setCreativeTab(Stuff.StuffTab);
	}
}
