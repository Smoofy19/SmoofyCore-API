package de.smoofy.core.api.coins;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import java.util.UUID;

/**
 *
 */
public interface CoinAPI {

    /**
     * Get the amount of coins of a player.
     *
     * @param uuid The UUID of the player
     * @return the amount of coins
     */
    int coins(UUID uuid);

    /**
     * Add coins to a player.
     *
     * @param uuid The UUID of the player
     * @param amount The amount of coins
     */
    void add(UUID uuid, int amount);

    /**
     * Remove coins from a player.
     *
     * @param uuid The UUID of the player
     * @param amount The amount of coins
     */
    void remove(UUID uuid, int amount);

    /**
     * Set the amount of coins of a player.
     *
     * @param uuid The UUID of the player
     * @param amount The amount of coins
     */
    void set(UUID uuid, int amount);
}
