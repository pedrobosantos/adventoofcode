package advent24;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent0101Test {

    Advent0101 advent = new Advent0101("inputs/" + getClass().getName().replace(".","/") + ".txt");

    @Test
    public void testResolveProblem() {
        assertEquals("11", advent.result);
    }
}