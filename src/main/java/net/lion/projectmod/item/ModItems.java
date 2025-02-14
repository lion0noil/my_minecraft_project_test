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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
