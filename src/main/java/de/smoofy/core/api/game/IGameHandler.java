package de.smoofy.core.api.game;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 19:45
 */

/**
 *
 */
public interface IGameHandler {

    /**
     * Create the game info.
     *
     * @param minPlayers the amount of minimum players
     * @param maxPlayers the amount of maximum players
     * @param teams      the amount of teams
     * @param teamSize   the amount of players per team
     * @return the created {@link IGameInfo}
     */
    IGameInfo createGameInfo(int minPlayers, int maxPlayers, int teams, int teamSize);
}
