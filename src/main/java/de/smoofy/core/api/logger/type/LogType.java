package de.smoofy.core.api.logger.type;

/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.11.2023 - 17:27
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 */
@Getter
@AllArgsConstructor
public enum LogType {

    /**
     *
     */
    SUCCESSFULLY(ConsoleColor.GREEN, "Successfully"),
    /**
     *
     */
    INFO(ConsoleColor.YELLOW, "Info"),
    /**
     *
     */
    ERROR(ConsoleColor.RED, "Error"),
    /**
     *
     */
    WARNING(ConsoleColor.ORANGE, "Warning"),
    /**
     *
     */
    DEBUG(ConsoleColor.BLUE, "Debug");

    private final ConsoleColor consoleColor;
    private final String label;
}
