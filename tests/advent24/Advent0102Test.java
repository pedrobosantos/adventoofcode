package advent24;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Advent0102Test {

    Advent0102 advent = new Advent0102("inputs/" + getClass().getName().replace(".","/") + ".txt");

    @Test
    public void testResolveProblem() {
        assertEquals("31", advent.result);
    }

}