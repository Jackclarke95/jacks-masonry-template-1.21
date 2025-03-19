package net.jackclarke95.jacks_masonry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
import net.jackclarke95.jacks_masonry.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_WALL, Blocks.GILDED_BLACKSTONE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);

        createStairsRecipe(ModBlocks.GILDED_BLACKSTONE_STAIRS, Ingredient.ofItems(Blocks.GILDED_BLACKSTONE, Blocks.PURPUR_PILLAR))
                .criterion("has_gilded_blackstone", conditionsFromItem(Blocks.GILDED_BLACKSTONE))
                .offerTo(recipeExporter);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_WALL, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_STAIRS, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE, Blocks.BLACKSTONE);

        List<ItemConvertible> GILDED_BLACKSTONE_SMELTABLES = List.of(ModBlocks.GILDED_COBBLED_BLACKSTONE);

        offerBlasting(recipeExporter, GILDED_BLACKSTONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Blocks.GILDED_BLACKSTONE, 0.25f, 200, "gilded_blackstone");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_COBBLED_BLACKSTONE, 8)
                .pattern("ccc")
                .pattern("cgc")
                .pattern("ccc")
                .input('c', ModBlocks.COBBLED_BLACKSTONE)
                .input('g', Items.GOLD_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COBBLED_BLACKSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.COBBLED_BLACKSTONE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(recipeExporter);
    }
}
