package net.jackclarke95.jacks_masonry.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jackclarke95.jacks_masonry.block.ModBlocks;
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
        //region Cobbled Blackstone
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE, Blocks.BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE_SLAB, Blocks.BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE_SLAB, ModBlocks.COBBLED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE_WALL, Blocks.BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE_WALL, ModBlocks.COBBLED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE_STAIRS, Blocks.BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE_STAIRS, ModBlocks.COBBLED_BLACKSTONE);

        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE_SLAB, ModBlocks.COBBLED_BLACKSTONE);
        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_BLACKSTONE_WALL, ModBlocks.COBBLED_BLACKSTONE);
        createStairsRecipe(ModBlocks.COBBLED_BLACKSTONE_STAIRS, Ingredient.ofItems(ModBlocks.COBBLED_BLACKSTONE))
                .criterion("has_cobbled_blackstone", conditionsFromItem(ModBlocks.COBBLED_BLACKSTONE))
                .offerTo(recipeExporter);
        //endregion

        //region Gilded Blackstone
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_WALL, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_STAIRS, Blocks.GILDED_BLACKSTONE);

        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_WALL, Blocks.GILDED_BLACKSTONE);
        createStairsRecipe(ModBlocks.GILDED_BLACKSTONE_STAIRS, Ingredient.ofItems(Blocks.GILDED_BLACKSTONE))
                .criterion("has_gilded_blackstone", conditionsFromItem(Blocks.GILDED_BLACKSTONE))
                .offerTo(recipeExporter);
        //endregion


        //region Gilded Cobbled Blackstone
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_COBBLED_BLACKSTONE_SLAB, ModBlocks.GILDED_COBBLED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_COBBLED_BLACKSTONE_WALL, ModBlocks.GILDED_COBBLED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_COBBLED_BLACKSTONE_STAIRS, ModBlocks.GILDED_COBBLED_BLACKSTONE);

        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_COBBLED_BLACKSTONE_SLAB, ModBlocks.GILDED_COBBLED_BLACKSTONE);
        offerWallRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_COBBLED_BLACKSTONE_WALL, ModBlocks.GILDED_COBBLED_BLACKSTONE);
        createStairsRecipe(ModBlocks.GILDED_COBBLED_BLACKSTONE_STAIRS, Ingredient.ofItems(ModBlocks.GILDED_COBBLED_BLACKSTONE))
                .criterion("has_gilded_cobbled_blackstone", conditionsFromItem(ModBlocks.GILDED_COBBLED_BLACKSTONE))
                .offerTo(recipeExporter);
        //endregion

        //region Gilded Blackstone Pillar
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_PILLAR, Blocks.GILDED_BLACKSTONE);
        //endregion

        // Polished Gilded Blackstone
        offerPolishedStoneRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_SLAB, ModBlocks.POLISHED_GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_WALL, ModBlocks.POLISHED_GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GILDED_BLACKSTONE_STAIRS, ModBlocks.POLISHED_GILDED_BLACKSTONE);
        //endregion

        //region Gilded Blackstone Bricks
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BRICKS, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BRICKS_SLAB, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BRICKS_WALL, Blocks.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_BLACKSTONE_BRICKS_STAIRS, Blocks.GILDED_BLACKSTONE);
        //endregion

        List<ItemConvertible> GILDED_BLACKSTONE_SMELTABLES = List.of(ModBlocks.GILDED_COBBLED_BLACKSTONE);

        offerBlasting(recipeExporter, GILDED_BLACKSTONE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, Blocks.GILDED_BLACKSTONE, 0.25f, 200, "gilded_blackstone");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GILDED_COBBLED_BLACKSTONE, 8)
                .pattern("ccc")
                .pattern("cgc")
                .pattern("ccc")
                .input('c', ModBlocks.COBBLED_BLACKSTONE)
                .input('g', Blocks.GOLD_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COBBLED_BLACKSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.COBBLED_BLACKSTONE))
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(recipeExporter);
    }
}
