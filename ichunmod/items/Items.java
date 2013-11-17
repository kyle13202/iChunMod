package ichunmod.items;

import net.minecraft.item.Item;

public class Items {
	public static Item nyanEssence;
	public static Item iChunIngot;
	
	public static void initItems(){
		nyanEssence = new ItemNyanEssence(ItemInfo.NYANESSENCE_ID);
		iChunIngot = new ItemIChunIngot(ItemInfo.INGOT_ID);
	}
	
	@Deprecated
	public static void addNames(){
		
	}
}
