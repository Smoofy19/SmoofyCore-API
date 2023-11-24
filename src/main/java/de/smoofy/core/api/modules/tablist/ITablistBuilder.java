package de.smoofy.core.api.modules.tablist;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:13
 */

import org.bukkit.entity.Player;

/**
 *
 */
public interface ITablistBuilder {

    /**
     * Set the default tablist to a player.
     *
     * @param player the player
     */
    void setDefault(Player player);

    /**
     * Set the game tablist to a player.
     *
     * @param player the player
     */
    void setGame(Player player);
}
