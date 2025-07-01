package com.natamus.softerhaybales.forge.events;

import com.natamus.softerhaybales.events.FallEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeFallEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeFallEvent.class);

		LivingFallEvent.BUS.addListener(ForgeFallEvent::onFall);
	}

	@SubscribeEvent
	public static boolean onFall(LivingFallEvent e) {
		LivingEntity livingEntity = e.getEntity();
		if (FallEvent.onFall(livingEntity.level(), livingEntity, 0, 0) == 0) {
			return true;
		}
		return false;
	}
}
