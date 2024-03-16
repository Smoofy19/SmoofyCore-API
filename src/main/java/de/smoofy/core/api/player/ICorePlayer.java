package de.smoofy.core.api.player;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import de.smoofy.core.api.localization.Language;
import de.smoofy.core.api.player.scoreboard.ICoreBoard;
import eu.cloudnetservice.modules.bridge.player.CloudPlayer;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
     * @return the {@link ICoreBoard}
     */
    ICoreBoard scoreboard();

    /**
     * @return the {@link Rank}
     */
    Rank rank();

    /**
     * @return the {@link Language}
     */
    Language language();

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

    String getBukkitDisplayName();

    void setBukkitDisplayName(@Nullable String name);

    void kickPlayer(@Nullable String message);

    boolean performCommand(@NotNull String command);

    void playSound(@NotNull Sound sound, float volume, float pitch);

    Location getLocation();

    PlayerInventory getInventory();

    void updateInventory();

    void openInventory(Inventory inventory);

    void closeInventory();

    void setExp(float exp);

    void setLevel(int level);

    void setAllowFlight(boolean flight);

    void setHealth(double health);

    void setFoodLevel(int foodLevel);

    void setGameMode(GameMode gameMode);

    void setFireTicks(int ticks);

    void teleport(Location location);

    void hidePlayer(@NotNull Player player);

    void hidePlayer(@NotNull ICorePlayer player);

    void showPlayer(@NotNull Player player);

    void showPlayer(@NotNull ICorePlayer player);

    void setFlying(boolean value);

    String getLocale();

    void message(@NotNull net.md_5.bungee.api.chat.BaseComponent... components);

    Player.Spigot spigot();
}
