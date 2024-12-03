package net.sadmush.mushroomstuff.item.custom;

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
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GoopVacuumItem extends Item {
    public GoopVacuumItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundGoop = false;

            BlockState state = context.getWorld().getBlockState(positionClicked);
            if(isGoop(state)) {
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM_10)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(Items.AIR));
                }
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM_20)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.sendMessage(Text.literal("WARNING ⚠").formatted(Formatting.BOLD).formatted(Formatting.RED));
                    player.sendMessage(Text.literal("Energy running low.").formatted(Formatting.DARK_RED));
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_10));
                }
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM_30)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_20));
                }
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM_40)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_30));
                }
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM_50)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_40));
                }
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM_60)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_50));
                }
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM_70)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_60));
                }
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM_80)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_70));
                }
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM_90)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_80));
                }
                if(player.getStackInHand(player.getActiveHand()).isOf(ModItems.GOOP_VACUUM)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_90));
                }
            }
        }



        return ActionResult.SUCCESS;
    }

    private boolean isGoop(BlockState state) {
        return state.isOf(ModBlocks.GOOP);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(stack.isOf(ModItems.GOOP_VACUUM)) {
            tooltip.add(Text.literal("Energy: 100%").formatted(Formatting.DARK_RED));
        }
        if(stack.isOf(ModItems.GOOP_VACUUM_90)) {
            tooltip.add(Text.literal("Energy: 90%").formatted(Formatting.DARK_RED));
        }
        if(stack.isOf(ModItems.GOOP_VACUUM_80)) {
            tooltip.add(Text.literal("Energy: 80%").formatted(Formatting.DARK_RED));
        }
        if(stack.isOf(ModItems.GOOP_VACUUM_70)) {
            tooltip.add(Text.literal("Energy: 70%").formatted(Formatting.DARK_RED));
        }
        if(stack.isOf(ModItems.GOOP_VACUUM_60)) {
            tooltip.add(Text.literal("Energy: 60%").formatted(Formatting.DARK_RED));
        }
        if(stack.isOf(ModItems.GOOP_VACUUM_50)) {
            tooltip.add(Text.literal("Energy: 50%").formatted(Formatting.DARK_RED));
        }
        if(stack.isOf(ModItems.GOOP_VACUUM_40)) {
            tooltip.add(Text.literal("Energy: 40%").formatted(Formatting.DARK_RED));
        }
        if(stack.isOf(ModItems.GOOP_VACUUM_30)) {
            tooltip.add(Text.literal("Energy: 30%").formatted(Formatting.DARK_RED));
        }
        if(stack.isOf(ModItems.GOOP_VACUUM_20)) {
            tooltip.add(Text.literal("Energy: 20%").formatted(Formatting.DARK_RED));
        }
        if(stack.isOf(ModItems.GOOP_VACUUM_10)) {
            tooltip.add(Text.literal("Energy: 10%").formatted(Formatting.DARK_RED));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
