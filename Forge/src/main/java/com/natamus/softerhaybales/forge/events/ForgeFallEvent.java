package com.natamus.softerhaybales.forge.events;

import com.natamus.softerhaybales.events.FallEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeFallEvent {
	@SubscribeEvent
	public void onFall(LivingFallEvent e) {
		LivingEntity livingEntity = e.getEntityLiving();
		if (FallEvent.onFall(livingEntity.level, livingEntity, 0, 0) == 0) {
			e.setCanceled(true);
		}
	}
}
