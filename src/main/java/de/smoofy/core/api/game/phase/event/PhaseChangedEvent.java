package de.smoofy.core.api.game.phase.event;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 19:59
 */

import de.smoofy.core.api.event.BukkitEvent;
import de.smoofy.core.api.game.phase.Phase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

/**
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class PhaseChangedEvent extends BukkitEvent implements Cancellable {

    private final Phase oldPhase;
    private final Phase newPhase;

    private boolean cancelled;
}
