package de.smoofy.core.api.modules.location;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:08
 */

import org.bukkit.Location;

import java.util.List;

/**
 *
 */
public interface ILocationHandler {

    /**
     * Create a new location.
     *
     * @param key      the key of the location.
     * @param location the location
     * @return the {@link ILocation}
     */
    ILocation create(String key, Location location);

    /**
     * Get a location by key.
     *
     * @param key the key of the location.
     * @return the {@link ILocation} or null if not found.
     */
    ILocation location(String key);

    /**
     * Cache a location.
     *
     * @param location the location
     */
    void cache(ILocation location);

    /**
     * Remove a location from the cache.
     *
     * @param key the key of the location
     */
    void remove(String key);

    /**
     * Get all cached locations.
     *
     * @return a list of all cached {@link ILocation}'s
     */
    List<ILocation> locations();
}
