package de.smoofy.core.api.player.scoreboard;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.02.2024 - 18:45
 */

import com.google.common.collect.Maps;
import de.smoofy.core.api.Core;
import de.smoofy.core.api.player.ICorePlayer;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.scoreboard.Team;

import java.util.Map;
import java.util.Set;

/**
 *
 */
@Getter
public class Scoreboard {

    private final ICorePlayer player;
    private final org.bukkit.scoreboard.Scoreboard scoreboard;

    private final ScoreboardObjective objective;

    private final Map<String, Team> teams = Maps.newHashMap();

    public Scoreboard(ICorePlayer player) {
        this.player = player;
        this.scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        String serverName = Core.getInstance().cloudManager().wrapperConfiguration().serviceInfoSnapshot().name();
        this.objective = new ScoreboardObjective(this.scoreboard, player, serverName.toLowerCase().contains("lobby") ? "§b§lSmoofy Network" : "§b§l" + serverName.split("-")[0]);
        player.bukkitPlayer().setScoreboard(this.scoreboard);
    }

    public Team getScoreboardTeam(String team) {
        return this.teams.get(team);
    }

    public void registerScoreboardTeam(String teamName, String prefix, String suffix, Set<String> entries) {
        if (teamName.length() > 16) teamName = teamName.substring(0, 16);
        if (prefix.length() > 16) prefix = prefix.substring(0, 16);
        if (suffix.length() > 16) suffix = suffix.substring(0, 16);

        Team team = this.getScoreboardTeam(teamName);
        if (team == null) {
            team = this.scoreboard.registerNewTeam(teamName);
            team.setCanSeeFriendlyInvisibles(true);
            this.teams.put(teamName, team);
        }
        team.setPrefix(prefix);
        team.setSuffix(suffix);
        entries.forEach(team::addEntry);
    }

    public void registerPlayer(ICorePlayer player) {
        String registration = player.nickName() != null && getPlayer() != player ? player.rank().getId() + player.nickName() : player.realRank().getId() + player.name();
        String prefix = player.nickName() != null && getPlayer() != player ? player.rank().getPrefix() : player.realRank().getPrefix();
        String suffix = "";
        //String suffix = player.nickName() != null && getPlayer() != player ? "" : (ClanManager.getInstance().getClanByUuid(player.getUniqueId()) == null ? "" : " §7[" + ClanManager.getInstance().getClanByUuid(player.getUniqueId()).getColor() + ClanManager.getInstance().getClanByUuid(player.getUniqueId()).getTag() + "§7]");
        String name = player.nickName() != null && getPlayer() != player ? player.nickName() : player.name();

        if (registration.length() > 16) registration = registration.substring(0, 16);
        if (prefix != null && prefix.length() > 16) prefix = prefix.substring(0, 16);
        //if (suffix.length() > 16) suffix = suffix.substring(0, 16);

        Team team = teams.get(registration);
        if (team == null) {
            team = scoreboard.registerNewTeam(registration);
            team.setCanSeeFriendlyInvisibles(true);
            teams.put(registration, team);
        }
        if (prefix == null) prefix = "";
        team.setPrefix(prefix);
        team.setSuffix(suffix);
        team.addEntry(name);
    }

    public void unregisterPlayer(ICorePlayer player) {
        String registration = player.nickName() != null && getPlayer() != player ? player.rank().getId() + player.nickName() : player.realRank().getId() + player.name();
        Team team = teams.get(registration);
        if (team != null) {
            team.unregister();
            teams.remove(registration);
        }
    }
}
