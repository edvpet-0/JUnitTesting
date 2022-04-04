import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeCodeTest {
    @Test
    @DisplayName("Test of someMath")
    void someMathTest() {
        SomeCode myClass = new SomeCode();
        assertEquals(15, myClass.someMath(5, 2), "should be 15");
    }


    @Test
    @DisplayName("Test of alwaysTrue")
    void alwaysTrueTest() {
        SomeCode myClass = new SomeCode();
        assertTrue(myClass.alwaysTrue());

    }

    @Test
    @DisplayName("Test of number")
    void numberTest() {
        SomeCode myClass = new SomeCode();
        assertEquals(1, myClass.number(1), "should be 1");
    }

    @Test
    @DisplayName("Test functioning")
    void functioningTest() {
        SomeCode myClass = new SomeCode();
        assertEquals(5, myClass.functioning(2, 3), "should be 5");
    }

}