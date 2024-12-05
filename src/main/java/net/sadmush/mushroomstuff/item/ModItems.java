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
import net.sadmush.mushroomstuff.item.custom.*;

public class ModItems {

    public static final Item SPORE = registerItem("spore", new Item(new FabricItemSettings()));
    public static final Item BURNT_SPORE = registerItem("burnt_spore", new Item(new FabricItemSettings()));
    public static final Item GLOWING_SPORE = registerItem("glowing_spore", new Item(new FabricItemSettings()));
    public static final Item ECHO_CLUSTER = registerItem("echo_cluster", new Item(new FabricItemSettings()));

    public static final Item BAKED_SPORE = registerItem("baked_spore", new Item(new FabricItemSettings().food(ModFoodComponents.BAKED_SPORE)));
    public static final Item SPOREBEAN = registerItem("sporebean", new Item(new FabricItemSettings().food(ModFoodComponents.SPOREBEAN).maxCount(1)));
    public static final Item RED_SPOREBEAN = registerItem("red_sporebean", new Item(new FabricItemSettings().food(ModFoodComponents.RED_SPOREBEAN).maxCount(1)));
    public static final Item BLUE_SPOREBEAN = registerItem("blue_sporebean", new Item(new FabricItemSettings().food(ModFoodComponents.BLUE_SPOREBEAN).maxCount(1)));
    public static final Item GREEN_SPOREBEAN = registerItem("green_sporebean", new Item(new FabricItemSettings().food(ModFoodComponents.GREEN_SPOREBEAN).maxCount(1)));
    public static final Item YELLOW_SPOREBEAN = registerItem("yellow_sporebean", new Item(new FabricItemSettings().food(ModFoodComponents.YELLOW_SPOREBEAN).maxCount(1)));
    public static final Item PURPLE_SPOREBEAN = registerItem("purple_sporebean", new Item(new FabricItemSettings().food(ModFoodComponents.PURPLE_SPOREBEAN).maxCount(1)));
    public static final Item GRAY_SPOREBEAN = registerItem("gray_sporebean", new Item(new FabricItemSettings().food(ModFoodComponents.GRAY_SPOREBEAN).maxCount(1)));

    public static final Item SPORE_HARVESTER = registerItem("spore_harvester", new SporeHarvesterItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPORE_HARVESTER_80 = registerItem("spore_harvester_80", new SporeHarvesterItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPORE_HARVESTER_60 = registerItem("spore_harvester_60", new SporeHarvesterItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPORE_HARVESTER_40 = registerItem("spore_harvester_40", new SporeHarvesterItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPORE_HARVESTER_20 = registerItem("spore_harvester_20", new SporeHarvesterItem(new FabricItemSettings().maxCount(1)));

    public static final Item SPOREBEAN_BAG = registerItem("sporebean_bag", new SporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPOREBEAN_BAG_7 = registerItem("sporebean_bag_7", new SporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPOREBEAN_BAG_6 = registerItem("sporebean_bag_6", new SporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPOREBEAN_BAG_5 = registerItem("sporebean_bag_5", new SporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPOREBEAN_BAG_4 = registerItem("sporebean_bag_4", new SporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPOREBEAN_BAG_3 = registerItem("sporebean_bag_3", new SporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPOREBEAN_BAG_2 = registerItem("sporebean_bag_2", new SporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPOREBEAN_BAG_1 = registerItem("sporebean_bag_1", new SporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item RED_SPOREBEAN_BAG = registerItem("red_sporebean_bag", new RedSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item RED_SPOREBEAN_BAG_7 = registerItem("red_sporebean_bag_7", new RedSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item RED_SPOREBEAN_BAG_6 = registerItem("red_sporebean_bag_6", new RedSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item RED_SPOREBEAN_BAG_5 = registerItem("red_sporebean_bag_5", new RedSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item RED_SPOREBEAN_BAG_4 = registerItem("red_sporebean_bag_4", new RedSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item RED_SPOREBEAN_BAG_3 = registerItem("red_sporebean_bag_3", new RedSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item RED_SPOREBEAN_BAG_2 = registerItem("red_sporebean_bag_2", new RedSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item RED_SPOREBEAN_BAG_1 = registerItem("red_sporebean_bag_1", new RedSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_SPOREBEAN_BAG = registerItem("blue_sporebean_bag", new BlueSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_SPOREBEAN_BAG_7 = registerItem("blue_sporebean_bag_7", new BlueSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_SPOREBEAN_BAG_6 = registerItem("blue_sporebean_bag_6", new BlueSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_SPOREBEAN_BAG_5 = registerItem("blue_sporebean_bag_5", new BlueSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_SPOREBEAN_BAG_4 = registerItem("blue_sporebean_bag_4", new BlueSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_SPOREBEAN_BAG_3 = registerItem("blue_sporebean_bag_3", new BlueSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_SPOREBEAN_BAG_2 = registerItem("blue_sporebean_bag_2", new BlueSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item BLUE_SPOREBEAN_BAG_1 = registerItem("blue_sporebean_bag_1", new BlueSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_SPOREBEAN_BAG = registerItem("gray_sporebean_bag", new GraySporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_SPOREBEAN_BAG_7 = registerItem("gray_sporebean_bag_7", new GraySporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_SPOREBEAN_BAG_6 = registerItem("gray_sporebean_bag_6", new GraySporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_SPOREBEAN_BAG_5 = registerItem("gray_sporebean_bag_5", new GraySporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_SPOREBEAN_BAG_4 = registerItem("gray_sporebean_bag_4", new GraySporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_SPOREBEAN_BAG_3 = registerItem("gray_sporebean_bag_3", new GraySporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_SPOREBEAN_BAG_2 = registerItem("gray_sporebean_bag_2", new GraySporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GRAY_SPOREBEAN_BAG_1 = registerItem("gray_sporebean_bag_1", new GraySporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_SPOREBEAN_BAG = registerItem("green_sporebean_bag", new GreenSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_SPOREBEAN_BAG_7 = registerItem("green_sporebean_bag_7", new GreenSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_SPOREBEAN_BAG_6 = registerItem("green_sporebean_bag_6", new GreenSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_SPOREBEAN_BAG_5 = registerItem("green_sporebean_bag_5", new GreenSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_SPOREBEAN_BAG_4 = registerItem("green_sporebean_bag_4", new GreenSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_SPOREBEAN_BAG_3 = registerItem("green_sporebean_bag_3", new GreenSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_SPOREBEAN_BAG_2 = registerItem("green_sporebean_bag_2", new GreenSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item GREEN_SPOREBEAN_BAG_1 = registerItem("green_sporebean_bag_1", new GreenSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_SPOREBEAN_BAG = registerItem("yellow_sporebean_bag", new YellowSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_SPOREBEAN_BAG_7 = registerItem("yellow_sporebean_bag_7", new YellowSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_SPOREBEAN_BAG_6 = registerItem("yellow_sporebean_bag_6", new YellowSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_SPOREBEAN_BAG_5 = registerItem("yellow_sporebean_bag_5", new YellowSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_SPOREBEAN_BAG_4 = registerItem("yellow_sporebean_bag_4", new YellowSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_SPOREBEAN_BAG_3 = registerItem("yellow_sporebean_bag_3", new YellowSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_SPOREBEAN_BAG_2 = registerItem("yellow_sporebean_bag_2", new YellowSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item YELLOW_SPOREBEAN_BAG_1 = registerItem("yellow_sporebean_bag_1", new YellowSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_SPOREBEAN_BAG = registerItem("purple_sporebean_bag", new PurpleSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_SPOREBEAN_BAG_7 = registerItem("purple_sporebean_bag_7", new PurpleSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_SPOREBEAN_BAG_6 = registerItem("purple_sporebean_bag_6", new PurpleSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_SPOREBEAN_BAG_5 = registerItem("purple_sporebean_bag_5", new PurpleSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_SPOREBEAN_BAG_4 = registerItem("purple_sporebean_bag_4", new PurpleSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_SPOREBEAN_BAG_3 = registerItem("purple_sporebean_bag_3", new PurpleSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_SPOREBEAN_BAG_2 = registerItem("purple_sporebean_bag_2", new PurpleSporebeanBagItem(new FabricItemSettings().maxCount(1)));
    public static final Item PURPLE_SPOREBEAN_BAG_1 = registerItem("purple_sporebean_bag_1", new PurpleSporebeanBagItem(new FabricItemSettings().maxCount(1)));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SPORE);
        entries.add(GLOWING_SPORE);
        entries.add(ECHO_CLUSTER);
    }

    private static void addItemsToFoodTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BAKED_SPORE);
        entries.add(SPOREBEAN);
        entries.add(RED_SPOREBEAN);
        entries.add(BLUE_SPOREBEAN);
        entries.add(GREEN_SPOREBEAN);
        entries.add(YELLOW_SPOREBEAN);
        entries.add(PURPLE_SPOREBEAN);
        entries.add(GRAY_SPOREBEAN);
    }

    private static Item registerItem(String name, Item item) {
        MushroomStuff.LOGGER.info("Registering " + name);
        return Registry.register(Registries.ITEM, new Identifier(MushroomStuff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MushroomStuff.LOGGER.info("Registered Mod Items for " + MushroomStuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTabItemGroup);
    }
}
