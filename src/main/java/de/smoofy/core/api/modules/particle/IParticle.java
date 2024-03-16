package de.smoofy.core.api.modules.particle;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:08
 */

import de.smoofy.core.api.player.ICorePlayer;
import org.bukkit.Location;

/**
 *
 */
public interface IParticle {

    void display(ICorePlayer player);

    void hide(ICorePlayer player);

    String key();

    Location[] locations();

    ParticleColor getColor();
}
