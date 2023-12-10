package de.smoofy.core.api.game.teams;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 09.12.2023 - 18:25
 */

import org.bukkit.ChatColor;

import java.util.List;

/**
 *
 */
public interface ITeamManager {

    /**
     * Create a new team.
     *
     * @param id    the id of the team
     * @param name  the name of the team
     * @param color the color of the team
     * @param code  the colorcode of the team
     */
    void create(int id, String name, ChatColor color, String code);

    /**
     * Remove a team.
     *
     * @param id the id of the team
     */
    void remove(int id);

    /**
     * Get the winner team.
     *
     * @return the {@link ITeam} of the winner team
     */
    ITeam winner();

    /**
     * Initialize the teams, this is important for the {@link ITeamBuilder}
     */
    void initTeams();

    /**
     * Get all remaining teams.
     *
     * @return a list of all remaining teams
     */
    List<ITeam> teams();

    /**
     * Get the team builder.
     *
     * @return the {@link ITeamBuilder}
     */
    ITeamBuilder builder();
}
