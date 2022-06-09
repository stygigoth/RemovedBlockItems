package com.stygigoth.removed;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Removed implements ModInitializer {
    public static final String MOD_ID = "removed";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup MOD_ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, MOD_ID)).icon(
            () -> new ItemStack(Blocks.BARRIER)
    ).appendItems(
            stacks -> {
                stacks.add(new ItemStack(ModBlocks.WATER));
                stacks.add(new ItemStack(ModBlocks.LAVA));
                stacks.add(new ItemStack(ModBlocks.FIRE));
                stacks.add(new ItemStack(ModBlocks.SOUL_FIRE));
                stacks.add(new ItemStack(ModBlocks.NETHER_PORTAL_BLOCK));
                stacks.add(new ItemStack(Blocks.SPAWNER));
                stacks.add(new ItemStack(Blocks.COMMAND_BLOCK));
                stacks.add(new ItemStack(Blocks.CHAIN_COMMAND_BLOCK));
                stacks.add(new ItemStack(Blocks.REPEATING_COMMAND_BLOCK));
                stacks.add(new ItemStack(Blocks.STRUCTURE_BLOCK));
                stacks.add(new ItemStack(Blocks.JIGSAW));
                stacks.add(new ItemStack(Blocks.STRUCTURE_VOID));
            }
    ).build();

    @Override
    public void onInitialize() {
        ModBlocks.init();
    }
}
