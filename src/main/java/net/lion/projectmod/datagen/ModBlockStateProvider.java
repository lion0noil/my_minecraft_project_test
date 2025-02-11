package net.lion.projectmod.datagen;

import net.lion.projectmod.ProjectMod;
import net.lion.projectmod.block.ModBlocks;
import net.lion.projectmod.block.custom.KohlrabiCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ProjectMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ALEXANDRITE_BLOCK);
        blockWithItem(ModBlocks.RAW_ALEXANDRITE_BLOCK);

        blockWithItem(ModBlocks.ALEXANDRITE_ORE);
        blockWithItem(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE);

        blockWithItem(ModBlocks.MAGIC_BLOCK);

        makeCrop(((CropBlock) ModBlocks.KOHLRABI_CROP.get()), "kohlrabi_crop_stage","kohlrabi_crop_stage");
    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((KohlrabiCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(ProjectMod.MOD_ID, "block/" + textureName + state.getValue(((KohlrabiCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
