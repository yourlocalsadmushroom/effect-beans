package net.sadmush.mushroomstuff.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sadmush.mushroomstuff.MushroomStuff;
import net.sadmush.mushroomstuff.MushroomStuffClient;
import net.sadmush.mushroomstuff.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MUSHROOM_STUFF = Registry.register(Registries.ITEM_GROUP, new Identifier(MushroomStuff.MOD_ID, "spore"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.spore")).icon(() -> new ItemStack(Items.RED_MUSHROOM)).entries((displayContext, entries) -> {
        entries.add(ModItems.SPORE);
        entries.add(ModItems.GLOWING_SPORE);


        entries.add(ModBlocks.SPORE_BLOCK);
    }).build());
    public static void registerItemGroups() {
        MushroomStuff.LOGGER.info("Registering Item Groups " + MushroomStuff.MOD_ID);
    }
}
