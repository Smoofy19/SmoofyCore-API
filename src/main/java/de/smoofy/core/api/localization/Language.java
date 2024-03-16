package de.smoofy.core.api.localization;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 16.03.2024 - 18:24
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Locale;

/**
 *
 */
@Getter
@AllArgsConstructor
public enum Language {

    GERMAN(Locale.GERMANY);

    private final Locale locale;
}
