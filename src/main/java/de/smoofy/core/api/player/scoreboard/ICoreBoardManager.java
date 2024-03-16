package de.smoofy.core.api.player.scoreboard;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 23.12.2023 - 17:06
 */

import de.smoofy.core.api.player.ICorePlayer;

import java.util.Map;

/**
 *
 */
public interface ICoreBoardManager {

    ICoreBoard create(ICorePlayer player);

    ICoreBoard create(ICorePlayer player, String title);

    void delete(ICorePlayer player);

    void remove(ICorePlayer player);

    ICoreBoard get(ICorePlayer player);

    Map<ICorePlayer, ICoreBoard> boards();
}
