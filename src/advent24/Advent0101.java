package advent24;

import base.Advent;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Maybe the lists are only off by a small amount! To find out, pair up the numbers and measure how far apart they are.
 * Pair up the smallest number in the left list with the smallest number in the right list, then the second-smallest
 * left number with the second-smallest right number, and so on.
 * Within each pair, figure out how far apart the two numbers are;
 * you'll need to add up all of those distances. For example, if you pair up a 3 from the left list with a 7 from the
 * right list, the distance apart is 4; if you pair up a 9 with a 3, the distance apart is 6.
 */
public class Advent0101 extends Advent {

    ArrayList<Integer> column1 = new ArrayList<>();
    ArrayList<Integer> column2 = new ArrayList<>();

    public Advent0101(String filePath) {
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
        while (!column1.isEmpty()){
            Integer mim1 = column1.remove(findMinIndex(column1));
            Integer mim2 = column2.remove(findMinIndex(column2));
            intResult += Math.abs(mim1 - mim2);
        }
        result = Integer.toString(intResult);
    }

    int findMinIndex(ArrayList<Integer> list) {
        int minIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}