package com.stuff.stuffmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PureAwesomeItem extends Item {

	public PureAwesomeItem() {
		setUnlocalizedName(Stuff.MODID + ":" + "pureAwesome");
		setTextureName(Stuff.MODID + ":" + "pureAwesome");
		setCreativeTab(Stuff.StuffTab);
	}

}
