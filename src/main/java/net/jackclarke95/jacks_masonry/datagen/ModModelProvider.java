package net.jackclarke95.jacks_masonry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool gildedBlackstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GILDED_BLACKSTONE);
        gildedBlackstonePool.slab(ModBlocks.GILDED_BLACKSTONE_SLAB);
        gildedBlackstonePool.wall(ModBlocks.GILDED_BLACKSTONE_WALL);
        gildedBlackstonePool.stairs(ModBlocks.GILDED_BLACKSTONE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool cobbledBlackstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_BLACKSTONE);
        cobbledBlackstonePool.slab(ModBlocks.COBBLED_BLACKSTONE_SLAB);
        cobbledBlackstonePool.wall(ModBlocks.COBBLED_BLACKSTONE_WALL);
        cobbledBlackstonePool.stairs(ModBlocks.COBBLED_BLACKSTONE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool gildedCobbledBlackstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GILDED_COBBLED_BLACKSTONE);
        gildedCobbledBlackstonePool.slab(ModBlocks.GILDED_COBBLED_BLACKSTONE_SLAB);
        gildedCobbledBlackstonePool.wall(ModBlocks.GILDED_COBBLED_BLACKSTONE_WALL);
        gildedCobbledBlackstonePool.stairs(ModBlocks.GILDED_COBBLED_BLACKSTONE_STAIRS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
