package de.smoofy.core.api.game.countdown.events;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 19:49
 */

import de.smoofy.core.api.event.BukkitEvent;
import de.smoofy.core.api.game.countdown.ICountdown;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 */
@Getter
@AllArgsConstructor
public class CountdownStartEvent extends BukkitEvent {

    private final String key;
    private final ICountdown countdown;
}
