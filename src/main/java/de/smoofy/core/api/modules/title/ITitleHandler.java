package de.smoofy.core.api.modules.title;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:14
 */

import de.smoofy.core.api.player.ICorePlayer;

/**
 *
 */
public interface ITitleHandler {

    /**
     * Send a title to a player.
     *
     * @param player the player
     * @param title  the title
     */
    void send(ICorePlayer player, String title);

    /**
     * Send a title to a player.
     *
     * @param player   the player
     * @param title    the title
     * @param subtitle the subtitle
     */
    void send(ICorePlayer player, String title, String subtitle);

    /**
     * Send a title to all players.
     *
     * @param title the title
     */
    void send(String title);

    /**
     * Send a title to all players.
     *
     * @param title    the title
     * @param subtitle the subtitle
     */
    void send(String title, String subtitle);

    /**
     * Send a title to a player.
     *
     * @param player  the player
     * @param title   the title
     * @param fadeIn  the fade in duration
     * @param stay    the stay duration
     * @param fadeOut the fade out duration
     */
    void send(ICorePlayer player, String title, int fadeIn, int stay, int fadeOut);

    /**
     * Send a title to a player.
     *
     * @param player   the player
     * @param title    the title
     * @param subtitle the subtitle
     * @param fadeIn   the fade in duration
     * @param stay     the stay duration
     * @param fadeOut  the fade out duration
     */
    void send(ICorePlayer player, String title, String subtitle, int fadeIn, int stay, int fadeOut);

    /**
     * Send a title to all players.
     *
     * @param title   the title
     * @param fadeIn  the fade in duration
     * @param stay    the stay duration
     * @param fadeOut the fade out duration
     */
    void send(String title, int fadeIn, int stay, int fadeOut);

    /**
     * Send a title to all players.
     *
     * @param title    the title
     * @param subtitle the subtitle
     * @param fadeIn   the fade in duration
     * @param stay     the stay duration
     * @param fadeOut  the fade out duration
     */
    void send(String title, String subtitle, int fadeIn, int stay, int fadeOut);

    /**
     * Reset all titles of a player.
     *
     * @param player the player
     */
    void reset(ICorePlayer player);

    /**
     * Reset all titles of all players.
     */
    void reset();
}
