package net.lion.projectmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY,400),0.20f).build();

    public static final FoodProperties FOOD1 = new FoodProperties.Builder().nutrition(6).saturationModifier(0.3F).build();
    public static final FoodProperties FOOD2 = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5F).build();
    public static final FoodProperties FOOD3 = new FoodProperties.Builder().nutrition(5).saturationModifier(0.25F).build();
    public static final FoodProperties FOOD4 = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4F).build();
    public static final FoodProperties FOOD5 = new FoodProperties.Builder().nutrition(12).saturationModifier(0.6F).build();

}
