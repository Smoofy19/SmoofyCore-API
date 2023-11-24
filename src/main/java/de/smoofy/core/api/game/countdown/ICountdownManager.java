package de.smoofy.core.api.game.countdown;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 19:48
 */

/**
 *
 */
public interface ICountdownManager {

    /**
     * Cache a countdown.
     *
     * @param countdown the countdown to cache
     */
    void cache(ICountdown countdown);

    /**
     * Remove a countdown from the cache.
     *
     * @param countdown the countdown to remove
     */
    void remove(ICountdown countdown);

    /**
     * Remove all countdowns from the cache.
     */
    void clear();

    /**
     * Create a new countdown.
     *
     * @param thread the {@link CountThread} of the countdown
     * @param type   the {@link CountType} of the countdown
     * @param count  the count  of the countdown in seconds
     * @param key    the key of the countdown
     * @return the created {@link ICountdown}
     */
    ICountdown create(CountThread thread, CountType type, int count, String key);

    /**
     * Get a countdown by the key.
     *
     * @param key the key of the countdown
     * @return the {@link ICountdown} or null if not found
     */
    ICountdown countdown(String key);
}
