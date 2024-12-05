package advent24;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent0202Test {

    Advent0202 advent = new Advent0202("inputs/" + getClass().getName().replace(".","/") + ".txt");

    @Test
    public void testResolveProblem() {
        assertEquals("4", advent.result);
    }
}
