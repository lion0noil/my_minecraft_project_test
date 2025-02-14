package net.lion.projectmod.item;

import net.lion.projectmod.ProjectMod;
import net.lion.projectmod.block.ModBlocks;
import net.lion.projectmod.item.custom.ChiselItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProjectMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new ItemNameBlockItem(ModBlocks.KOHLRABI_CROP.get(),
                    new Item.Properties().food(ModFoodProperties.KOHLRABI)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.lionprojectmod.kohlrabi"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> FOOD1 = ITEMS.register("food1",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD1)));
    public static final RegistryObject<Item> FOOD2 = ITEMS.register("food2",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD2)));
    public static final RegistryObject<Item> FOOD3 = ITEMS.register("food3",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD3)));
    public static final RegistryObject<Item> FOOD4 = ITEMS.register("food4",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD4)));
    public static final RegistryObject<Item> FOOD5 = ITEMS.register("food5",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD5)));

    public static final RegistryObject<Item> FOOD6 = ITEMS.register("food6",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD6)));
    public static final RegistryObject<Item> FOOD7 = ITEMS.register("food7",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD7)));
    public static final RegistryObject<Item> FOOD8 = ITEMS.register("food8",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD8)));
    public static final RegistryObject<Item> FOOD9 = ITEMS.register("food9",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD9)));
    public static final RegistryObject<Item> FOOD10 = ITEMS.register("food10",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD10)));

    public static final RegistryObject<Item> FOOD11 = ITEMS.register("food11",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD11)));
    public static final RegistryObject<Item> FOOD12 = ITEMS.register("food12",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD12)));
    public static final RegistryObject<Item> FOOD13 = ITEMS.register("food13",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD13)));
    public static final RegistryObject<Item> FOOD14 = ITEMS.register("food14",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD14)));
    public static final RegistryObject<Item> FOOD15 = ITEMS.register("food15",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD15)));

    public static final RegistryObject<Item> FOOD16 = ITEMS.register("food16",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD16)));
    public static final RegistryObject<Item> FOOD17 = ITEMS.register("food17",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD17)));
    public static final RegistryObject<Item> FOOD18 = ITEMS.register("food18",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD18)));
    public static final RegistryObject<Item> FOOD19 = ITEMS.register("food19",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD19)));
    public static final RegistryObject<Item> FOOD20 = ITEMS.register("food20",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD20)));

    public static final RegistryObject<Item> FOOD21 = ITEMS.register("food21",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOOD21)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
