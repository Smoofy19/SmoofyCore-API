package de.smoofy.core.api.config;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 23.02.2024 - 13:20
 */

import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Path;

/**
 *
 */
public interface IConfig {

    <T> T get(@NotNull String key, @NotNull Class<T> clazz);

    <T> T get(@NotNull String key, @NotNull Type type);

    IConfig addIfNotExists(String key, boolean state);

    IConfig addIfNotExists(String key, int state);

    IConfig addIfNotExists(String key, String state);

    <T> T get(@NotNull Class<T> clazz);

    <T> T get(@NotNull Type type);

    @NotNull IConfig set(@NotNull String key, @NotNull Object object);

    @NotNull IConfig read(@NotNull Path path);

    boolean has(String key);

    @NotNull IConfig read(@NotNull Reader reader);

    @NotNull IConfig write(@NotNull Path path);

    @NotNull JsonObject getJsonObject();

    @NotNull IConfig setJsonObject(@NotNull JsonObject jsonObject);

    @NotNull IConfig setJsonObject(@NotNull Object object);

    String toString();
}
