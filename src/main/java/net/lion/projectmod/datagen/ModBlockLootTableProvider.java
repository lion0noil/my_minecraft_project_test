package net.lion.projectmod.datagen;

import net.lion.projectmod.block.ModBlocks;
import net.lion.projectmod.block.custom.KohlrabiCropBlock;
import net.lion.projectmod.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ALEXANDRITE_BLOCK.get());
        dropSelf(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
        dropSelf(ModBlocks.MAGIC_BLOCK.get());

        this.add(ModBlocks.ALEXANDRITE_ORE.get(),
                block -> createOreDrop(ModBlocks.ALEXANDRITE_ORE.get(), ModItems.RAW_ALEXANDRITE.get()));
        this.add(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get(), ModItems.RAW_ALEXANDRITE.get(), 2,6));

        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.KOHLRABI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(KohlrabiCropBlock.AGE, KohlrabiCropBlock.MAX_AGE));

        this.add(ModBlocks.KOHLRABI_CROP.get(), this.createCropDrops(ModBlocks.KOHLRABI_CROP.get(),
                ModItems.KOHLRABI.get(), ModItems.KOHLRABI.get(), lootItemConditionBuilder));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock,
                (LootPoolEntryContainer.Builder<?>)this.applyExplosionDecay(
                        pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
