package com.stuff.stuffmod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Stuff.MODID, version = Stuff.VERSION)
public class Stuff
{
	
	public static int dimension = 2;
	
	public static CreativeTabs StuffTab = new StuffTab(CreativeTabs.getNextID(), "Awesome Stuff");
	
	public static Item unRefAwesome;
	public static Item earthEssence;
	public static Item waterEssence;
	public static Item fireEssence;
	public static Item airEssence;
	public static Item pureAwesome;
	public static Item awesomeChestplate;
	public static Item awesomeHelmet;
	public static Item awesomeLeggings;
	public static Item awesomeBoots;
	
	ArmorMaterial awesomeness = EnumHelper.addArmorMaterial("awesomeArmor", 20, new int[] { 3, 7, 6, 3 }, 20);
	
	public static Block crystallizedEarth;
	public static Block crystallizedWater;
	public static Block crystallizedFire;
	public static Block crystallizedAir;
	public static Block slipperyBlock;
	public static Block antiSlipperyBlock;
	public static Block speedMaintenenceBlock;
	public static Block HyperSpacePortal;
	public static Block AwesomeBlock;
	
    public static final String MODID = "stuff";
    public static final String VERSION = "0.1.1";
    
    @EventHandler
    public void preinit(FMLInitializationEvent event)
    {
    	unRefAwesome = new UnrefAwesomenessItem();
    	earthEssence = new EssenceItem("earthEssence");
    	waterEssence = new EssenceItem("waterEssence");
    	fireEssence = new EssenceItem("fireEssence");
    	airEssence = new EssenceItem("airEssence");
    	pureAwesome = new PureAwesomeItem();
    	awesomeChestplate = new AwesomeArmor(awesomeness, 1, "awesomeChestplate");
    	awesomeHelmet = new AwesomeArmor(awesomeness, 0, "awesomeHelmet");
    	awesomeLeggings = new AwesomeArmor(awesomeness, 2, "awesomeLeggings");
    	awesomeBoots = new AwesomeArmor(awesomeness, 3, "awesomeBoots");
    	
    	crystallizedEarth = new crystallizedEssence("crystallizedEarth");
    	crystallizedWater = new crystallizedEssence("crystallizedWater");
    	crystallizedFire = new crystallizedEssence("crystallizedFire");
    	crystallizedAir = new crystallizedEssence("crystallizedAir");
    	slipperyBlock = new slipperyBlock();
    	antiSlipperyBlock = new antiSlipperyBlock();
    	speedMaintenenceBlock = new speedMaintenenceBlock();
    	HyperSpacePortal = new HyperSpacePortal();
    	AwesomeBlock = new AwesomeBlock();
    	
    	stuffEventHandler handler = new stuffEventHandler();
    	
    	GameRegistry.registerItem(unRefAwesome, "Unrefined Awesomeness");
    	GameRegistry.registerItem(earthEssence, "Earth Essence");
    	GameRegistry.registerItem(waterEssence, "Water Essence");
    	GameRegistry.registerItem(fireEssence, "Fire Essence");
    	GameRegistry.registerItem(airEssence, "Air Essence");
    	GameRegistry.registerItem(pureAwesome, "Pure Awesomeness");
    	GameRegistry.registerItem(awesomeHelmet, "Awesome Helmet");
    	GameRegistry.registerItem(awesomeChestplate, "Awesome Chestplate");
    	GameRegistry.registerItem(awesomeLeggings, "Awesome Leggings");
    	GameRegistry.registerItem(awesomeBoots, "Awesome Boots");
    	
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    	GameRegistry.registerBlock(crystallizedEarth, "Crystallized Earth");
    	GameRegistry.registerBlock(crystallizedWater, "Crystallized Water");
    	GameRegistry.registerBlock(crystallizedFire, "Crystallized Fire");
    	GameRegistry.registerBlock(crystallizedAir, "Crystallized Air");
    	GameRegistry.registerBlock(slipperyBlock, "Slippery Block");
    	GameRegistry.registerBlock(antiSlipperyBlock, "Anti-Slip Block");
    	GameRegistry.registerBlock(speedMaintenenceBlock, "Speed Maintenance Block");
    	GameRegistry.registerBlock(HyperSpacePortal, "HyperSpace Portal");
    	GameRegistry.registerBlock(AwesomeBlock, "Awesome Block");
    	
    	DimensionManager.registerProviderType(dimension, WorldProviderHyperSpace.class, false);
    	DimensionManager.registerDimension(Stuff.dimension, Stuff.dimension);
    	
    }
    	public void init(FMLInitializationEvent Event){
    	
    	GameRegistry.addRecipe(new ItemStack(Stuff.slipperyBlock, 2),
    			"WSW",
    			"CCC", "S", Items.slime_ball, "W", Stuff.waterEssence, "C", Blocks.cobblestone);
    	
    	}
}
