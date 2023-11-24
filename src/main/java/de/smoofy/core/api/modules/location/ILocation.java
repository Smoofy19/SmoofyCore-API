package de.smoofy.core.api.modules.location;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:07
 */

import org.bukkit.Location;

/**
 *
 */
public interface ILocation {

    /**
     * Get the key of the location.
     *
     * @return the key of the location
     */
    String key();

    /**
     * Get the location.
     *
     * @return the {@link Location}
     */
    Location location();
}
