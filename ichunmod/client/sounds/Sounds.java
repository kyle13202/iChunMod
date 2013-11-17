package ichunmod.client.sounds;

import net.minecraft.client.Minecraft;

public enum Sounds {
	; //Put sound names: XX(soundfilename)
	
	public static final String SOUNDS_LOCATION = "ichunmod";
	private String name;
	
	Sounds(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void play(double x, double y, double z, float volume, float pitch){
		Minecraft.getMinecraft().sndManager.playSound(SOUNDS_LOCATION + ":" + name, (float)x, (float)y, (float)z, volume, pitch);
	}
}
