package ichunmod.client.particles;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public enum Particles {
	;//Put particle name
	
	public void spawnParticle(World world, double x, double y, double z, double motionX, double motionY, double motionZ, boolean ignore){
		Minecraft mc = Minecraft.getMinecraft();
		if(mc != null && mc.renderViewEntity != null && mc.effectRenderer != null){
			int particleSetting = mc.gameSettings.particleSetting;
			
			double distanceX = mc.renderViewEntity.posX - x;
			double distanceY = mc.renderViewEntity.posY - y;
			double distanceZ = mc.renderViewEntity.posZ - z;
			
			double maxDistance = 16;
			if(distanceX * distanceX + distanceY * distanceY + distanceZ * distanceZ > maxDistance * maxDistance){
				return;
			}
			
			EntityFX particleEffect = null;
			switch(this){
				
			}
			
			if(ignore){
				Minecraft.getMinecraft().effectRenderer.addEffect(particleEffect);
				return;
			}
			
			if(particleSetting == 2 || (particleSetting == 1 && world.rand.nextInt(3) == 0)){
				return;
			}
			
			if(particleEffect != null){
				Minecraft.getMinecraft().effectRenderer.addEffect(particleEffect);
			}
		}
	}
}
