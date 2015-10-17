package com.stuff.stuffmod;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenAirAltar extends WorldGenerator implements IWorldGenerator
{
	protected Block[] getValidSpawnBlocks() {
		return new Block[] {
			Blocks.end_stone
		};
	}

	public boolean locationIsValidSpawn(World world, int x, int y, int z){
		int distanceToAir = 0;
		Block check = world.getBlock(x, y, z);

		while (check != Blocks.air){
			if (distanceToAir > 5){
				return false;
			}

			distanceToAir++;
			check = world.getBlock(x, y + distanceToAir, z);
		}

		y += distanceToAir - 1;

		Block block = world.getBlock(x, y, z);
		Block blockAbove = world.getBlock(x, y+1, z);
		Block blockBelow = world.getBlock(x, y-1, z);
		
		for (Block b : getValidSpawnBlocks()){
			if (blockAbove != Blocks.air){
				return false;
			}
			if (block == b){
				return true;
			}else if (block == Blocks.snow && blockBelow == b){
				return true;
			}
		}
		
		return false;
	}

	public WorldGenAirAltar() { }

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) { }

	public void setBlock(World world, int x, int y, int z, Block block, int metadata)
	{
		Block b1 = world.getBlock(x, y, z);

		if(b1.isAir(world, x, y, z) || b1.isLeaves(world, x, y, z))
		{
			world.setBlock(x, y, z, block, metadata, 2);
		}
	}

	public boolean generate(World world, Random rand, int x, int y, int z) {
		//check that each corner is one of the valid spawn blocks
		if(!locationIsValidSpawn(world, x, y, z) || !locationIsValidSpawn(world, x + 4, y, z) || !locationIsValidSpawn(world, x + 4, y, z + 4) || !locationIsValidSpawn(world, x, y, z + 4))
		{
			return false;
		}

		z = z - 10;
		x = x - 10;

		this.setBlock(world, x + 0, y + 0, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 0, z + 1, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 0, z + 2, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 0, z + 3, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 0, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 1, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 1, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 1, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 1, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 1, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 2, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 2, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 2, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 2, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 2, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 3, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 3, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 3, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 3, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 3, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 0, y + 4, z + 0, Blocks.skull, 4);
		this.setBlock(world, x + 0, y + 4, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 4, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 4, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 4, z + 4, Blocks.skull, 4);
		this.setBlock(world, x + 1, y + 0, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 1, y + 0, z + 1, Blocks.end_stone, 0);
		this.setBlock(world, x + 1, y + 0, z + 2, Stuff.crystallizedAir, 0);
		this.setBlock(world, x + 1, y + 0, z + 3, Blocks.end_stone, 0);
		this.setBlock(world, x + 1, y + 0, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 1, y + 1, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 1, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 1, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 1, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 1, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 2, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 2, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 2, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 2, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 2, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 3, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 3, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 3, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 3, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 3, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 4, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 4, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 4, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 4, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 1, y + 4, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 0, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 2, y + 0, z + 1, Stuff.crystallizedAir, 0);
		this.setBlock(world, x + 2, y + 0, z + 2, Blocks.end_stone, 0);
		this.setBlock(world, x + 2, y + 0, z + 3, Stuff.crystallizedAir, 0);
		this.setBlock(world, x + 2, y + 0, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 2, y + 1, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 1, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 1, z + 2, Blocks.end_stone, 0);
		this.setBlock(world, x + 2, y + 1, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 1, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 2, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 2, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 2, z + 2, Blocks.end_stone, 0);
		this.setBlock(world, x + 2, y + 2, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 2, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 3, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 3, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 3, z + 2, Blocks.glowstone, 0);
		this.setBlock(world, x + 2, y + 3, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 3, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 4, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 4, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 4, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 4, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 4, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 0, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 3, y + 0, z + 1, Blocks.end_stone, 0);
		this.setBlock(world, x + 3, y + 0, z + 2, Stuff.crystallizedAir, 0);
		this.setBlock(world, x + 3, y + 0, z + 3, Blocks.end_stone, 0);
		this.setBlock(world, x + 3, y + 0, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 3, y + 1, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 1, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 1, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 1, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 1, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 2, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 2, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 2, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 2, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 2, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 3, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 3, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 3, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 3, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 3, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 4, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 4, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 4, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 4, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 3, y + 4, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 0, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 0, z + 1, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 0, z + 2, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 0, z + 3, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 0, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 1, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 1, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 1, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 1, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 1, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 2, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 2, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 2, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 2, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 2, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 3, z + 0, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 3, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 3, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 3, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 3, z + 4, Blocks.end_stone, 0);
		this.setBlock(world, x + 4, y + 4, z + 0, Blocks.skull, 4);
		this.setBlock(world, x + 4, y + 4, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 4, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 4, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 4, z + 4, Blocks.skull, 4);
		
		return true;
	}
}