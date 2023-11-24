package de.smoofy.core.api.modules.tasks;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 20:13
 */

import org.bukkit.scheduler.BukkitTask;

/**
 *
 */
public interface ICoreRunTask {

    /**
     * Repeat the task every x ticks.
     *
     * @param runnable the runnable
     * @param delay    the start delay
     * @param period   the repeat period
     * @return the {@link BukkitTask}
     */
    BukkitTask repeat(Runnable runnable, long delay, long period);

    /**
     * Repeat the task every x ticks.
     *
     * @param runnable the runnable
     * @param delay    the start delay
     * @param period   the repeat period
     * @return the {@link BukkitTask}
     */
    BukkitTask repeatAsync(Runnable runnable, long delay, long period);

    /**
     * Run the task after x ticks.
     *
     * @param runnable the runnable
     * @param delay    the delay
     * @return the {@link BukkitTask}
     */
    BukkitTask later(Runnable runnable, long delay);

    /**
     * Run the task after x ticks.
     *
     * @param runnable the runnable
     * @param delay    the delay
     * @return the {@link BukkitTask}
     */
    BukkitTask laterAsync(Runnable runnable, long delay);
}
