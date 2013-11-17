package ichunmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIChunIngot extends Item{

	public ItemIChunIngot(int id) {
		super(id);
		setUnlocalizedName(ItemInfo.INGOT_UNLOCALIZED_NAME);
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(64);
	}
	
}
