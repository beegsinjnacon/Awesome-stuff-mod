package com.stuff.stuffmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AwesomeBlock extends Block {

	public AwesomeBlock() {
		super(Material.rock);
		setCreativeTab(Stuff.StuffTab);
		setBlockName(Stuff.MODID + ":" + "awesomeBlock");
		setBlockTextureName(Stuff.MODID + ":" + "awesomeBlock");
		setResistance(60000F);
	}

}
