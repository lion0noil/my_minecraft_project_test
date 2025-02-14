package net.lion.projectmod.datagen;

import net.lion.projectmod.ProjectMod;
import net.lion.projectmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ProjectMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ALEXANDRITE.get());
        basicItem(ModItems.RAW_ALEXANDRITE.get());

        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.KOHLRABI.get());

        basicItem(ModItems.FOOD1.get());
        basicItem(ModItems.FOOD2.get());
        basicItem(ModItems.FOOD3.get());
        basicItem(ModItems.FOOD4.get());
        basicItem(ModItems.FOOD5.get());

        basicItem(ModItems.FOOD6.get());
        basicItem(ModItems.FOOD7.get());
        basicItem(ModItems.FOOD8.get());
        basicItem(ModItems.FOOD9.get());
        basicItem(ModItems.FOOD10.get());

        basicItem(ModItems.FOOD11.get());
        basicItem(ModItems.FOOD12.get());
        basicItem(ModItems.FOOD13.get());
        basicItem(ModItems.FOOD14.get());
        basicItem(ModItems.FOOD15.get());

        basicItem(ModItems.FOOD16.get());
        basicItem(ModItems.FOOD17.get());
        basicItem(ModItems.FOOD18.get());
        basicItem(ModItems.FOOD19.get());
        basicItem(ModItems.FOOD20.get());

        basicItem(ModItems.FOOD21.get());

    }
}
