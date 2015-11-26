package com.stuff.stuffmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class slipperyBlock extends Block {

	public slipperyBlock () {
		super(Material.ice);
		this.slipperiness = 1.2F;
		setBlockName(Stuff.MODID + ":" + "slipperyBlock");
		setBlockTextureName(Stuff.MODID + ":" + "slipperyBlock");
		setCreativeTab(Stuff.StuffTab);
		setHardness(1.25F);
		setResistance(4.5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}

}
