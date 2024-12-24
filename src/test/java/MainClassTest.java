package com.yogaprasad;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainClassTest {  // Change class name to MainClassTest

    @Test
    public void testMainClass() {
        MainClass mainClass = new MainClass();  // Testing MainClass
        assertEquals("Hello, World!", mainClass.sayHello());
    }
}

