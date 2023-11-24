package de.smoofy.core.api.modules.particle;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:09
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 */
@Getter
@AllArgsConstructor
public enum ParticleColor {

    RED(1F, 0F, 0F),
    GREEN(0F, 1F, 0F),
    BLUE(0F, 0F, 1F),

    WHITE(1F, 1F, 1F),

    YELLOW(1F, 1F, 0F),
    ORANGE(1F, 0.6F, 0F),
    CYAN(0.1F, 0.65F, 0.6F),

    GRAY(0.5F, 0.5F, 0.5F),
    BROWN(0.66F, 0.33F, 0F),
    GOLD(1F, 0.8F, 0F),

    BLACK(0F, 0F, 0F),
    PURPLE(0.5F, 0F, 1F),
    MAGENTA(1F, 0F, 1F);

    private final float xOffSet;
    private final float yOffSet;
    private final float zOffSet;
}
