package dev.sefiraat.netheopoiesis.utils;

import org.bukkit.Location;
import org.bukkit.World;

import javax.annotation.Nonnull;
import java.util.concurrent.ThreadLocalRandom;

public final class WorldUtils {

    private WorldUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Checks if the world is provided is NORMAL
     *
     * @param world The {@link World} to check the environment of
     * @return true if the {@link World.Environment} is NORMAL
     */
    public static boolean inOverworld(@Nonnull World world) {
        return world.getEnvironment() == World.Environment.NORMAL;
    }

    /**
     * Checks if the world is provided is NETHER
     *
     * @param world The {@link World} to check the environment of
     * @return true if the {@link World.Environment} is NETHER
     */
    public static boolean inNether(@Nonnull World world) {
        return world.getEnvironment() == World.Environment.NETHER;
    }

    /**
     * Checks if the world is provided is END
     *
     * @param world The {@link World} to check the environment of
     * @return true if the {@link World.Environment} is END
     */
    public static boolean inEnd(@Nonnull World world) {
        return world.getEnvironment() == World.Environment.THE_END;
    }

    /**
     * Picks a random location within a given range around a point
     *
     * @param centreLocation The {@link Location} which acts as the centre of the random check
     * @param range          The range in blocks in which to spread out from
     * @return The {@link Location} randomly selected
     */
    @Nonnull
    public static Location randomLocation(@Nonnull Location centreLocation, int range) {
        final double randomX = ThreadLocalRandom.current().nextInt(-range, range + 1);
        final double randomY = ThreadLocalRandom.current().nextInt(-range, range + 1);
        final double randomZ = ThreadLocalRandom.current().nextInt(-range, range + 1);
        return centreLocation.clone().add(randomX, randomY, randomZ);
    }
}