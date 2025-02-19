package com.freetime;

import com.freetime.Creative_Tab.ModGroups;
import com.freetime.block.ModBlocks;
import com.freetime.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFabricMod implements ModInitializer {
	public static final String MOD_ID = "my-fabric-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}