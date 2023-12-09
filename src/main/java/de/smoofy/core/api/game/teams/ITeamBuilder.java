package de.smoofy.core.api.game.teams;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 09.12.2023 - 18:24
 */

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 *
 */
public interface ITeamBuilder {

    /**
     * Get the team selection inventory.
     *
     * @param player the player, who opens the inventory
     * @return the {@link Inventory} for the team selection
     */
    Inventory openSelector(Player player);
}
