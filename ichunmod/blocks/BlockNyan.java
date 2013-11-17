package ichunmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNyan extends Block{

	public BlockNyan(int id, Material material) {
		super(id, material);
		setCreativeTab(CreativeTabs.tabDecorations);
		setHardness(2F);
		setUnlocalizedName(BlockInfo.NYAN_UNLOCALIZED_NAME);
	}
	
	
}
