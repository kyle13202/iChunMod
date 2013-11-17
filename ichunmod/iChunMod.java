package ichunmod;

import ichunmod.config.ConfigHandler;
import ichunmod.lib.Reference;
import ichunmod.network.PacketHandler;
import ichunmod.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(
		modid = Reference.MOD_ID,
		name = Reference.MOD_NAME,
		version = Reference.VERSION
		)
@NetworkMod(
		channels = {Reference.CHANNELS},
		clientSideRequired = true,
		serverSideRequired = false,
		packetHandler = PacketHandler.class
		)
public class iChunMod {
	
	@Instance(Reference.MOD_ID)
	public static iChunMod instance;
	
	@SidedProxy(clientSide = "ichunmod.proxy.ClientProxy", serverSide = "ichunmod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
