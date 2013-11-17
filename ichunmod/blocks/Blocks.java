package ichunmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
	public static Block nyanBlock;
	public static Block iChunOre;
	
	public static void initBlocks(){
		nyanBlock = new BlockNyan(BlockInfo.NYAN_ID, Material.clay);
		iChunOre = new BlockIChunOre(BlockInfo.ICHUNORE_ID, Material.iron);
	}
	
	@Deprecated
	public static void addNames(){
		
	}
}
