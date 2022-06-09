package com.stygigoth.removed;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static Item WATER;
    public static Item LAVA;
    public static Item FIRE;
    public static Item SOUL_FIRE;
    public static Item NETHER_PORTAL_BLOCK;

    private static Item registerBlockItem(Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Removed.MOD_ID, Registry.BLOCK.getId(block).getPath()), new BlockItem(block, new Item.Settings()));
    }

    public static void init() {
        WATER = registerBlockItem(Blocks.WATER);
        LAVA = registerBlockItem(Blocks.LAVA);
        FIRE = registerBlockItem(Blocks.FIRE);
        SOUL_FIRE = registerBlockItem(Blocks.SOUL_FIRE);
        NETHER_PORTAL_BLOCK = registerBlockItem(Blocks.NETHER_PORTAL);
    }
}
