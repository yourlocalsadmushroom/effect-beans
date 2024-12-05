package net.sadmush.mushroomstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.sadmush.mushroomstuff.block.ModBlocks;
import net.sadmush.mushroomstuff.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOWING_SPORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIED_SPORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIED_GLOWING_SPORE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOO);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOO_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LARGE_GOO_BRICKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SPORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOWING_SPORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAKED_SPORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNT_SPORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ECHO_CLUSTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPORE_HARVESTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPORE_HARVESTER_80, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPORE_HARVESTER_60, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPORE_HARVESTER_40, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPORE_HARVESTER_20, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPOREBEAN_BAG_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN_BAG_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN_BAG_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN_BAG_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN_BAG_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN_BAG_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN_BAG_1, Models.GENERATED);
    }
}
