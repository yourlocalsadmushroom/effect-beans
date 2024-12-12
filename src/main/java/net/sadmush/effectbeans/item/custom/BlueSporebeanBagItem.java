package net.sadmush.effectbeans.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.sadmush.effectbeans.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BlueSporebeanBagItem extends Item {
    public BlueSporebeanBagItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack nextItem = new ItemStack(Items.AIR);

        if(!world.isClient()) {
            player.giveItemStack(new ItemStack(ModItems.BLUE_SPOREBEAN));

            if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.BLUE_SPOREBEAN_BAG_1)) {
                nextItem = new ItemStack(Items.AIR);
            }
            if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.BLUE_SPOREBEAN_BAG_2)) {
                nextItem = new ItemStack(ModItems.BLUE_SPOREBEAN_BAG_1);
            }
            if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.BLUE_SPOREBEAN_BAG_3)) {
                nextItem = new ItemStack(ModItems.BLUE_SPOREBEAN_BAG_2);
            }
            if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.BLUE_SPOREBEAN_BAG_4)) {
                nextItem = new ItemStack(ModItems.BLUE_SPOREBEAN_BAG_3);
            }
            if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.BLUE_SPOREBEAN_BAG_5)) {
                nextItem = new ItemStack(ModItems.BLUE_SPOREBEAN_BAG_4);
            }
            if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.BLUE_SPOREBEAN_BAG_6)) {
                nextItem = new ItemStack(ModItems.BLUE_SPOREBEAN_BAG_5);
            }
            if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.BLUE_SPOREBEAN_BAG_7)) {
                nextItem = new ItemStack(ModItems.BLUE_SPOREBEAN_BAG_6);
            }
            if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.BLUE_SPOREBEAN_BAG)) {
                nextItem = new ItemStack(ModItems.BLUE_SPOREBEAN_BAG_7);
            }
        }
        return TypedActionResult.success(nextItem);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(stack.isOf(ModItems.BLUE_SPOREBEAN_BAG)) {
            tooltip.add(Text.literal("Contains 8 Blue Sporebeans").formatted(Formatting.BLUE));
        }
        if(stack.isOf(ModItems.BLUE_SPOREBEAN_BAG_7)) {
            tooltip.add(Text.literal("Contains 7 Blue Sporebeans").formatted(Formatting.BLUE));
        }
        if(stack.isOf(ModItems.BLUE_SPOREBEAN_BAG_6)) {
            tooltip.add(Text.literal("Contains 6 Blue Sporebeans").formatted(Formatting.BLUE));
        }
        if(stack.isOf(ModItems.BLUE_SPOREBEAN_BAG_5)) {
            tooltip.add(Text.literal("Contains 5 Blue Sporebeans").formatted(Formatting.BLUE));
        }
        if(stack.isOf(ModItems.BLUE_SPOREBEAN_BAG_4)) {
            tooltip.add(Text.literal("Contains 4 Blue Sporebeans").formatted(Formatting.BLUE));
        }
        if(stack.isOf(ModItems.BLUE_SPOREBEAN_BAG_3)) {
            tooltip.add(Text.literal("Contains 3 Blue Sporebeans").formatted(Formatting.BLUE));
        }
        if(stack.isOf(ModItems.BLUE_SPOREBEAN_BAG_2)) {
            tooltip.add(Text.literal("Contains 2 Blue Sporebeans").formatted(Formatting.BLUE));
        }
        if(stack.isOf(ModItems.BLUE_SPOREBEAN_BAG_1)) {
            tooltip.add(Text.literal("Contains 1 Blue Sporebean").formatted(Formatting.BLUE));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
