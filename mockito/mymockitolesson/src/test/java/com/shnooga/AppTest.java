package com.shnooga;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class AppTest {
    private App instance = new App();

    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
        assertThat(instance.add( 7, 11), is("7 + 11"));
    }

    @Test
    void multiply() {
        assertThat(instance.multiply( 7, 11), is("7 * 11"));
    }

    @Test
    void doSomething() {
        System.out.println("I shouldn't see this");
    }
}