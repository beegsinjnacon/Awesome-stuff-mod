package com.stuff.stuffmod.items;

import com.stuff.stuffmod.Stuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EssenceItem extends Item {

	public EssenceItem(String itemName) {
		setUnlocalizedName(Stuff.MODID + ":" + itemName);
		setTextureName(Stuff.MODID + ":" + itemName);
		setCreativeTab(Stuff.StuffTab);
	}

}
