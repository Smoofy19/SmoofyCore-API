package de.smoofy.core.api.utils;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 24.02.2024 - 10:27
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class Pair<K, V> {

    private K key;
    private V value;
}
