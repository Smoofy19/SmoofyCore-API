package de.smoofy.core.api.game.countdown;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 19:45
 */

/**
 *
 */
public interface ICountdown {

    /**
     * Start the countdown.
     */
    void start();

    /**
     * Stop the countdown.
     */
    void stop();

    /**
     * Get the key of the countdown.
     *
     * @return the key of the countdown
     */
    String key();

    /**
     * Get the count type of the countdown.
     *
     * @return the {@link CountType} of the countdown
     */
    CountType countType();

    /**
     * Set the count type of the countdown.
     *
     * @param countType the count type
     */
    void setCountType(CountType countType);

    /**
     * Get the time of the countdown.
     *
     * @return the time of the countdown in seconds
     */
    int time();

    /**
     * Set the time of the countdown.
     *
     * @param time the time of the countdown in seconds
     */
    void setTime(int time);
}
