package ichunmod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIChunIngot extends Item{

	public ItemIChunIngot(int id) {
		super(id);
		setUnlocalizedName(ItemInfo.INGOT_UNLOCALIZED_NAME);
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		icons = new Icon[ItemInfo.INGOT_ICONS.length];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = register.registerIcon(ItemInfo.TEXTURE_LOC + ":" + ItemInfo.INGOT_ICONS[i]);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIconFromDamage(int meta){
		return icons[meta];
	}
}
