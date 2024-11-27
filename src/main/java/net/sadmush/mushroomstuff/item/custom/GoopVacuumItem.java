package net.sadmush.mushroomstuff.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.sadmush.mushroomstuff.block.ModBlocks;
import net.sadmush.mushroomstuff.item.ModItems;

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
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_10)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(Items.AIR));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_20)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_10));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_30)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_20));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_40)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_30));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_50)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_40));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_60)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_50));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_70)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_60));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_80)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_70));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_90)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_80));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM)) {
                    context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                    player.setStackInHand(player.getActiveHand(), new ItemStack(ModItems.GOOP_VACUUM_90));
                }
            }
            if(!isGoop(state)) {
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_90)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_80)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_70)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_60)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_50)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_40)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_30)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_20)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
                if(player.getMainHandStack().isOf(ModItems.GOOP_VACUUM_10)) {
                    player.sendMessage(Text.literal("No Goop found..."));
                }
            }
        }



        return ActionResult.SUCCESS;
    }

    private boolean isGoop(BlockState state) {
        return state.isOf(ModBlocks.GOOP);
    }
}
