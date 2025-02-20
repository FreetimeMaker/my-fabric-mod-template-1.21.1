package com.freetime.Creative_Tab;

import com.freetime.MyFabricMod;
import com.freetime.block.ModBlocks;
import com.freetime.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModGroups {
    public static final ItemGroup GOLDEN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MyFabricMod.MOD_ID, "golden_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.GOLDEN_GROUP_ICON))
                    .displayName(Text.translatable("itemgroup.my-fabric-mod.golden_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLDEN_BEEF_COOKED);
                        entries.add(ModItems.GOLDEN_BEEF_RAW);
                        entries.add(ModItems.RAW_GOLDEN_INGOT);
                        entries.add(ModItems.GOLDEN_INGOT);
                        entries.add(ModBlocks.GOLDEN_BLOCK);
                        entries.add(ModBlocks.RAW_GOLDEN_BLOCK);
                    }).build());


    
    public static void registerItemGroups() {
        MyFabricMod.LOGGER.info("Registering Item groups for " + MyFabricMod.MOD_ID);
    }
}
