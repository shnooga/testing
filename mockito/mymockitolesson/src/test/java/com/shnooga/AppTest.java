package com.shnooga;

import junit.framework.TestCase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    private App instance = new App();

    public void testAdd() throws Exception {
        assertThat(instance.add( 7, 11), is("7 + 11"));
    }

    public void testMultiply() throws Exception {
        assertThat(instance.multiply( 7, 11), is("7 * 11"));
    }
}
