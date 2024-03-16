package de.smoofy.core.api.modules.actionbar;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:01
 */

import de.smoofy.core.api.player.ICorePlayer;

/**
 *
 */
public interface IActionbar {

    /**
     * Send an actionbar to a player.
     *
     * @param player  the player
     * @param message the message
     */
    void send(ICorePlayer player, String message);

    /**
     * Send an actionbar to a player permanent.
     *
     * @param player  the player
     * @param message the message
     */
    void permanent(ICorePlayer player, String message);

    /**
     * Send an actionbar to all online players.
     *
     * @param message the message
     */
    void send(String message);

    /**
     * Send an actionbar to all online players permanent.
     *
     * @param message the message
     */
    void permanent(String message);
}
