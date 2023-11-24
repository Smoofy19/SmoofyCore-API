package de.smoofy.core.api.modules.hologram;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:05
 */

import org.bukkit.Location;

import java.util.List;

/**
 *
 */
public interface IHologramHandler {

    /**
     * Get all cached holograms.
     *
     * @return a list of all cached holograms
     */
    List<IHologram> holograms();

    /**
     * Get a hologram by its key.
     *
     * @param key the key of the hologram
     * @return the {@link IHologram} or null if not found
     */
    IHologram hologram(String key);

    /**
     * Remove a hologram from the cache.
     *
     * @param key the key of the hologram
     */
    void remove(String key);

    /**
     * Cache a hologram.
     *
     * @param hologram the hologram to cache
     */
    void cache(IHologram hologram);

    /**
     * Create a new hologram.
     *
     * @param key      the key of the hologram
     * @param text     the text of the hologram
     * @param location the location of the hologram
     * @return the created {@link IHologram}
     */
    IHologram create(String key, String text, Location location);

    /**
     * Create new holograms.
     *
     * @param key      the key of the hologram
     * @param text     the text of the holograms
     * @param location the location of the holograms
     * @return a list of the created {@link IHologram}s
     */
    List<IHologram> create(String key, List<String> text, Location location);
}
