package de.smoofy.core.api.modules.entities;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:02
 */

import org.bukkit.Location;
import org.bukkit.entity.Entity;

/**
 *
 */
public interface IEntityBuilder {

    /**
     * Set the name of the entity.
     *
     * @param displayName the display name
     * @return the entity builder
     */
    IEntityBuilder name(String displayName);

    /**
     * Set the passenger of the entity.
     *
     * @param passenger the passenger {@link Entity}
     * @return the entity builder
     */
    IEntityBuilder passenger(Entity passenger);

    /**
     * Get the entity of the builder.
     *
     * @return the {@link Entity} of the entity builder
     */
    Entity entity();

    /**
     * Get the location of the entity.
     *
     * @return the {@link Location} of the entity
     */
    Location location();
}
