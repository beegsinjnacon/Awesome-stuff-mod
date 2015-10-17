package com.stuff.stuffmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AwesomenessItem extends Item {

	public AwesomenessItem() {
		setUnlocalizedName(Stuff.MODID + ":" + "unRefAwesome");
		setTextureName(Stuff.MODID + ":" + "unrefawesome");
		setCreativeTab(CreativeTabs.tabMaterials);

	}

}