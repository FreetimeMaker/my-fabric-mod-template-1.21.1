package com.freetime.item;

import com.freetime.MyFabricMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GOLDEN_BEEF_COOKED = registerItem("golden_beef_cooked", new Item(new Item.Settings()));
    public static final Item GOLDEN_BEEF_RAW = registerItem("golden_beef_raw", new Item(new Item.Settings()));
    public static final Item RAW_GOLDEN_INGOT = registerItem("raw_golden_ingot", new Item(new Item.Settings()));
    public static final Item GOLDEN_INGOT = registerItem("golden_ingot", new Item(new Item.Settings()));
    public static final Item GOLDEN_GROUP_ICON = registerItem("golden_group_icon", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MyFabricMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MyFabricMod.LOGGER.info("Registering Mod Items for " + MyFabricMod.MOD_ID);
    }
}
