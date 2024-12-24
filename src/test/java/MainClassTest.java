package com.yogaprasad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClassTest {
    
    @Test
    public void testSayHello() {
        MainClass mainClass = new MainClass();
        String result = mainClass.sayHello();
        assertEquals("Hello, World!", result);
    }
}

