package de.smoofy.core.api.modules.schematic;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import org.bukkit.Location;
import org.bukkit.block.Block;

import java.util.List;

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
     * @param fawe     if the schematic should be pasted with FastAsyncWorldEdit
     * @return true if the schematic was pasted successfully, otherwise false
     */
    boolean paste(String game, String type, String name, Location location, boolean fawe);

    /**
     * Save a schematic.
     *
     * @param game   the game (e.g. SkyWars)
     * @param type   the type (e.g. 8x1)
     * @param name   the name of the map
     * @param blocks the blocks
     * @return true if the schematic was saved successfully, otherwise false
     */
    boolean save(String game, String type, String name, List<Block> blocks);

    /**
     * Delete a schematic.
     *
     * @param game the game (e.g. SkyWars)
     * @param type the type (e.g. 8x1)
     * @param name the name of the map
     * @return true if the schematic was deleted successfully, otherwise false
     */
    boolean delete(String game, String type, String name);
}
