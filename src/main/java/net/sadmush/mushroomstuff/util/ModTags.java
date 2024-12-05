package net.sadmush.mushroomstuff.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sadmush.mushroomstuff.MushroomStuff;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SPORE_HARVESTER_HARVEST_BLOCKS =
                createTag("spore_harvester_harvest_blocks");
        public static final TagKey<Block> SPORE_HARVESTER_HARVEST_PLANTS =
                createTag("spore_harvester_harvest_plants");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MushroomStuff.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SPOREBEANS =
                createTag("sporebeans");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MushroomStuff.MOD_ID, name));
        }
    }
}
