package advent24;

import base.Advent;
import java.io.IOException;
import java.util.ArrayList;

public class Advent0201 extends Advent {

    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public Advent0201(String filePath) {
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
            ArrayList<Integer> row = new ArrayList<>();
            for (String num : values) {
                row.add(Integer.parseInt(num));
            }
            list.add(row);
        }
    }

    private void resolveProblem() {
        int intResult = 0;
        for (ArrayList<Integer> row : list)
            if ((isAscending(row) || isDescending(row)) && maxInterval(row) <= 3)
                intResult ++;
        result = Integer.toString(intResult);
    }

    private Boolean isDescending(ArrayList<Integer> row) {
        for (int i = 0; i < row.size() - 1; i++)
            if (row.get(i) <= row.get(i + 1))
                return false;
        return true;
    }

    private Boolean isAscending(ArrayList<Integer> row) {
        for (int i = 0; i < row.size() - 1; i++)
            if (row.get(i) >= row.get(i + 1))
                return false;
        return true;
    }

    private int maxInterval(ArrayList<Integer> row) {
        int intResult = Math.abs(row.get(0) - row.get(1));
        for (int i = 1; i < row.size() - 1; i++)
            if (Math.abs(row.get(i) - row.get(i + 1)) > intResult)
                intResult = Math.abs(row.get(i) - row.get(i + 1));
        return intResult;
    }
}
