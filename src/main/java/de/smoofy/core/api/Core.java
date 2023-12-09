package de.smoofy.core.api;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import de.smoofy.core.api.cloud.ICloudManager;
import de.smoofy.core.api.coins.CoinAPI;
import de.smoofy.core.api.fetcher.IUUIDFetcher;
import de.smoofy.core.api.game.IGameHandler;
import de.smoofy.core.api.game.countdown.ICountdownManager;
import de.smoofy.core.api.game.map.IWorldManager;
import de.smoofy.core.api.game.phase.IPhaseManager;
import de.smoofy.core.api.game.teams.ITeamManager;
import de.smoofy.core.api.logger.ILogger;
import de.smoofy.core.api.message.ITextBuilder;
import de.smoofy.core.api.modules.actionbar.IActionbar;
import de.smoofy.core.api.modules.entities.IEntityHandler;
import de.smoofy.core.api.modules.hologram.IHologramHandler;
import de.smoofy.core.api.modules.hotbar.IHotbarHandler;
import de.smoofy.core.api.modules.location.ILocationHandler;
import de.smoofy.core.api.modules.particle.IParticleHandler;
import de.smoofy.core.api.modules.schematic.ISchematic;
import de.smoofy.core.api.modules.skulls.ISkullHandler;
import de.smoofy.core.api.modules.tablist.ITablistBuilder;
import de.smoofy.core.api.modules.tasks.ICoreRunTask;
import de.smoofy.core.api.modules.title.ITitleHandler;
import de.smoofy.core.api.player.ICorePlayerManager;
import de.smoofy.core.api.time.ITime;
import lombok.Getter;

/**
 *
 */
public abstract class Core {

    @Getter
    private static Core instance;

    @Getter
    private static final String prefix = "§8[§bCore§8] ";

    @Getter
    private static final String noConsole = "§cDu musst ein Spieler sein!";

    @Getter
    private static final String noPerms = "§fUnknown command. Type \"/help\" for help.";

    @Getter
    private static final String usage = "§cVerwende§8: §c";

    public static boolean setInstance(Core instance) {
        Core.instance = instance;
        return getInstance() != null;
    }

    /**
     * @return the {@link ICloudManager}
     */
    public abstract ICloudManager cloudManager();

    /**
     * @return the {@link CoinAPI}
     */
    public abstract CoinAPI coinAPI();

    /**
     * @return the {@link IUUIDFetcher}
     */
    public abstract IUUIDFetcher uuidFetcher();

    /**
     * @return the {@link ICountdownManager}
     */
    public abstract ICountdownManager countdownManager();

    /**
     * @return the {@link IWorldManager}
     */
    public abstract IWorldManager worldManager();

    /**
     * @return the {@link IPhaseManager}
     */
    public abstract IPhaseManager phaseManager();

    /**
     * @return the {@link ITeamManager}
     */
    public abstract ITeamManager teamManager();

    /**
     * @return the {@link IGameHandler}
     */
    public abstract IGameHandler gameHandler();

    /**
     * @return the {@link ILogger}
     */
    public abstract ILogger logger();

    /**
     * @param text the text
     * @return the {@link ITextBuilder}
     */
    public abstract ITextBuilder textBuilder(String text);

    /**
     * @return the {@link IActionbar}
     */
    public abstract IActionbar actionbar();

    /**
     * @return the {@link IEntityHandler}
     */
    public abstract IEntityHandler entityHandler();

    /**
     * @return the {@link IHologramHandler}
     */
    public abstract IHologramHandler hologramHandler();

    /**
     * @return the {@link IHotbarHandler}
     */
    public abstract IHotbarHandler hotbarHandler();

    /**
     * @return the {@link ILocationHandler}
     */
    public abstract ILocationHandler locationHandler();

    /**
     * @return the {@link IParticleHandler}
     */
    public abstract IParticleHandler particleHandler();

    /**
     * @return the {@link ISchematic}
     */
    public abstract ISchematic schematic();

    /**
     * @return the {@link ISkullHandler}
     */
    public abstract ISkullHandler skullHandler();

    /**
     * @return the {@link ITablistBuilder}
     */
    public abstract ITablistBuilder tablistBuilder();

    /**
     * @return the {@link ICoreRunTask}
     */
    public abstract ICoreRunTask runTask();

    /**
     * @return the {@link ITitleHandler}
     */
    public abstract ITitleHandler titleHandler();

    /**
     * @return the {@link ICorePlayerManager}
     */
    public abstract ICorePlayerManager corePlayerManager();

    /**
     * @return the {@link ITime}
     */
    public abstract ITime time();
}
