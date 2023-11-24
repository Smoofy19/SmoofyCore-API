package de.smoofy.core.api.fetcher;

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
public interface IUUIDFetcher {

    /**
     * @param name the name of the player
     * @return the UUID of the player
     */
    UUID uuid(String name);

    /**
     * @param uuid the UUID of the player
     * @return the name of the player
     */
    String name(UUID uuid);
}
