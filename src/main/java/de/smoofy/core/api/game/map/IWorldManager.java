package de.smoofy.core.api.game.map;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 19:54
 */

import de.smoofy.core.api.game.map.world.IWorldCreator;

/**
 *
 */
public interface IWorldManager {

    /**
     * Get the world creator.
     *
     * @return the {@link IWorldCreator}
     */
    IWorldCreator getWorldCreator();

    /**
     * Load a world.
     *
     * @param name the name of the world you want to load
     */
    void loadWorld(String name);
}
