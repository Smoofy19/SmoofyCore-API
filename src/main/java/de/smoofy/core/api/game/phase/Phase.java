package de.smoofy.core.api.game.phase;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 19:55
 */

import de.smoofy.core.api.Core;
import de.smoofy.core.api.game.countdown.ICountdownManager;
import lombok.Getter;
import lombok.Setter;

/**
 *
 */
public abstract class Phase {

    public ICountdownManager countdownManager = Core.getInstance().countdownManager();

    @Getter
    @Setter
    private String phaseName;

    /**
     * Called when the phase starts.
     */
    public abstract void onEnable();

    /**
     * Called when the phase stopps.
     */
    public abstract void onDisable();
}
