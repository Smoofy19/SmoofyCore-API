package de.smoofy.core.api.player.scoreboard;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.02.2024 - 18:46
 */

import com.google.common.collect.Maps;
import de.smoofy.core.api.player.ICorePlayer;
import lombok.Synchronized;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.Map;

/**
 *
 */
public class ScoreboardObjective {

    private final ICorePlayer player;
    private final String title;

    private final Scoreboard scoreboard;
    private final Objective objective;

    private final Map<Integer, String> scores;

    public ScoreboardObjective(Scoreboard scoreboard, ICorePlayer player, String title) {
        this.player = player;
        this.title = title;

        this.scoreboard = scoreboard;
        this.objective = scoreboard.registerNewObjective("aaa", "dummy");

        this.scores = Maps.newHashMap();
    }

    @Synchronized
    public void setScore(int score, String prefix, String suffix) {
        this.scores.put(score, prefix + ";" + suffix);
    }

    @Synchronized
    public void updateScore(int score, String prefix, String suffix) {
        player.bukkitPlayer().getScoreboard();
        if (player.bukkitPlayer().getScoreboard().getObjective(DisplaySlot.SIDEBAR) != null) {
            if (player.bukkitPlayer().getScoreboard().getTeam("#" + score) == null)
                player.bukkitPlayer().getScoreboard().registerNewTeam("#" + score);
            player.bukkitPlayer().getScoreboard().getTeam("#" + score).setPrefix(prefix);
            player.bukkitPlayer().getScoreboard().getTeam("#" + score).setSuffix(suffix);
        }
    }

    @Synchronized
    public void resetObjective() {
        this.scores.keySet().forEach(integer ->  {
            scoreboard.resetScores(this.getScoreEntry(integer));
            scoreboard.getEntryTeam(this.getScoreEntry(integer)).unregister();
        });
        this.scores.clear();
    }

    @Synchronized
    public void setObjective() {
        this.objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        this.objective.setDisplayName(this.title);

        for (int i = 0; i < 16; i++) {
            if (this.scores.get(i) != null) {
                Team team = scoreboard.getTeam("#" + i);
                if (team == null) team = scoreboard.registerNewTeam("#" + i);

                String[] strings = this.scores.get(i).split(";");

                team.setPrefix(strings[0]);
                team.setSuffix(strings[1]);
                team.addEntry(this.getScoreEntry(i));

                this.objective.getScore(this.getScoreEntry(i)).setScore(i);
                player.bukkitPlayer().setScoreboard(this.scoreboard);
            }
        }
    }

    private String getScoreEntry(int i) {
        String entry;
        if (i <= 9) {
            entry = "§" + i;
        } else {
            entry = switch (i) {
                case 10 -> "§a";
                case 11 -> "§b";
                case 12 -> "§c";
                case 13 -> "§d";
                case 14 -> "§e";
                case 15 -> "§f";
                default -> "FEHLER";
            };
        }
        return entry;
    }
}
