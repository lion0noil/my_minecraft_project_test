package net.lion.projectmod.item;

import net.lion.projectmod.ProjectMod;
import net.lion.projectmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("alexandrite_items_tab",
            () -> CreativeModeTab.builder().icon(() ->new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creative.lionprojectmod.alexandrite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());

                        output.accept(ModItems.CHISEL.get());

                        output.accept(ModItems.KOHLRABI.get());


                    }).build());

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("alexandrite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() ->new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get()))
                    .withTabsBefore(ALEXANDRITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creative.lionprojectmod.alexandrite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

                        output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());

                        output.accept(ModBlocks.MAGIC_BLOCK.get());


                    }).build());


    public static final RegistryObject<CreativeModeTab> NORTHERN_THAI_FOOD = CREATIVE_MODE_TABS.register("northern_thai_food",
            () -> CreativeModeTab.builder().icon(() ->new ItemStack(ModItems.FOOD1.get()))
                    .withTabsBefore(ALEXANDRITE_BLOCKS_TAB.getId())
                    .title(Component.translatable("creative.lionprojectmod.northern_thai_food"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.RICE.get());
                        output.accept(ModItems.NOODLE.get());

                        output.accept(ModItems.FOOD1.get());
                        output.accept(ModItems.FOOD2.get());
                        output.accept(ModItems.FOOD3.get());
                        output.accept(ModItems.FOOD4.get());
                        output.accept(ModItems.FOOD5.get());

                        output.accept(ModItems.FOOD6.get());
                        output.accept(ModItems.FOOD7.get());
                        output.accept(ModItems.FOOD8.get());
                        output.accept(ModItems.FOOD9.get());
                        output.accept(ModItems.FOOD10.get());

                        output.accept(ModItems.FOOD11.get());
                        output.accept(ModItems.FOOD12.get());
                        output.accept(ModItems.FOOD13.get());
                        output.accept(ModItems.FOOD14.get());
                        output.accept(ModItems.FOOD15.get());

                        output.accept(ModItems.FOOD16.get());
                        output.accept(ModItems.FOOD17.get());
                        output.accept(ModItems.FOOD18.get());
                        output.accept(ModItems.FOOD19.get());
                        output.accept(ModItems.FOOD20.get());

                        output.accept(ModItems.FOOD21.get());


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
