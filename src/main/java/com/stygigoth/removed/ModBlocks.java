package com.stygigoth.removed;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static Item NETHER_PORTAL_BLOCK;

    private static Item registerBlockItem(Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Removed.MOD_ID, Registry.BLOCK.getId(block).getPath()), new BlockItem(block, new Item.Settings().group(Removed.MOD_ITEM_GROUP)));
    }

    public static void init() {
        registerBlockItem(Blocks.WATER);
        registerBlockItem(Blocks.LAVA);
        registerBlockItem(Blocks.FIRE);
        registerBlockItem(Blocks.SOUL_FIRE);
        NETHER_PORTAL_BLOCK = registerBlockItem(Blocks.NETHER_PORTAL);
        registerBlockItem(Blocks.SPAWNER);
    }
}
