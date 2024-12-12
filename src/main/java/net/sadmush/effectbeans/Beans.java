package net.sadmush.effectbeans;

import net.fabricmc.api.ModInitializer;

import net.sadmush.effectbeans.block.ModBlocks;
import net.sadmush.effectbeans.item.ModItemGroups;
import net.sadmush.effectbeans.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Beans implements ModInitializer {
	public static final String MOD_ID = "effect-beans";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Effect Beans initialized | Hope you enjoy the funny beans!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}