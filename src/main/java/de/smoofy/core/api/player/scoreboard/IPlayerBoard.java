package de.smoofy.core.api.player.scoreboard;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 23.12.2023 - 17:02
 */

import java.util.Map;

/**
 *
 */
public interface IPlayerBoard {

    String line(int score);

    void set(String line, int score);

    void setAll(String... lines);

    void clear();

    void remove(int score);

    void delete();

    void setTitle(String title);

    Map<Integer, String> lines();
}
