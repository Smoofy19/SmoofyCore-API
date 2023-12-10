package de.smoofy.core.api.game.teams;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 09.12.2023 - 18:23
 */

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

/**
 *
 */
public interface ITeam {

    /**
     * Get the members of the team.
     *
     * @return a {@link List} of {@link Player} who are in the team.
     */
    List<Player> members();

    /**
     * Get the name of the team.
     *
     * @return the team name
     */
    String name();

    /**
     * Get the color of the team.
     *
     * @return a {@link ChatColor} of the team
     */
    ChatColor color();

    /**
     * Get the color code of the team.
     *
     * @return the code of the team color
     */
    String code();

    /**
     * Get the id of the team.
     *
     * @return the id of the team
     */
    int id();
}
