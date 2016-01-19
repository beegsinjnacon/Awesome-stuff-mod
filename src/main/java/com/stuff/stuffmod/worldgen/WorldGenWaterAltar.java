/*
*** MADE BY MRPONYCAPTAIN'S .SCHEMATIC TO .JAVA CONVERTING TOOL v2.0 ***
*/

package com.stuff.stuffmod.worldgen;

import java.util.Random;

import com.stuff.stuffmod.Stuff;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenWaterAltar extends WorldGenerator implements IWorldGenerator
{
	protected Block[] getValidSpawnBlocks() {
		return new Block[] {
			Blocks.water
		};
	}

	public boolean locationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		Block check = world.getBlock(i, j, k);

		while (check != Blocks.air){
			if (distanceToAir > 3){
				return false;
			}

			distanceToAir++;
			check = world.getBlock(i, j + distanceToAir, k);
		}

		j += distanceToAir - 1;

		Block block = world.getBlock(i, j, k);
		Block blockAbove = world.getBlock(i, j+1, k);
		Block blockBelow = world.getBlock(i, j-1, k);
		
		for (Block x : getValidSpawnBlocks()){
			if (blockAbove != Blocks.air){
				return false;
			}
			if (block == x){
				return true;
			}else if (block == Blocks.snow && blockBelow == x){
				return true;
			}
		}
		
		return false;
	}

	public WorldGenWaterAltar() { }

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

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		//check that each corner is one of the valid spawn blocks
		if(!locationIsValidSpawn(world, x, y, z) || !locationIsValidSpawn(world, x + 4, y, z) || !locationIsValidSpawn(world, x + 4, y, z + 4) || !locationIsValidSpawn(world, x, y, z + 4))
		{
			return false;
		}

		z = z - 10;
		x = x - 10;

		this.setBlock(world, x + 0, y + 0, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 0, z + 1, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 0, z + 2, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 0, z + 3, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 0, z + 4, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 1, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 1, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 1, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 1, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 1, z + 4, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 2, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 2, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 2, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 2, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 2, z + 4, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 3, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 3, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 3, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 3, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 3, z + 4, Blocks.packed_ice, 0);
		this.setBlock(world, x + 0, y + 4, z + 0, Blocks.skull, 2);
		this.setBlock(world, x + 0, y + 4, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 4, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 4, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 0, y + 4, z + 4, Blocks.skull, 2);
		this.setBlock(world, x + 1, y + 0, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 1, y + 0, z + 1, Blocks.packed_ice, 0);
		this.setBlock(world, x + 1, y + 0, z + 2, Stuff.crystallizedWater, 0);
		this.setBlock(world, x + 1, y + 0, z + 3, Blocks.packed_ice, 0);
		this.setBlock(world, x + 1, y + 0, z + 4, Blocks.packed_ice, 0);
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
		this.setBlock(world, x + 2, y + 0, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 2, y + 0, z + 1, Stuff.crystallizedWater, 0);
		this.setBlock(world, x + 2, y + 0, z + 2, Blocks.packed_ice, 0);
		this.setBlock(world, x + 2, y + 0, z + 3, Stuff.crystallizedWater, 0);
		this.setBlock(world, x + 2, y + 0, z + 4, Blocks.packed_ice, 0);
		this.setBlock(world, x + 2, y + 1, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 1, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 1, z + 2, Blocks.packed_ice, 0);
		this.setBlock(world, x + 2, y + 1, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 1, z + 4, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 2, z + 0, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 2, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 2, y + 2, z + 2, Blocks.packed_ice, 0);
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
		this.setBlock(world, x + 3, y + 0, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 3, y + 0, z + 1, Blocks.packed_ice, 0);
		this.setBlock(world, x + 3, y + 0, z + 2, Stuff.crystallizedWater, 0);
		this.setBlock(world, x + 3, y + 0, z + 3, Blocks.packed_ice, 0);
		this.setBlock(world, x + 3, y + 0, z + 4, Blocks.packed_ice, 0);
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
		this.setBlock(world, x + 4, y + 0, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 0, z + 1, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 0, z + 2, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 0, z + 3, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 0, z + 4, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 1, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 1, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 1, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 1, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 1, z + 4, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 2, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 2, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 2, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 2, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 2, z + 4, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 3, z + 0, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 3, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 3, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 3, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 3, z + 4, Blocks.packed_ice, 0);
		this.setBlock(world, x + 4, y + 4, z + 0, Blocks.air, 1);
		this.setBlock(world, x + 4, y + 4, z + 1, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 4, z + 2, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 4, z + 3, Blocks.air, 0);
		this.setBlock(world, x + 4, y + 4, z + 4, Blocks.air, 1);

		return true;
	}
}