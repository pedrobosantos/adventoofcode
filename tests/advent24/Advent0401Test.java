package advent24;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent0401Test {

    Advent0401 advent = new Advent0401("inputs/" + getClass().getName().replace(".","/") + ".txt");

    @Test
    public void testResolveProblem() {
        assertEquals("18", advent.result);
    }
}
