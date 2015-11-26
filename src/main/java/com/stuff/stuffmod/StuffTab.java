package com.stuff.stuffmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StuffTab extends CreativeTabs {

	public StuffTab(String lable) {
		super(lable);
	}

	public StuffTab(int par1, String par2str) {
		super(par1, par2str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Stuff.fireEssence;
	}

}
