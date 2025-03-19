package net.jackclarke95.jacks_masonry.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jackclarke95.jacks_masonry.JacksMasonry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(),
                    AbstractBlock.Settings
                            .copy(Blocks.BLACKSTONE)));

    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            new WallBlock(AbstractBlock.Settings
                    .copy(Blocks.BLACKSTONE)));

    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings
                    .copy(Blocks.BLACKSTONE)));

    public static final Block COBBLED_BLACKSTONE = registerBlock("cobbled_blackstone",
            new Block((AbstractBlock.Settings
                    .copy(Blocks.BLACKSTONE))));

    public static final Block GILDED_COBBLED_BLACKSTONE = registerBlock("gilded_cobbled_blackstone",
            new Block((AbstractBlock.Settings
                    .copy(Blocks.BLACKSTONE))));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(JacksMasonry.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(JacksMasonry.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        JacksMasonry.LOGGER.info("Registering Mod Blocks for " + JacksMasonry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((entries -> {
            entries.add(ModBlocks.GILDED_BLACKSTONE_STAIRS);
            entries.add(ModBlocks.GILDED_BLACKSTONE_WALL);
            entries.add(ModBlocks.GILDED_BLACKSTONE_SLAB);
            entries.add(ModBlocks.COBBLED_BLACKSTONE);
            entries.add(ModBlocks.GILDED_COBBLED_BLACKSTONE);
        }));
    }
}
