package com.stuff.stuffmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class speedMaintenenceBlock extends Block {

	public speedMaintenenceBlock () {
		super(Material.ice);
		this.slipperiness = 1.05F;
		setBlockName(Stuff.MODID + ":" + "speedMaintenanceBlock");
		setBlockTextureName(Stuff.MODID + ":" + "speedMaintenenceBlock");
		setCreativeTab(Stuff.StuffTab);
		setHardness(1.25F);
		setResistance(4.5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}

}
