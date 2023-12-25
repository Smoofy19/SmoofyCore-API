package de.smoofy.core.api.player.scoreboard;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 23.12.2023 - 17:06
 */

import org.bukkit.entity.Player;

import java.util.Map;

/**
 *
 */
public interface IPlayerBoardManager {

    IPlayerBoard create(Player player, String title);

    void delete(Player player);

    void remove(Player player);

    IPlayerBoard get(Player player);

    Map<Player, IPlayerBoard> boards();
}
