package net.sadmush.effectbeans.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.sadmush.effectbeans.Beans;

public class ModBlocks {
    private static Block registerBlock(String name, Block block) {
        Beans.LOGGER.info("Registering " + name);
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Beans.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Beans.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        Beans.LOGGER.info("Registered ModBlocks for " + Beans.MOD_ID);
    }
}
