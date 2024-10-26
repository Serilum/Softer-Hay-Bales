package com.natamus.softerhaybales.events;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class FallEvent {
	public static int onFall(Level world, Entity entity, float f, float g) {
		if (world.isClientSide) {
			return 1;
		}
		
		if (!(entity instanceof Player)) {
			return 1;
		}
		
		BlockPos fallpos = entity.blockPosition().below();
		Block block = world.getBlockState(fallpos).getBlock();
		if (block.equals(Blocks.HAY_BLOCK)) {
			return 0;
		}
		
		return 1;
	}
}
