package de.smoofy.core.api.modules.tablist;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:13
 */

import de.smoofy.core.api.player.ICorePlayer;

/**
 *
 */
public interface ITablistBuilder {

    /**
     * Set the default tablist to a player.
     *
     * @param player the player
     */
    void setDefault(ICorePlayer player);

    /**
     * Set the game tablist to a player.
     *
     * @param player the player
     */
    void setGame(ICorePlayer player);
}
