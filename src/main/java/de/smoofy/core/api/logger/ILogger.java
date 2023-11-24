package de.smoofy.core.api.logger;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import de.smoofy.core.api.logger.type.LogType;

/**
 *
 */
public interface ILogger {

    /**
     * @param logType the type of the log
     * @param message the log message
     */
    void log(LogType logType, String message);

    /**
     * @param message the log message
     */
    void log(String message);

    /**
     * Jump to the next line
     */
    void newLine();
}
