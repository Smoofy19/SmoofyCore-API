package de.smoofy.core.api.database;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 09.03.2024 - 11:07
 */

import de.smoofy.core.api.database.objects.Insertion;
import de.smoofy.core.api.database.objects.Login;
import de.smoofy.core.api.database.objects.Table;
import de.smoofy.core.api.database.objects.Where;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 */
public interface IDatabase {

    void connect(Login login, boolean debug);

    void connect(Login login);

    void disconnect();

    void createTable(@NotNull Table table);

    void startTransaction();

    void rollbackTransaction();

    void commit();

    Object get(@NotNull String tableName, @NotNull String key, @NotNull String value, @NotNull String column);

    Object getMore(@NotNull String tableName, @NotNull List<String> keys, @NotNull List<Object> values, @NotNull String column);

    Optional<List<Object>> getList(@NotNull String tableName, @NotNull String key, @NotNull String value, @NotNull String column);

    Optional<List<Object>> getList(@NotNull String tableName, @NotNull String column);

    boolean existsTable(@NotNull String tableName);

    void insert(@NotNull String tableName, @NotNull Map<String, String> values);

    void insert(@NotNull Insertion insertion);

    void delete(@NotNull String tableName, @NotNull String key, @NotNull String value);

    boolean existsRow(@NotNull String tableName, @NotNull String key, @NotNull Object value);

    boolean existsRow(@NotNull String tableName, @NotNull Where where);

    boolean existsMoreRow(@NotNull String tableName, @NotNull List<String> keys, @NotNull List<Object> values);

    void replace(@NotNull String tableName, @NotNull String key, @NotNull String value, @NotNull Map<String, String> values);

    void replace(@NotNull String tableName, @NotNull Where where, @NotNull Map<String, String> values);

    void deleteTable(@NotNull String tableName);

    void update(@NotNull String tableName, @NotNull Where where, @NotNull String column, @NotNull Object newColumn);

    void moreUpdate(@NotNull String tableName, @NotNull List<Where> where, @NotNull String column, @NotNull Object newColumn);

    void addColumnToTable(@NotNull String tableName, @NotNull String column, @NotNull String type, int amount);

    void removeColumnFromTable(@NotNull String tableName, @NotNull String column);

    void changeColumnName(@NotNull String tableName, @NotNull String oldName, @NotNull String newName);

    void deleteColumnFromTable(@NotNull String tableName, @NotNull String column);

    void exportToCSV(@NotNull String tableName, @NotNull String path);

    void importFromFile(@NotNull String tableName, @NotNull String path);

    int countRows(@NotNull String tableName);

    ResultSet getAllTables();

    ResultSet getAllDataInTable(@NotNull String tableName);

    ResultSet getAllDataInTable(@NotNull String tableName, @NotNull String key, @NotNull Object value);

    void deleteTableIfExists(@NotNull String tableName);

    void replacePrimaryKey(@NotNull String tableName, @NotNull String primaryKey);

    void copyContentsToNewTable(@NotNull String tableName, @NotNull String copyFrom);

    ResultSet describeTable(@NotNull String tableName);

    ResultSet describeColumn(@NotNull String tableName, @NotNull String column);

    void setColumnDefaultValue(@NotNull String tableName, @NotNull String column, @NotNull String defaultValue);

    void insert(@NotNull String tableName, Object object);

    void insertList(@NotNull String tableName, @NotNull List<?> objects);

    Object get(@NotNull String tableName, @NotNull String key, @NotNull String value, @NotNull Class<?> clazz);

    Optional<List<?>> getList(@NotNull String tableName, @NotNull String key, @NotNull String value, @NotNull Class<?> clazz);

    Optional<List<?>> getList(@NotNull String tableName, @NotNull Class<?> clazz);

    Object get(@NotNull String tableName, @NotNull String key, @NotNull String value, @NotNull Class<?> clazz, int index);

    Object get(@NotNull String tableName, @NotNull Class<?> clazz, int index);

    Constructor<?> retrieveConstructor(@NotNull Class<?> clazz);

    boolean hasAnnotation(@NotNull Parameter parameter);

    boolean isDebug();

    Connection getConnection();

    void log(@NotNull String message);
}
