package net.sadmush.mushroomstuff.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.sadmush.mushroomstuff.block.ModBlocks;
import net.sadmush.mushroomstuff.item.ModItems;
import net.sadmush.mushroomstuff.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class SporeHarvesterItem extends Item {
    public SporeHarvesterItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean sporeFound = false;

            player.sendMessage(Text.literal("ANALYZING...").formatted(Formatting.DARK_AQUA).formatted(Formatting.BOLD));
            player.sendMessage(Text.literal("--------------------").formatted(Formatting.DARK_AQUA).formatted(Formatting.BOLD));
            BlockState state = context.getWorld().getBlockState(positionClicked);
            if (state.isIn(ModTags.Blocks.SPORE_HARVESTER_HARVEST_BLOCKS)) {
                context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                Random rand = new Random();
                int sporeCount = rand.nextInt(12) + 9;
                player.giveItemStack(new ItemStack(ModItems.SPORE, sporeCount));
                player.sendMessage(Text.literal("SPORES FOUND!").formatted(Formatting.AQUA));
                player.sendMessage(Text.literal("COUNT: " + sporeCount).formatted(Formatting.AQUA));
                sporeFound = true;

                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER_20)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(Items.AIR));
                }
                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER_40)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.SPORE_HARVESTER_20));
                }
                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER_60)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.SPORE_HARVESTER_40));
                }
                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER_80)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.SPORE_HARVESTER_60));
                }
                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.SPORE_HARVESTER_80));
                }
            }
            if (state.isIn(ModTags.Blocks.SPORE_HARVESTER_HARVEST_PLANTS)) {
                context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                Random rand = new Random();
                int sporeCount = rand.nextInt(6) + 3;
                player.giveItemStack(new ItemStack(ModItems.SPORE, sporeCount));
                player.sendMessage(Text.literal("SPORES FOUND!").formatted(Formatting.AQUA));
                player.sendMessage(Text.literal("COUNT: " + sporeCount).formatted(Formatting.AQUA));
                sporeFound = true;

                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER_20)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(Items.AIR));
                }
                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER_40)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.SPORE_HARVESTER_20));
                }
                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER_60)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.SPORE_HARVESTER_40));
                }
                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER_80)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.SPORE_HARVESTER_60));
                }
                if(player.getMainHandStack().isOf(ModItems.SPORE_HARVESTER)) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.SPORE_HARVESTER_80));
                }
            }
            if(!sporeFound) {
                player.sendMessage(Text.literal("Spores not found.").formatted(Formatting.DARK_RED));
            }
            player.sendMessage(Text.literal(""));
        }



        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Harvests Spores from Mushroom Blocks").formatted(Formatting.DARK_AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
