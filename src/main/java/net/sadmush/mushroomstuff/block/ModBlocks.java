package net.sadmush.mushroomstuff.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.sadmush.mushroomstuff.MushroomStuff;

public class ModBlocks {
    public static final Block SPORE_BLOCK = registerBlock("spore_block",new Block(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK)));
    private static Block registerBlock(String name, Block block) {
        registerBlock(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MushroomStuff.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MushroomStuff.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        MushroomStuff.LOGGER.info("Registering ModBlocks for " + MushroomStuff.MOD_ID);
    }
}
