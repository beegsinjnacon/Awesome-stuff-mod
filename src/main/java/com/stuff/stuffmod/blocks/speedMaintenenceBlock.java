package com.stuff.stuffmod.blocks;

import com.stuff.stuffmod.Stuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class speedMaintenenceBlock extends Block {

	public speedMaintenenceBlock () {
		super(Material.ice);
		this.slipperiness = 1.08F;
		setBlockName(Stuff.MODID + ":" + "speedMaintenanceBlock");
		setBlockTextureName(Stuff.MODID + ":" + "speedMaintenanceBlock");
		setCreativeTab(Stuff.StuffTab);
		setHardness(1.25F);
		setResistance(4.5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 0);
	}

}
