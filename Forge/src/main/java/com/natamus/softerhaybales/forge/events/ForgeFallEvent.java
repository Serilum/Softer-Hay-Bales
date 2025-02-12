package com.natamus.softerhaybales.forge.events;

import com.natamus.softerhaybales.events.FallEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeFallEvent {
	@SubscribeEvent
	public static void onFall(LivingFallEvent e) {
		LivingEntity livingEntity = e.getEntity();
		if (FallEvent.onFall(livingEntity.level(), livingEntity, 0, 0) == 0) {
			e.setCanceled(true);
		}
	}
}
