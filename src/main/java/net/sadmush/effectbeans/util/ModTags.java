package net.sadmush.effectbeans.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.sadmush.effectbeans.Beans;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Beans.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SPOREBEANS =
                createTag("sporebeans");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Beans.MOD_ID, name));
        }
    }
}
