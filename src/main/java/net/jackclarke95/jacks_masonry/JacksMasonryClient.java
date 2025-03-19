package net.jackclarke95.jacks_masonry;

import net.fabricmc.api.ClientModInitializer;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
import net.jackclarke95.jacks_masonry.item.ModItems;

public class JacksMasonryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
