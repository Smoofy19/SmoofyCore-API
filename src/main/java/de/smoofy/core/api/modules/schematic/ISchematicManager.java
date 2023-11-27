package de.smoofy.core.api.modules.schematic;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import org.bukkit.Location;

import java.util.List;

/**
 *
 */

public interface ISchematicManager {

    /**
     * Load a schematic from a file.
     *
     * @param game the game (e.g. SkyWars)
     * @param type the type (e.g. 8x1)
     * @param name the name of the map
     * @return true if the schematic was loaded successfully, otherwise false
     */
    boolean load(String game, String type, String name);

    /**
     * Save a schematic to a file.
     *
     * @param game   the game (e.g. SkyWars)
     * @param type   the type (e.g. 8x1)
     * @param name   the name of the map
     * @param blocks the blocks to save
     * @return true if the schematic was saved successfully, otherwise false
     */
    boolean save(String game, String type, String name, List<String> blocks);

    /**
     * Delete a schematic file.
     *
     * @param game the game (e.g. SkyWars)
     * @param type the type (e.g. 8x1)
     * @param name the name of the map
     * @return true if the schematic was deleted successfully, otherwise false
     */
    boolean delete(String game, String type, String name);

    /**
     * Paste a schematic at a location.
     *
     * @param game     the game (e.g. SkyWars)
     * @param type     the type (e.g. 8x1)
     * @param name     the name of the map
     * @param location the start location
     * @return true if the schematic was pasted successfully, otherwise false
     */
    boolean paste(String game, String type, String name, Location location);
}
