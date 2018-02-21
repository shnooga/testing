package com.shnooga;

import com.shnooga.calc.Addition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;

class AppTest {
    private App instance = new App();

    @BeforeEach
    void setUp() {
    }

    @Test
    void mockAdditionInstance() {
        Addition<Long> addition = mock(Addition.class);
        when(addition.calculate(isA(Number.class), isA(Number.class))).thenReturn("mocked");

        // Mock Addition object
        assertThat(addition.calculate(new Long(12), new Long(7)), is("mocked"));
        // Actual Addition object used
        assertThat(instance.add(7, 11), is("7 + 11"));
    }

    @Test
    void mockAddMethod() {
        App mockApp = spy(instance);
        doReturn("mocked").when(mockApp).add(7, 11);

        assertThat(mockApp.add(7, 11), is("mocked"));
        assertThat(mockApp.add(2, 2), is("2 + 2"));
        assertThat(instance.multiply(7, 11), is("7 * 11"));
    }
}