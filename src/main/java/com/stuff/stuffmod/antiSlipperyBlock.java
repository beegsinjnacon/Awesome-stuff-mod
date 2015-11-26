package com.stuff.stuffmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class antiSlipperyBlock extends Block {

	public antiSlipperyBlock () {
		super(Material.ice);
		this.slipperiness = 0.5F;
		setBlockName(Stuff.MODID + ":" + "antiSlipperyBlock");
		setBlockTextureName(Stuff.MODID + ":" + "antiSlipperyBlock");
		setCreativeTab(Stuff.StuffTab);
		setHardness(1.25F);
		setResistance(4.5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}

}
