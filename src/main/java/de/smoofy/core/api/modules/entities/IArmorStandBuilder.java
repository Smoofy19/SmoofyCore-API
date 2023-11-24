package de.smoofy.core.api.modules.entities;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:02
 */

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

/**
 *
 */
public interface IArmorStandBuilder {

    /**
     * Set the display name of the armor stand
     *
     * @param displayName the display name
     * @return the armor stand builder
     */
    IArmorStandBuilder name(String displayName);

    /**
     * Hide the arms of the armor stand.
     *
     * @return the armor stand builder
     */
    IArmorStandBuilder toggleArms();

    /**
     * Show the baseplate of the armor stand.
     *
     * @return the armor stand builder
     */
    IArmorStandBuilder toggleBase();

    /**
     * Set the gravity of the armor stand.
     *
     * @param gravity true, if the armor stand should have gravity, false otherwise
     * @return the armor stand builder
     */
    IArmorStandBuilder gravity(boolean gravity);

    /**
     * Get the armor stand of the builder.
     *
     * @return the {@link ArmorStand} of the armor stand builder
     */
    ArmorStand armorStand();

    /**
     * Get the location of the armor stand.
     *
     * @return the {@link Location} of the armor stand
     */
    Location location();
}
