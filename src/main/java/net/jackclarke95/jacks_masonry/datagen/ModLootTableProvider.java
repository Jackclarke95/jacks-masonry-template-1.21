package net.jackclarke95.jacks_masonry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        addDrop(ModBlocks.GILDED_BLACKSTONE_WALL);
        addDrop(ModBlocks.GILDED_BLACKSTONE_SLAB);
        addDrop(ModBlocks.COBBLED_BLACKSTONE);
        addDrop(ModBlocks.GILDED_COBBLED_BLACKSTONE);
    }
}
