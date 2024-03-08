package de.smoofy.core.api.config;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 23.02.2024 - 13:22
 */

import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;
import java.nio.file.Path;

/**
 *
 */
public interface IConfigManager {

    IConfig newConfig();

    IConfig newConfig(@NotNull Path path);

    IConfig newConfig(@NotNull Reader reader);

    IConfig newConfig(@NotNull JsonObject jsonObject);

    IConfig newConfig(@NotNull String json);

    IConfig newConfig(@NotNull Object object);
}
