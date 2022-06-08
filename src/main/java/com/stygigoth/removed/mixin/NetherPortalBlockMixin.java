package com.stygigoth.removed.mixin;

import com.stygigoth.removed.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NetherPortalBlock.class)
public abstract class NetherPortalBlockMixin extends Block {
    public NetherPortalBlockMixin(Settings settings) {
        super(settings);
    }

    @Inject(method = "getPickStack", at = @At("RETURN"), cancellable = true)
    public void getPickStack(BlockView world, BlockPos pos, BlockState state, CallbackInfoReturnable<ItemStack> cir) {
        cir.setReturnValue(new ItemStack(ModBlocks.NETHER_PORTAL_BLOCK));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction d = ctx.getPlayerFacing();

        return switch (d) {
            case NORTH, SOUTH -> this.getDefaultState().with(NetherPortalBlock.AXIS, Direction.Axis.X);
            case EAST, WEST -> this.getDefaultState().with(NetherPortalBlock.AXIS, Direction.Axis.Z);
            case UP, DOWN -> this.getDefaultState();
        };
    }
}
