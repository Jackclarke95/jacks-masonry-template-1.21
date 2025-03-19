package net.jackclarke95.jacks_masonry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
import net.jackclarke95.jacks_masonry.item.ModItems;
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
    }
}
