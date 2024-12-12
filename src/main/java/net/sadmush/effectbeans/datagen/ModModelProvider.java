package net.sadmush.effectbeans.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.sadmush.effectbeans.block.ModBlocks;
import net.sadmush.effectbeans.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SPOREBEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPOREBEAN, Models.GENERATED);
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
        itemModelGenerator.register(ModItems.PINK_SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_SPOREBEAN_BAG_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_SPOREBEAN_BAG_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPOREBEAN_BAG, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPOREBEAN_BAG_7, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPOREBEAN_BAG_6, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPOREBEAN_BAG_5, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPOREBEAN_BAG_4, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPOREBEAN_BAG_3, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPOREBEAN_BAG_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_SPOREBEAN_BAG_1, Models.GENERATED);
    }
}
