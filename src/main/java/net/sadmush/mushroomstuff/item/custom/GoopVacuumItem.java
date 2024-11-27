package net.sadmush.mushroomstuff.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.sadmush.mushroomstuff.block.ModBlocks;

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
                context.getWorld().setBlockState(positionClicked, Blocks.AIR.getDefaultState());
                context.getStack().damage(1, context.getPlayer(), playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
            }
            if(!isGoop(state)) {
                player.sendMessage(Text.literal("No Goop found..."));
            }
        }



        return ActionResult.SUCCESS;
    }

    private boolean isGoop(BlockState state) {
        return state.isOf(ModBlocks.GOOP);
    }
}
