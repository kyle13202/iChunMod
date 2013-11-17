package ichunmod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNyanEssence extends Item{

	public ItemNyanEssence(int id) {
		super(id);
		setUnlocalizedName(ItemInfo.NYANESSENCE_UNLOCALIZED_NAME);
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(64);
	}
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOC + ":" + ItemInfo.NYANESSENCE_ICON);
	}
}
