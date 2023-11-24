package de.smoofy.core.api.modules.hologram;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:05
 */

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 */
public interface IHologram {

    /**
     * Get the key of the hologram.
     *
     * @return the key of the hologram
     */
    String key();

    /**
     * Get the text of the hologram.
     *
     * @return the text of the hologram
     */
    String text();

    /**
     * Display the hologram to a player.
     *
     * @param player the player
     */
    void display(Player player);

    /**
     * Hide the hologram from a player.
     *
     * @param player the player
     */
    void hide(Player player);

    /**
     * Get the location of the hologram.
     *
     * @return the location of the hologram
     */
    Location location();
}
