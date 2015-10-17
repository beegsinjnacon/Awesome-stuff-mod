package com.stuff.stuffmod;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderHyperSpace extends WorldProvider {

	public void RegisterWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.sky, 0.1F);
		this.dimensionId = Stuff.dimension;
	}

	@Override
	public String getDimensionName() {
		// TODO Auto-generated method stub
		return "HyperSpace";
	}
	
	@Override
	public String getSaveFolder() {
		return "DIM-HyperSpace";
	}
	
	@Override
	public boolean canRespawnHere() {
		return true;
	}
	@Override
	public IChunkProvider createChunkGenerator(){
	return new ChunkProviderHyperSpace(worldObj, worldObj.getSeed());
	}
}
