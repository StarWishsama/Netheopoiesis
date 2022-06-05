package dev.sefiraat.netheopoiesis.slimefun.flora.seeds.implementation.second;

import dev.sefiraat.netheopoiesis.slimefun.NpsSlimefunItems;
import dev.sefiraat.netheopoiesis.slimefun.flora.blocks.NetherSeedCrux;
import dev.sefiraat.netheopoiesis.slimefun.flora.seeds.NetherSeed;
import dev.sefiraat.netheopoiesis.utils.Skulls;
import dev.sefiraat.netheopoiesis.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MetallicSeed extends NetherSeed {

    private final LinkedList<Skulls> growthPhases = new LinkedList<>();

    public MetallicSeed(@Nonnull ItemGroup itemGroup,
                        @Nonnull SlimefunItemStack item,
                        @Nonnull RecipeType recipeType,
                        @Nonnull ItemStack[] recipe
    ) {
        super(itemGroup, item, recipeType, recipe);
        growthPhases.add(Skulls.SEED_BLUE);
        growthPhases.add(Skulls.PLANT_HARDY_GROWTH_1);
        growthPhases.add(Skulls.PLANT_HARDY_GROWTH_2);
        growthPhases.add(Skulls.PLANT_HARDY_GROWTH_3);
        growthPhases.add(Skulls.PLANT_HARDY_GROWTH_4);
        growthPhases.add(Skulls.PLANT_HARDY_GROWTH_5);
    }

    @Nonnull
    @Override
    public Theme getTheme() {
        return Theme.SEED_BLUE;
    }

    @Nonnull
    @Override
    public Set<NetherSeedCrux> getValidPlaces() {
        return Set.of(
            NpsSlimefunItems.PURIFIED_NETHERRACK,
            NpsSlimefunItems.VORACIOUS_DIRT,
            NpsSlimefunItems.NETHER_DIRT,
            NpsSlimefunItems.NETHER_GRASS
        );
    }

    @Nullable
    @Override
    public ItemStack getHarvestingResult() {
        return new ItemStack(Material.IRON_NUGGET);
    }

    @Override
    public double getGrowthRate() {
        return 0.08;
    }

    @Override
    public List<Skulls> getGrowthPhases() {
        return this.growthPhases;
    }

    @Override
    public int purificationValue() {
        return 1;
    }
}