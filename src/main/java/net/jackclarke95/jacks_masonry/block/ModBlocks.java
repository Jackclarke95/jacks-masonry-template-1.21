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
    //region Gilded Blackstone
    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    //endregion

    //region Cobbled Blackstone
    public static final Block COBBLED_BLACKSTONE = registerBlock("cobbled_blackstone",
            new Block((AbstractBlock.Settings.copy(Blocks.BLACKSTONE))));
    public static final Block COBBLED_BLACKSTONE_SLAB = registerBlock("cobbled_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.COBBLED_BLACKSTONE)));
    public static final Block COBBLED_BLACKSTONE_WALL = registerBlock("cobbled_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.COBBLED_BLACKSTONE)));
    public static final Block COBBLED_BLACKSTONE_STAIRS = registerBlock("cobbled_blackstone_stairs",
            new StairsBlock(ModBlocks.COBBLED_BLACKSTONE.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.COBBLED_BLACKSTONE)));
    //endregion

    //region Gilded Cobbled Blackstone
    public static final Block GILDED_COBBLED_BLACKSTONE = registerBlock("gilded_cobbled_blackstone",
            new Block((AbstractBlock.Settings.copy(ModBlocks.COBBLED_BLACKSTONE))));
    public static final Block GILDED_COBBLED_BLACKSTONE_SLAB = registerBlock("gilded_cobbled_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.GILDED_COBBLED_BLACKSTONE)));
    public static final Block GILDED_COBBLED_BLACKSTONE_WALL = registerBlock("gilded_cobbled_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.GILDED_COBBLED_BLACKSTONE)));
    public static final Block GILDED_COBBLED_BLACKSTONE_STAIRS = registerBlock("gilded_cobbled_blackstone_stairs",
            new StairsBlock(ModBlocks.GILDED_COBBLED_BLACKSTONE.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.GILDED_COBBLED_BLACKSTONE)));
    //endregion

    //region Gilded Blackstone Pillar
    public static final Block GILDED_BLACKSTONE_PILLAR = registerBlock("gilded_blackstone_pillar",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    //endregion

    //region Polished Gilded Blackstone
    public static final Block POLISHED_GILDED_BLACKSTONE = registerBlock("polished_gilded_blackstone",
            new Block(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_SLAB = registerBlock("polished_gilded_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.POLISHED_GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_WALL = registerBlock("polished_gilded_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.POLISHED_GILDED_BLACKSTONE)));
    public static final Block POLISHED_GILDED_BLACKSTONE_STAIRS = registerBlock("polished_gilded_blackstone_stairs",
            new StairsBlock(ModBlocks.POLISHED_GILDED_BLACKSTONE.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.POLISHED_GILDED_BLACKSTONE)));
    //endregion

    //region Gilded Blackstone Bricks
    public static final Block GILDED_BLACKSTONE_BRICKS = registerBlock("gilded_blackstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_BRICKS_SLAB = registerBlock("gilded_blackstone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.GILDED_BLACKSTONE_BRICKS)));
    public static final Block GILDED_BLACKSTONE_BRICKS_WALL = registerBlock("gilded_blackstone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.GILDED_BLACKSTONE_BRICKS)));
    public static final Block GILDED_BLACKSTONE_BRICKS_STAIRS = registerBlock("gilded_blackstone_bricks_stairs",
            new StairsBlock(ModBlocks.GILDED_BLACKSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.GILDED_BLACKSTONE_BRICKS)));
    //endregion

    //region Helpers
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(JacksMasonry.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(JacksMasonry.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    //endregion

    public static void registerModBlocks() {
        JacksMasonry.LOGGER.info("Registering Mod Blocks for " + JacksMasonry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((entries -> {
            entries.add(ModBlocks.GILDED_BLACKSTONE_SLAB);
            entries.add(ModBlocks.GILDED_BLACKSTONE_WALL);
            entries.add(ModBlocks.GILDED_BLACKSTONE_STAIRS);
            entries.add(ModBlocks.COBBLED_BLACKSTONE);
            entries.add(ModBlocks.COBBLED_BLACKSTONE_SLAB);
            entries.add(ModBlocks.COBBLED_BLACKSTONE_WALL);
            entries.add(ModBlocks.COBBLED_BLACKSTONE_STAIRS);
            entries.add(ModBlocks.GILDED_COBBLED_BLACKSTONE);
            entries.add(ModBlocks.GILDED_COBBLED_BLACKSTONE_SLAB);
            entries.add(ModBlocks.GILDED_COBBLED_BLACKSTONE_WALL);
            entries.add(ModBlocks.GILDED_COBBLED_BLACKSTONE_STAIRS);
            entries.add(ModBlocks.GILDED_BLACKSTONE_PILLAR);
            entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE);
            entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB);
            entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL);
            entries.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS);
            entries.add(ModBlocks.GILDED_BLACKSTONE_BRICKS);
            entries.add(ModBlocks.GILDED_BLACKSTONE_BRICKS_SLAB);
            entries.add(ModBlocks.GILDED_BLACKSTONE_BRICKS_WALL);
            entries.add(ModBlocks.GILDED_BLACKSTONE_BRICKS_STAIRS);
        }));
    }
}
