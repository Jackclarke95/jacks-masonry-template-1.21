package net.jackclarke95.jacks_masonry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GILDED_BLACKSTONE_SLAB)
                .add(ModBlocks.GILDED_BLACKSTONE_WALL)
                .add(ModBlocks.GILDED_BLACKSTONE_STAIRS)
                .add(ModBlocks.COBBLED_BLACKSTONE)
                .add(ModBlocks.COBBLED_BLACKSTONE_SLAB)
                .add(ModBlocks.COBBLED_BLACKSTONE_WALL)
                .add(ModBlocks.COBBLED_BLACKSTONE_STAIRS)
                .add(ModBlocks.GILDED_COBBLED_BLACKSTONE)
                .add(ModBlocks.GILDED_COBBLED_BLACKSTONE_SLAB)
                .add(ModBlocks.GILDED_COBBLED_BLACKSTONE_WALL)
                .add(ModBlocks.GILDED_COBBLED_BLACKSTONE_STAIRS)
                .add(ModBlocks.GILDED_BLACKSTONE_PILLAR)
                .add(ModBlocks.POLISHED_GILDED_BLACKSTONE)
                .add(ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB)
                .add(ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL)
                .add(ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS)
                .add(ModBlocks.GILDED_BLACKSTONE_BRICKS)
                .add(ModBlocks.GILDED_BLACKSTONE_BRICKS_SLAB)
                .add(ModBlocks.GILDED_BLACKSTONE_BRICKS_WALL)
                .add(ModBlocks.GILDED_BLACKSTONE_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.GILDED_BLACKSTONE_WALL)
                .add(ModBlocks.COBBLED_BLACKSTONE_WALL)
                .add(ModBlocks.GILDED_COBBLED_BLACKSTONE_WALL)
                .add(ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL)
                .add(ModBlocks.GILDED_BLACKSTONE_BRICKS_WALL);
    }
}
