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

    public static final ItemGroup MOD_ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, MOD_ID),
            () -> new ItemStack(Blocks.BARRIER)
    );

    @Override
    public void onInitialize() {
        ModBlocks.init();
    }
}
