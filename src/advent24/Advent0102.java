package advent24;

import base.Advent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * This time, you'll need to figure out exactly how often each number from the left list appears in the right list.
 * Calculate a total similarity score by adding up each number in the left list after multiplying it by the number
 * of times that number appears in the right list.
 */
public class Advent0102 extends Advent {

    ArrayList<Integer> column1 = new ArrayList<>();
    ArrayList<Integer> column2 = new ArrayList<>();

    public Advent0102(String filePath) {
        super(filePath);
        readFile();
        resolveProblem();
    }

    void readFile() {
        String line;
        while (true) {
            try {
                if ((line = getBr().readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String[] values = line.split("\\s+");
            if (values.length == 2) {
                column1.add(Integer.parseInt(values[0]));
                column2.add(Integer.parseInt(values[1]));
            }
        }
    }

    private void resolveProblem() {
        int intResult = 0;
        for (Integer num : column1){
            intResult += (int) (num * column2.stream().filter(element -> Objects.equals(element, num)).count());
        }
        result = Integer.toString(intResult);
    }
}
