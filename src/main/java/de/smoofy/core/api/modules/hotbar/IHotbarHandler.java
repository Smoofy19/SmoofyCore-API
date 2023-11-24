package de.smoofy.core.api.modules.hotbar;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:06
 */

import java.util.List;

/**
 *
 */
public interface IHotbarHandler {

    /**
     * Get all cached hotbars.
     *
     * @return a list of all cached {@link IHotbar}s
     */
    List<IHotbar> hotbars();

    /**
     * Get a hotbar by its key.
     *
     * @param key the key of the hotbar
     * @return the {@link IHotbar} or null if not found
     */
    IHotbar hotbar(String key);

    /**
     * Remove a hotbar from the cache.
     *
     * @param key the key of the hotbar
     */
    void remove(String key);

    /**
     * Add a hotbar to the cache.
     *
     * @param hotbar the hotbar to cache
     */
    void cache(IHotbar hotbar);

    /**
     * Create a new hotbar.
     *
     * @param key  the key of the hotbar
     * @param text the text of the hotbar
     * @return the created {@link IHotbar}
     */
    IHotbar create(String key, String text);

    /**
     * Create a new hotbar.
     *
     * @param key     the key of the hotbar
     * @param text    the text of the hotbar
     * @param percent the percent of the hotbar
     * @return the created {@link IHotbar}
     */
    IHotbar create(String key, String text, int percent);
}
