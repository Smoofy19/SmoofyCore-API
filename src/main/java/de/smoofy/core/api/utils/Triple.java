package de.smoofy.core.api.utils;
/*
 * Copyright ©
 * @author - Smoofy
 * @GitHub - https://github.com/Smoofy19
 * @Twitter - https://twitter.com/Smoofy19
 * Created - 25.02.2024 - 10:40
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 */
@Getter
@AllArgsConstructor
public class Triple<A, B, C> {

    private final A a;
    private final B b;
    private final C c;

    public boolean equals(Triple triple) {
        return this.a.equals(triple.getA()) && this.b.equals(triple.getB()) && this.c.equals(triple.getC());
    }
}
