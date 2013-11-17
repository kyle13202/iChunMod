package ichunmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockIChunOre extends Block{

	public BlockIChunOre(int id, Material material) {
		super(id, material);
		setCreativeTab(CreativeTabs.tabDecorations);
		setHardness(2F);
		setUnlocalizedName(BlockInfo.ICHUNORE_UNLOCALIZED_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOC + ":" + BlockInfo.ICHUNORE_ICONS);
	}
	
}
