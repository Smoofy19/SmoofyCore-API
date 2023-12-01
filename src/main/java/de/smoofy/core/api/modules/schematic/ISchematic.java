package de.smoofy.core.api.modules.schematic;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import org.bukkit.Location;

/**
 *
 */

public interface ISchematic {

    /**
     * Paste a schematic at a location.
     *
     * @param game     the game (e.g. SkyWars)
     * @param type     the type (e.g. 8x1)
     * @param name     the name of the map
     * @param location the start location
     * @param async    if the schematic should be pasted async with FAWE
     * @return true if the schematic was pasted successfully, otherwise false
     */
    boolean paste(String game, String type, String name, Location location, boolean async);
}
