package com.stuff.stuffmod.items;

import java.util.Random;

import com.stuff.stuffmod.Stuff;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
	
		
}