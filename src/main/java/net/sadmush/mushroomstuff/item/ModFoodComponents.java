package net.sadmush.mushroomstuff.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BAKED_SPORE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100), 0.9f).snack().build();
    public static final FoodComponent SPOREBEAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200), 1f).alwaysEdible().snack().build();
    public static final FoodComponent RED_SPOREBEAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200), 1f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200), 1f).alwaysEdible().snack().build();
    public static final FoodComponent BLUE_SPOREBEAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200), 1f).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200), 1f).alwaysEdible().snack().build();
    public static final FoodComponent GREEN_SPOREBEAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200), 1f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 200), 1f).alwaysEdible().snack().build();
    public static final FoodComponent YELLOW_SPOREBEAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200), 1f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200), 1f).alwaysEdible().snack().build();
    public static final FoodComponent PURPLE_SPOREBEAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1f).alwaysEdible().snack().build();
    public static final FoodComponent GRAY_SPOREBEAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200), 1f).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 200), 1f).alwaysEdible().snack().build();
}
