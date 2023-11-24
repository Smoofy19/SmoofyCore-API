package de.smoofy.core.api.game;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 19:44
 */

/**
 *
 */
public interface IGameInfo {

    /**
     * Get the amount of minimum players.
     *
     * @return the amount of minimum players
     */
    int getMinPlayers();

    /**
     * Get the amount of maximum players.
     *
     * @return the amount of maximum players
     */
    int getMaxPlayers();

    /**
     * Get the amount of teams.
     *
     * @return the amount of teams
     */
    int getTeams();

    /**
     * Get the amount of players per team.
     *
     * @return the amount of players per team
     */
    int getTeamSize();
}
