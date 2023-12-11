package com.natamus.softerhaybales.neoforge.events;

import com.natamus.softerhaybales.events.FallEvent;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.event.entity.living.LivingFallEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeFallEvent {
	@SubscribeEvent
	public static void onFall(LivingFallEvent e) {
		LivingEntity livingEntity = e.getEntity();
		if (FallEvent.onFall(livingEntity.level(), livingEntity, 0, 0) == 0) {
			e.setCanceled(true);
		}
	}
}
