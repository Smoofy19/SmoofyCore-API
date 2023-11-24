package de.smoofy.core.api.modules.entities;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:03
 */

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;

/**
 *
 */
public interface IEntityHandler {

    /**
     * Create a new armor stand.
     *
     * @param location the location of the armor stand
     * @return a {@link IArmorStandBuilder}
     */
    IArmorStandBuilder create(Location location);

    /**
     * Create a new entity.
     *
     * @param location   the location of the entity
     * @param entityType the type of the entity
     * @return a {@link IEntityBuilder}
     */
    IEntityBuilder create(Location location, EntityType entityType);

    /**
     * @param location   the player location
     * @param armorStand the armor stand
     * @param tolerance  the tolerance
     * @return true if the armor stand is in the tolerance
     */
    boolean isClickableArmorStand(Location location, ArmorStand armorStand, double tolerance);
}
