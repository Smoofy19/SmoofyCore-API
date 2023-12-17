package de.smoofy.core.api.game.map;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 17.12.2023 - 14:51
 */

import java.util.List;

/**
 *
 */
public interface IMapManager {

    List<String> mapList(String game, String type);

    int mapAmount(String game, String type);

    boolean exist(String game, String type, String name);

    String randomMap(String game, String type);
}
