package advent24;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent0302Test {

    Advent0302 advent = new Advent0302("inputs/" + getClass().getName().replace(".","/") + ".txt");

    @Test
    public void testResolveProblem() {
        assertEquals("48", advent.result);
    }
}

