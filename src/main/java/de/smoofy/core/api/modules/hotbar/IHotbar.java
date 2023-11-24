package de.smoofy.core.api.modules.hotbar;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:06
 */

import org.bukkit.entity.Player;

/**
 *
 */
public interface IHotbar {

    /**
     * Display a hotbar to a player.
     *
     * @param player the player
     */
    void display(Player player);

    /**
     * Hide a hotbar from a player.
     *
     * @param player the player
     */
    void hide(Player player);

    /**
     * Get the key of the hotbar.
     *
     * @return the key of the hotbar
     */
    String key();

    /**
     * Get the message of the hotbar.
     *
     * @return the message of the hotbar
     */
    String message();

    /**
     * Get the percent of the hotbar.
     *
     * @return the percent of the hotbar
     */
    int percent();
}
