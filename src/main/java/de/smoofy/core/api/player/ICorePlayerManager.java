package de.smoofy.core.api.player;

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
public interface ICorePlayerManager {

    /**
     * @param name the name of the player
     * @return the {@link ICorePlayer} of the name
     */
    ICorePlayer corePlayer(String name);

    /**
     * @param uuid the uuid of the player
     * @return the {@link ICorePlayer} of the uuid
     */
    ICorePlayer corePlayer(UUID uuid);

    /**
     * @param name the name of the player
     * @return the {@link ICoreOfflinePlayer} of the name
     */
    ICoreOfflinePlayer coreOfflinePlayer(String name);

    /**
     * @param uuid the uuid of the player
     * @return the {@link ICoreOfflinePlayer} of the uuid
     */
    ICoreOfflinePlayer coreOfflinePlayer(UUID uuid);
}
