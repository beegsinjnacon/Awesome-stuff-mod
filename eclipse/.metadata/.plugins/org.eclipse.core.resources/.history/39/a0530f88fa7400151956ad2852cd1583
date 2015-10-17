package com.stuff.stuffmod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Stuff.MODID, version = Stuff.VERSION)
public class Stuff
{
	
	public static int dimension = 42;
	
	public static Item unRefAwesome;
	public static Item earthEssence;
	public static Item waterEssence;
	public static Item fireEssence;
	public static Item airEssence;
	
	public static Block crystallizedEarth;
	public static Block crystallizedWater;
	public static Block crystallizedFire;
	public static Block crystallizedAir;
	
    public static final String MODID = "stuff";
    public static final String VERSION = "0.1.1";
    
    @EventHandler
    public void preinit(FMLInitializationEvent event)
    {
    	unRefAwesome = new AwesomenessItem();
    	earthEssence = new EssenceItem("earthEssence");
    	waterEssence = new EssenceItem("waterEssence");
    	fireEssence = new EssenceItem("fireEssence");
    	airEssence = new EssenceItem("airEssence");
    	
    	crystallizedEarth = new crystallizedEssence("crystallizedEarth");
    	crystallizedWater = new crystallizedEssence("crystallizedWater");
    	crystallizedFire = new crystallizedEssence("crystallizedFire");
    	crystallizedAir = new crystallizedEssence("crystallizedAir");
    	
    	stuffEventHandler handler = new stuffEventHandler();
    	
    	GameRegistry.registerItem(unRefAwesome, "Unrefined Awesomeness");
    	GameRegistry.registerItem(earthEssence, "Earth Essence");
    	GameRegistry.registerItem(waterEssence, "Water Essence");
    	GameRegistry.registerItem(fireEssence, "Fire Essence");
    	GameRegistry.registerItem(airEssence, "Air Essence");
    	
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    	GameRegistry.registerBlock(crystallizedEarth, "Crystallized Earth");
    	GameRegistry.registerBlock(crystallizedWater, "Crystallized Water");
    	GameRegistry.registerBlock(crystallizedFire, "Crystallized Fire");
    	GameRegistry.registerBlock(crystallizedAir, "Crystallized Air");
    	
    	//GameRegistry.addRecipe(new ItemStack(Stuff.crystallizedWater), 
    			//" L ",
    			//"LRL",
    			//" L ",
    			//"L", Items.bone, "R", Items.redstone);
    	
    	//DimensionManager.registerProviderType(dimension, WorldProviderHyperSpace.class, false);
    	
    }
}
