package com.stuff.stuffmod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.EnumHelper;
import thaumcraft.api.aspects.Aspect;

import com.stuff.stuffmod.blocks.*;
import com.stuff.stuffmod.items.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import thaumcraft.api.aspects.Aspect.*;
import thaumcraft.api.aspects.*;

@Mod(modid = Stuff.MODID, version = Stuff.VERSION)
public class Stuff
{
	
	public static int dimension = 2;
	
	@SidedProxy(clientSide = "com.stuff.stuffmod.stuffClientProxy", serverSide = "com.stuff.stuffmod.stuffCommonProxy")
	public static stuffCommonProxy proxy;
	
	public static CreativeTabs StuffTab = new StuffTab(CreativeTabs.getNextID(), "Awesome Stuff");
	
	public static final Aspect AWESOMENESS = new Aspect("tremendum", 0xCC0E0E, new Aspect[] {Aspect.ORDER, Aspect.ENERGY}, new ResourceLocation("/textures/aspect/awesome.png"), 1);
	
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
	public static Item awesomeSword;
	
	ArmorMaterial awesomearmor = EnumHelper.addArmorMaterial("awesomeArmor", 20, new int[] { 3, 7, 6, 3 }, 20);
	ToolMaterial awesometool = EnumHelper.addToolMaterial("awesomeness", 6, -1, 20, 42, 30);
	
	public static Block crystallizedEarth;
	public static Block crystallizedWater;
	public static Block crystallizedFire;
	public static Block crystallizedAir;
	public static Block slipperyBlock;
	public static Block antiSlipperyBlock;
	public static Block speedMaintenenceBlock;
	public static Block HyperSpacePortal;
	public static Block AwesomeBlock;
	
    public static final String MODID = "AwesomeStuff";
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
    	awesomeChestplate = new AwesomeArmor(awesomearmor, 1, "awesomeChestplate");
    	awesomeHelmet = new AwesomeArmor(awesomearmor, 0, "awesomeHelmet");
    	awesomeLeggings = new AwesomeArmor(awesomearmor, 2, "awesomeLeggings");
    	awesomeBoots = new AwesomeArmor(awesomearmor, 3, "awesomeBoots");
    	awesomeSword = new AwesomeSword(awesometool, "awesomeSword");
    	
    	
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
    	
    	proxy.registerRendering();
    	
    	GameRegistry.registerItem(unRefAwesome, "UnrefinedAwesomeness");
    	GameRegistry.registerItem(earthEssence, "EarthEssence");
    	GameRegistry.registerItem(waterEssence, "WaterEssence");
    	GameRegistry.registerItem(fireEssence, "FireEssence");
    	GameRegistry.registerItem(airEssence, "AirEssence");
    	GameRegistry.registerItem(pureAwesome, "PureAwesomeness");
    	GameRegistry.registerItem(awesomeHelmet, "AwesomeHelmet");
    	GameRegistry.registerItem(awesomeChestplate, "AwesomeChestplate");
    	GameRegistry.registerItem(awesomeLeggings, "AwesomeLeggings");
    	GameRegistry.registerItem(awesomeBoots, "AwesomeBoots");
    	GameRegistry.registerItem(awesomeSword, "AwesomeSword");
    	
    	MinecraftForgeClient.registerItemRenderer(awesomeSword, (IItemRenderer)new RenderAwesomeSword());
    	
    	GameRegistry.registerWorldGenerator(handler, 0);
    	
    	GameRegistry.registerBlock(crystallizedEarth, "Crystallized Earth");
    	GameRegistry.registerBlock(crystallizedWater, "Crystallized Water");
    	GameRegistry.registerBlock(crystallizedFire, "Crystallized Fire");
    	GameRegistry.registerBlock(crystallizedAir, "Crystallized Air");
    	GameRegistry.registerBlock(slipperyBlock, "Slippery Block");
    	GameRegistry.registerBlock(antiSlipperyBlock, "Anti-Slip Block");
    	GameRegistry.registerBlock(speedMaintenenceBlock, "Speed Maintenance Block");
    	GameRegistry.registerBlock(HyperSpacePortal, "HyperSpacePortal");
    	GameRegistry.registerBlock(AwesomeBlock, "Awesome Block");
    	
    	DimensionManager.registerProviderType(dimension, WorldProviderHyperSpace.class, false);
    	DimensionManager.registerDimension(Stuff.dimension, Stuff.dimension);
    	
    }
    	public void init(FMLInitializationEvent Event){
    	
    	GameRegistry.addRecipe(new ItemStack(Stuff.slipperyBlock, 2),
    			"WSW",
    			"CCC", "S", Items.slime_ball, "W", Stuff.waterEssence, "C", Blocks.stone);
    	
    	}
}
