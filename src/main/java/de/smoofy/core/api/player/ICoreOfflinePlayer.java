package de.smoofy.core.api.player;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import eu.cloudnetservice.modules.bridge.player.CloudOfflinePlayer;
import net.luckperms.api.model.group.Group;
import net.luckperms.api.model.user.User;

import java.util.UUID;

/**
 *
 */
public interface ICoreOfflinePlayer {

    /**
     * @return the name of the player
     */
    String name();

    /**
     * @return the uuid of the player
     */
    UUID uuid();

    /**
     * @return the {@link CloudOfflinePlayer}
     */
    CloudOfflinePlayer cloudOfflinePlayer();

    /**
     *
     * @return the {@link User}
     */
    User permissionUser();

    /**
     *
     * @return the {@link Group}
     */
    Group permissionGroup();

    /**
     * @return the display name of the player
     */
    String displayName();

    /**
     * @return the rank color of the player
     */
    String color();
}
