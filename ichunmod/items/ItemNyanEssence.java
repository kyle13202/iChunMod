package ichunmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemNyanEssence extends Item{

	public ItemNyanEssence(int id) {
		super(id);
		setUnlocalizedName(ItemInfo.NYANESSENCE_UNLOCALIZED_NAME);
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(64);
	}
	
}
