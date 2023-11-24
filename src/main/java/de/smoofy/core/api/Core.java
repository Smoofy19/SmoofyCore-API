package de.smoofy.core.api;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import lombok.Getter;

/**
 *
 */
public abstract class Core {

    @Getter
    private static Core instance;

    public static boolean setInstance(Core instance) {
        Core.instance = instance;
        return getInstance() != null;
    }
}
