package de.smoofy.core.api.time;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import java.time.format.DateTimeFormatter;

/**
 *
 */
public interface ITime {

    /**
     * Get the current time.
     *
     * @return the current time
     */
    String timeNow();

    /**
     * Get the time in the future.
     *
     * @param years   the years
     * @param months  the months
     * @param days    the days
     * @param hours   the hours
     * @param minutes the minutes
     * @param seconds the seconds
     * @return the time
     */
    String timeIn(int years, int months, int days, int hours, int minutes, int seconds);

    /**
     * Get the time in the past.
     *
     * @param years   the years
     * @param months  the months
     * @param days    the days
     * @param hours   the hours
     * @param minutes the minutes
     * @param seconds the seconds
     * @return the time
     */
    String timeBack(int years, int months, int days, int hours, int minutes, int seconds);

    /**
     * Get the zero time.
     *
     * @return "-1"
     */
    String zero();

    /**
     * Get the date of today. (dd.MM.yyyy)
     *
     * @return the date of today
     */
    String today();

    /**
     * Get the time as a string. Interesting for a punish system.
     *
     * @param time the time
     * @return the time as a string
     */
    String timeString(String time);

    /**
     * @param time the time
     * @return true if the time is after now, otherwise false
     */
    boolean later(String time);

    /**
     * @param time the time
     * @return true if the time is before now, otherwise false
     */
    boolean beforeToday(String time);

    /**
     * Get the {@link DateTimeFormatter}.
     *
     * @return the {@link DateTimeFormatter} (dd.MM.yyyy HH:mm:ss)
     */
    DateTimeFormatter dateTimeFormatter();
}
