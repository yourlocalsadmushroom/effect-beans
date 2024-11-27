package net.sadmush.mushroomstuff.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sadmush.mushroomstuff.MushroomStuff;
import net.sadmush.mushroomstuff.item.custom.GoopVacuumItem;

public class ModItems {

    public static final Item SPORE = registerItem("spore", new Item(new FabricItemSettings()));
    public static final Item GLOWING_SPORE = registerItem("glowing_spore", new Item(new FabricItemSettings()));
    public static final Item ECHO_CLUSTER = registerItem("echo_cluster", new Item(new FabricItemSettings()));

    public static final Item GOOP_VACUUM = registerItem("goop_vacuum", new GoopVacuumItem(new FabricItemSettings().maxDamage(10)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SPORE);
        entries.add(GLOWING_SPORE);
        entries.add(ECHO_CLUSTER);
    }

    private static Item registerItem(String name, Item item) {
        MushroomStuff.LOGGER.info("Registering " + name);
        return Registry.register(Registries.ITEM, new Identifier(MushroomStuff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MushroomStuff.LOGGER.info("Registered Mod Items for " + MushroomStuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
