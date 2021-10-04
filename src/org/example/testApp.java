package org.example;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.example.App;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class testApp {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void test() {
        App.main(null);
        assertEquals("Hello World\n", outContent.toString());assertEquals("Hello World" + System.lineSeparator(), outContent.toString());
    }

}
