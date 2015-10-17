package com.stuff.stuffmod;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class stuffEventHandler implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkprovider)
	{
		switch(world.provider.dimensionId)
		{
			case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
			case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
			case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	
	private void generateEnd(World world, Random random, int x, int z)
	{
		int aposX = 20;
		int aposY = 4;
		int aposZ = 0;
		new WorldGenWaterAltar().generate(world, random, aposX, aposY, aposZ);
	}
	
	private void generateSurface(World world, Random random, int x, int z)
	{
		addOreSpawn(Stuff.crystallizedEarth, 0, Blocks.stone, world, random, x, z, 16, 16, 5 + random.nextInt(5), 4, 20, 60);
		int eposX = 0;
		int eposY = 4;
		int eposZ = 0;
		new WorldGenEarthAltar().generate(world, random, eposX, eposY, eposZ);
		int wposX = 20;
		int wposY = 4;
		int wposZ = 0;
		new WorldGenWaterAltar().generate(world, random, wposX, wposY, wposZ);
	}
	
	private void generateNether(World world, Random random, int x, int z)
	{
		int fposX = random.nextInt(16);
		int fposY = 31 + random.nextInt(100);
		int fposZ = x + random.nextInt(16);
		new WorldGenWaterAltar().generate(world, random, fposX, fposY, fposZ);
	}
	
	public void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0: "addOreSpawn: The Minimum Y must be greater than o";
		assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for(int x = 0; x < chancesToSpawn; x++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, metadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
		}
	}
	
}