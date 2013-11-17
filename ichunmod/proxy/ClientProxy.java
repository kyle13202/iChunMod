package ichunmod.proxy;

import ichunmod.client.sounds.SoundHandler;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void initSounds(){
		new SoundHandler();
	}
	
	@Override
	public void initRenders(){
		
	}
}
