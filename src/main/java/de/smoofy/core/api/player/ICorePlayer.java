package de.smoofy.core.api.player;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import de.smoofy.core.api.player.scoreboard.Scoreboard;
import eu.cloudnetservice.modules.bridge.player.CloudPlayer;
import org.bukkit.entity.Player;

/**
 *
 */
public interface ICorePlayer extends ICoreOfflinePlayer {

    /**
     * @return the {@link CloudPlayer}
     */
    CloudPlayer cloudPlayer();

    /**
     * @return the {@link org.bukkit.entity.Player}
     */
    org.bukkit.entity.Player bukkitPlayer();

    /**
     * @return the {@link com.velocitypowered.api.proxy.Player}
     */
    com.velocitypowered.api.proxy.Player velocityPlayer();

    /**
     * @return the {@link Scoreboard}
     */
    Scoreboard scoreboard();

    /**
     * @return the {@link Rank}
     */
    Rank rank();

    /**
     * @return the nickName or null
     */
    String nickName();

    void editPermissibleBase(Player player) throws Exception;

    /**
     * Send a message to the player
     * @param message the message
     */
    void message(String message);

    /**
     * Send a message with prefix to the player
     * @param message the message
     */
    void pMessage(String message);

    /**
     * Send the usage message
     * @param usage the usage
     */
    void usage(String usage);

    /**
     * Send the usage message with prefix
     * @param prefix the prefix
     * @param usage the usage
     */
    void usage(String prefix, String usage);

    /**
     * Send the noPerms message
     */
    void noPerms();

    /**
     * Send the notOnline message
     * @param name the name of the player
     */
    void notOnline(String name);
}
