package de.smoofy.core.api.modules.particle;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:08
 */

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 */
public interface IParticle {

    void display(Player player);

    void hide(Player player);

    String key();

    Location[] locations();

    ParticleColor getColor();
}
