package net.jackclarke95.jacks_masonry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        BlockStateModelGenerator.BlockTexturePool gildedBlackstonePool = generator.registerCubeAllModelTexturePool(Blocks.GILDED_BLACKSTONE);
        gildedBlackstonePool.slab(ModBlocks.GILDED_BLACKSTONE_SLAB);
        gildedBlackstonePool.wall(ModBlocks.GILDED_BLACKSTONE_WALL);
        gildedBlackstonePool.stairs(ModBlocks.GILDED_BLACKSTONE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool cobbledBlackstonePool = generator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_BLACKSTONE);
        cobbledBlackstonePool.slab(ModBlocks.COBBLED_BLACKSTONE_SLAB);
        cobbledBlackstonePool.wall(ModBlocks.COBBLED_BLACKSTONE_WALL);
        cobbledBlackstonePool.stairs(ModBlocks.COBBLED_BLACKSTONE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool gildedCobbledBlackstonePool = generator.registerCubeAllModelTexturePool(ModBlocks.GILDED_COBBLED_BLACKSTONE);
        gildedCobbledBlackstonePool.slab(ModBlocks.GILDED_COBBLED_BLACKSTONE_SLAB);
        gildedCobbledBlackstonePool.wall(ModBlocks.GILDED_COBBLED_BLACKSTONE_WALL);
        gildedCobbledBlackstonePool.stairs(ModBlocks.GILDED_COBBLED_BLACKSTONE_STAIRS);

        generator.registerAxisRotated(ModBlocks.GILDED_BLACKSTONE_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);

        BlockStateModelGenerator.BlockTexturePool polishedGildedBlackstonePool = generator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GILDED_BLACKSTONE);
        polishedGildedBlackstonePool.slab(ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB);
        polishedGildedBlackstonePool.wall(ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL);
        polishedGildedBlackstonePool.stairs(ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool gildedBlackstoneBricksPool = generator.registerCubeAllModelTexturePool(ModBlocks.GILDED_BLACKSTONE_BRICKS);
        gildedBlackstoneBricksPool.slab(ModBlocks.GILDED_BLACKSTONE_BRICKS_SLAB);
        gildedBlackstoneBricksPool.wall(ModBlocks.GILDED_BLACKSTONE_BRICKS_WALL);
        gildedBlackstoneBricksPool.stairs(ModBlocks.GILDED_BLACKSTONE_BRICKS_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
