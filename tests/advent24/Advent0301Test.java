package advent24;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent0301Test {

    Advent0301 advent = new Advent0301("inputs/" + getClass().getName().replace(".","/") + ".txt");

    @Test
    public void testResolveProblem() {
        assertEquals("161", advent.result);
    }
}
