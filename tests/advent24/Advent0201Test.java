package advent24;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent0201Test {

    Advent0201 advent = new Advent0201("inputs/" + getClass().getName().replace(".","/") + ".txt");

    @Test
    public void testResolveProblem() {
        assertEquals("2", advent.result);
    }


}
