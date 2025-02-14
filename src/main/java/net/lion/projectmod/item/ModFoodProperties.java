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

    public static final FoodProperties FOOD6 = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5F).build();
    public static final FoodProperties FOOD7 = new FoodProperties.Builder().nutrition(9).saturationModifier(0.45F).build();
    public static final FoodProperties FOOD8 = new FoodProperties.Builder().nutrition(16).saturationModifier(0.8F).build();
    public static final FoodProperties FOOD9 = new FoodProperties.Builder().nutrition(7).saturationModifier(0.35F).build();
    public static final FoodProperties FOOD10 = new FoodProperties.Builder().nutrition(6).saturationModifier(0.3F).build();

    public static final FoodProperties FOOD11 = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4F).build();
    public static final FoodProperties FOOD12 = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5F).build();
    public static final FoodProperties FOOD13 = new FoodProperties.Builder().nutrition(14).saturationModifier(0.65F).build();
    public static final FoodProperties FOOD14 = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5F).build();
    public static final FoodProperties FOOD15 = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5F).build();

    public static final FoodProperties FOOD16 = new FoodProperties.Builder().nutrition(7).saturationModifier(0.35F).build();
    public static final FoodProperties FOOD17 = new FoodProperties.Builder().nutrition(9).saturationModifier(0.45F).build();
    public static final FoodProperties FOOD18 = new FoodProperties.Builder().nutrition(7).saturationModifier(0.35F).build();
    public static final FoodProperties FOOD19 = new FoodProperties.Builder().nutrition(13).saturationModifier(0.65F).build();
    public static final FoodProperties FOOD20 = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4F).build();

    public static final FoodProperties FOOD21 = new FoodProperties.Builder().nutrition(4).saturationModifier(0.2F).build();

}
