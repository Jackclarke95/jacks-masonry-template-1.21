package net.jackclarke95.jacks_masonry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool gildedBlackstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GILDED_BLACKSTONE);

        gildedBlackstonePool.stairs(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        gildedBlackstonePool.wall(ModBlocks.GILDED_BLACKSTONE_WALL);
        gildedBlackstonePool.slab(ModBlocks.GILDED_BLACKSTONE_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLED_BLACKSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_COBBLED_BLACKSTONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
