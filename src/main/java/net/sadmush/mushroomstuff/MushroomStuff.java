package net.sadmush.mushroomstuff;

import net.fabricmc.api.ModInitializer;

import net.sadmush.mushroomstuff.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MushroomStuff implements ModInitializer {
	public static final String MOD_ID = "mushroom-stuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("MushroomStuff initialized | Hope you enjoy the funny mushroom blocks!");
		ModItems.registerModItems();
	}
}