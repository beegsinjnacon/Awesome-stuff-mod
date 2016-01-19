package com.stuff.stuffmod.items;

import com.stuff.stuffmod.Stuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class UnrefAwesomenessItem extends Item {

	public UnrefAwesomenessItem() {
		setUnlocalizedName(Stuff.MODID + ":" + "unRefAwesome");
		setTextureName(Stuff.MODID + ":" + "unrefawesome");
		setCreativeTab(Stuff.StuffTab);

	}

}