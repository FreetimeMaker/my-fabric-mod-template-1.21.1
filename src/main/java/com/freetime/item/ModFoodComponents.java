package com.freetime.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent GOLDEN_BEEF_COOKED = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200), 0.15f).build();

    public static final FoodComponent GOLDEN_BEEF_RAW = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();

}
