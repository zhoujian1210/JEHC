package ru.pearx.jehc.jei.trap;

import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.item.ItemRegistry;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IModRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.Arrays;

/*
 * Created by mrAppleXZ on 19.07.17 12:34.
 */
public class WaterTrapRecipeCategory extends TrapRecipeCategory
{
    private static final String UID = "jehc.water_trap";

    public WaterTrapRecipeCategory(IGuiHelper helper)
    {
        super("jehc.water_trap.name", UID, helper, "water");
    }

    public static void setup(IModRegistry registry, IGuiHelper helper)
    {
        registry.addRecipeCategories(new WaterTrapRecipeCategory(helper));
        registry.addRecipeCategoryCraftingItem(new ItemStack(BlockRegistry.watertrapItemBlock), UID);
        registry.handleRecipes(TrapRecipeWrapper.Water.class, recipe -> recipe, UID);
        registry.addRecipes(Arrays.asList(
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(Items.FISH, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(Items.FISH, 1, 1)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(Items.FISH, 1, 2)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(Items.FISH, 1, 3)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.anchovyrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.bassrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.carprawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.catfishrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.charrrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.clamrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.crabrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.crayfishrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.eelrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.frograwItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.grouperrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.herringrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.jellyfishrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.mudfishrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.octopusrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.perchrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.scalloprawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.shrimprawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.snailrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.snapperrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.tilapiarawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.troutrawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.tunarawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.turtlerawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.walleyerawItem, 1, 0)),
                new TrapRecipeWrapper.Water(new ItemStack(ItemRegistry.fishtrapbaitItem), new ItemStack(ItemRegistry.greenheartfishItem, 1, 0))
        ), UID);
    }
}
