package net.sadmush.effectbeans.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.sadmush.effectbeans.item.ModItems;
import net.sadmush.effectbeans.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.SPOREBEANS)
                .add(ModItems.SPOREBEAN)
                .add(ModItems.RED_SPOREBEAN)
                .add(ModItems.YELLOW_SPOREBEAN)
                .add(ModItems.GREEN_SPOREBEAN)
                .add(ModItems.BLUE_SPOREBEAN)
                .add(ModItems.PURPLE_SPOREBEAN)
                .add(ModItems.GRAY_SPOREBEAN)
                .add(ModItems.WHITE_SPOREBEAN)
                .add(ModItems.PINK_SPOREBEAN)
                .add(ModItems.ORANGE_SPOREBEAN)
        ;
    }
}
