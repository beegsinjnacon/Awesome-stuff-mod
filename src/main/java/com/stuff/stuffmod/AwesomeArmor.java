package com.stuff.stuffmod;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AwesomeArmor extends ItemArmor {

	public AwesomeArmor(ArmorMaterial material, int armorType, String name){
		super(material, 0, armorType);
		setUnlocalizedName(Stuff.MODID + ":" + name);
		setTextureName(Stuff.MODID + ":" + name);
		setCreativeTab(Stuff.StuffTab);
	}

	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack){
		
	}
	
	//@SideOnly(Side.CLIENT)
	//@Override
	//public void randomDisplayTick(World par1World, int par2 int par3, int par4, Random par5Random){
	//	super.randomDisplayTick (par1World, par, par3, par4, par5Random);
	//	
	//	if (par5Random.nextInt == 0)
	//	{
	//		double prt1 = (double) ((float) par2 + par1World.rand.nextFloat());
	//		double prt2 = (double) ((float) par3 + par1World.rand.nextFloat());
	//		double prt3 = (double) ((float) par4 + par1World.rand.nextFloat());
	//		
	//	}
	//	}
	//	
	//}
	
}
