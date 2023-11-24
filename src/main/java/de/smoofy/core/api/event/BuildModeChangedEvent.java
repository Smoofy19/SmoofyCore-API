package de.smoofy.core.api.event;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:04
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.entity.Player;

/**
 *
 */
@Getter
@AllArgsConstructor
public class BuildModeChangedEvent extends BukkitEvent {

    private final Player player;
    private final boolean canBuild;
}
