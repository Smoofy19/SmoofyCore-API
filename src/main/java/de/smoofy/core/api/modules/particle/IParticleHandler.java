package de.smoofy.core.api.modules.particle;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:09
 */

import org.bukkit.Location;
import org.bukkit.Particle;

import java.util.List;

/**
 *
 */
public interface IParticleHandler {

    IParticle newParticleSingle(String key, Particle particle, Location[] locations, ParticleColor particleColor);

    IParticle newParticleLine(String key, Particle particle, Location[] locations, ParticleColor particleColor);

    IParticle newParticleCircle(String key, Particle particle, Location[] locations, float radius, ParticleColor particleColor);

    IParticle newParticleLineSnake(String key, Particle particle, Location[] locations, ParticleColor particleColor);

    IParticle newParticleCircleSnake(String key, Particle particle, Location[] locations, float radius, ParticleColor particleColor);

    IParticle newParticleSquareSnake(String key, Particle particle, Location[] locations, ParticleColor particleColor);

    void cache(IParticle particle);

    IParticle particle(String key);

    void remove(String key);

    List<IParticle> particles();
}
