package net.jackclarke95.jacks_masonry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.GILDED_BLACKSTONE_STAIRS, "Gilded Blackstone Stairs");
        translationBuilder.add(ModBlocks.GILDED_BLACKSTONE_WALL, "Gilded Blackstone Wall");
        translationBuilder.add(ModBlocks.GILDED_BLACKSTONE_SLAB, "Gilded Blackstone Slab");
        translationBuilder.add(ModBlocks.COBBLED_BLACKSTONE, "Cobbled Blackstone");
        translationBuilder.add(ModBlocks.COBBLED_BLACKSTONE_STAIRS, "Cobbled Blackstone Stairs");
        translationBuilder.add(ModBlocks.COBBLED_BLACKSTONE_WALL, "Cobbled Blackstone Wall");
        translationBuilder.add(ModBlocks.COBBLED_BLACKSTONE_SLAB, "Cobbled Blackstone Slab");
        translationBuilder.add(ModBlocks.GILDED_COBBLED_BLACKSTONE, "Gilded Cobbled Blackstone");
        translationBuilder.add(ModBlocks.GILDED_COBBLED_BLACKSTONE_STAIRS, "Gilded Cobbled Blackstone Stairs");
        translationBuilder.add(ModBlocks.GILDED_COBBLED_BLACKSTONE_WALL, "Gilded Cobbled Blackstone Wall");
        translationBuilder.add(ModBlocks.GILDED_COBBLED_BLACKSTONE_SLAB, "Gilded Cobbled Blackstone Slab");
        translationBuilder.add(ModBlocks.GILDED_BLACKSTONE_PILLAR, "Gilded Blackstone Pillar");
        translationBuilder.add(ModBlocks.POLISHED_GILDED_BLACKSTONE, "Polished Gilded Blackstone");
        translationBuilder.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB, "Polished Gilded Blackstone Slab");
        translationBuilder.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL, "Polished Gilded Blackstone Wall");
        translationBuilder.add(ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS, "Polished Gilded Blackstone Stairs");
        translationBuilder.add(ModBlocks.GILDED_BLACKSTONE_BRICKS, "Gilded Blackstone Bricks");
        translationBuilder.add(ModBlocks.GILDED_BLACKSTONE_BRICKS_SLAB, "Gilded Blackstone Bricks Slab");
        translationBuilder.add(ModBlocks.GILDED_BLACKSTONE_BRICKS_WALL, "Gilded Blackstone Bricks Wall");
        translationBuilder.add(ModBlocks.GILDED_BLACKSTONE_BRICKS_STAIRS, "Gilded Blackstone Bricks Stairs");
    }
}
