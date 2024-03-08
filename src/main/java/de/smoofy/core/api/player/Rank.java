package de.smoofy.core.api.player;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 27.02.2024 - 17:13
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 */
@Getter
@AllArgsConstructor
public enum Rank {

    OWNER("a0_owner", 120, "Owner", "Owner", "§4"),
    ADMINISTRATOR("b1_admin", 110, "Admin", "Administrator", "§4"),
    DEVELOPER("c2_developer", 100, "Developer", "Developer", "§c"),
    SRMODERATOR("d3_srmoderator", 90, "SrModerator", "Senior Moderator", "§c"),
    CONTENT("e4_content", 80, "Content", "Content", "§c"),
    MODERATOR("f5_moderator", 70, "Moderator", "Moderator", "§c"),
    TRIAL("g6_trial", 60, "Trial", "Trial", "§a"),
    FAMOUS("h7_famous", 50, "Famous", "Famous", "§d"),
    YOUTUBER("i8_youtuber", 40, "YouTuber", "YouTuber", "§5"),
    RETIRED("j9_retired", 30, "Retired", "Retired", "§e"),
    SUPREMIUM("k10_supremium", 20, "Supremium", "Supremium", "§b"),
    PREMIUM("l11_premium", 10, "Premium", "Premium", "§6"),
    PLAYER("m12_player", 0, "Default", "Default", "§7");

    private final String id;
    private final int priority;

    private final String name;
    private final String display;
    private final String prefix;

    public static Rank getRankById(String id) {
        for (Rank rank : values()) {
            if (rank.getId().equals(id)) return rank;
        }
        return null;
    }

    public static Rank getRankByName(String name) {
        for (Rank rank : values()) {
            if (rank.getName().equals(name)) return rank;
        }
        return null;
    }
}
