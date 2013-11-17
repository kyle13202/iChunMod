package ichunmod.config;

import ichunmod.blocks.BlockInfo;
import ichunmod.items.ItemInfo;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	
	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();
		
		BlockInfo.ICHUNORE_ID = config.getBlock(BlockInfo.ICHUNORE_KEY, BlockInfo.ICHUNORE_DEFAULT).getInt();
		BlockInfo.NYAN_ID = config.getBlock(BlockInfo.NYAN_KEY, BlockInfo.NYAN_DEFAULT).getInt();
		
		ItemInfo.INGOT_ID = config.getItem(ItemInfo.INGOT_KEY, ItemInfo.INGOT_DEFAULT).getInt() - 256;
		ItemInfo.NYANESSENCE_ID = config.getItem(ItemInfo.NYANESSENCE_KEY, ItemInfo.NYANESSENCE_DEFAULT).getInt() - 256;
		
		config.save();
	}
}
