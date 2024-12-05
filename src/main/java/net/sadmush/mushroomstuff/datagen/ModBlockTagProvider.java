package net.sadmush.mushroomstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.sadmush.mushroomstuff.block.ModBlocks;
import net.sadmush.mushroomstuff.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Blocks.SPORE_HARVESTER_HARVEST_BLOCKS)
                .add(Blocks.MUSHROOM_STEM)
                .add(Blocks.RED_MUSHROOM_BLOCK)
                .add(Blocks.BROWN_MUSHROOM_BLOCK)
        ;
        getOrCreateTagBuilder(ModTags.Blocks.SPORE_HARVESTER_HARVEST_PLANTS)
                .add(Blocks.RED_MUSHROOM)
                .add(Blocks.BROWN_MUSHROOM)
        ;
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.SPORE_BLOCK)
                .add(ModBlocks.GLOWING_SPORE_BLOCK)
                .add(ModBlocks.DRIED_SPORE_BLOCK)
                .add(ModBlocks.DRIED_GLOWING_SPORE_BLOCK)
                .add(ModBlocks.GOO)
        ;
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GOO_BRICKS)
                .add(ModBlocks.LARGE_GOO_BRICKS)
        ;
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SPORE_BLOCK)
                .add(ModBlocks.GLOWING_SPORE_BLOCK)
                .add(ModBlocks.DRIED_SPORE_BLOCK)
                .add(ModBlocks.DRIED_GLOWING_SPORE_BLOCK)
                .add(ModBlocks.GOO)
                .add(ModBlocks.GOO_BRICKS)
                .add(ModBlocks.LARGE_GOO_BRICKS)
        ;
    }
}
