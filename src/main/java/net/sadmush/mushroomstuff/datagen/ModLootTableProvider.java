package net.sadmush.mushroomstuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.sadmush.mushroomstuff.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SPORE_BLOCK);
        addDrop(ModBlocks.GLOWING_SPORE_BLOCK);
        addDrop(ModBlocks.DRIED_SPORE_BLOCK);
        addDrop(ModBlocks.DRIED_GLOWING_SPORE_BLOCK);
        addDrop(ModBlocks.GOO);
        addDrop(ModBlocks.GOO_BRICKS);
        addDrop(ModBlocks.LARGE_GOO_BRICKS);
    }
}
