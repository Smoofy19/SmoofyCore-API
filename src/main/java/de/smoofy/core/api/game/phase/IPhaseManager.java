package de.smoofy.core.api.game.phase;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 19:58
 */

import java.util.LinkedList;

/**
 *
 */
public interface IPhaseManager {

    /**
     * Get the current phase.
     *
     * @return the current {@link Phase}
     */
    Phase currentPhase();

    /**
     * Set the current phase
     *
     * @param phase the new phase
     */
    void setPhase(Phase phase);

    /**
     * Set the current phase
     *
     * @param phase the new phase
     */
    void setPhase(String phase);

    /**
     * Add a phase to the cache.
     *
     * @param name  the name of the phase
     * @param phase the phase
     */
    void cache(String name, Phase phase);

    /**
     * Get a phase from the cache.
     *
     * @param name the name of the phase.
     * @return the {@link Phase} of the name
     */
    Phase phase(String name);

    /**
     * Get the name of the current phase.
     *
     * @return the name of the current phase
     */
    String phaseName();

    /**
     * Get all cached phases.
     *
     * @return a list of all cached phases
     */
    LinkedList<Phase> phases();
}
