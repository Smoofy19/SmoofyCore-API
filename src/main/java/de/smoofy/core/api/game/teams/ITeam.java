package de.smoofy.core.api.game.teams;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 09.12.2023 - 18:23
 */

import de.smoofy.core.api.player.ICorePlayer;
import org.bukkit.ChatColor;

import java.util.List;

/**
 *
 */
public interface ITeam {

    /**
     * Get the members of the team.
     *
     * @return a {@link List} of {@link ICorePlayer} who are in the team.
     */
    List<ICorePlayer> members();

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
     * Get the id of the team.
     *
     * @return the id of the team
     */
    int id();
}
