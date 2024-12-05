package advent24;

import base.Advent04;

public class Advent0401 extends Advent04 {

    protected final char[] word = {'X', 'M', 'A', 'S'};

    public Advent0401(String filePath) {
        super(filePath);
        resolveProblem();
    }

    public void resolveProblem() {
        int intResult = 0;
        for (int row = 0; row < matrix.size(); row++)
            for (int col = 0; col < matrix.get(row).size(); col++)
                if (matrix.get(row).get(col) == word[0])
                    for (int i = -1; i < 2; i++)
                        for (int j = -1; j < 2; j++)
                            if (!(i == 0 && j == 0))
                                intResult += searchWord(row + j, col + i, i, j, 1);
        result = Integer.toString(intResult);
    }

    private int searchWord(int row, int col, int h, int v, int i) {
        if (row >= 0 && col >= 0 && row < matrix.size() && col < matrix.getFirst().size() && matrix.get(row).get(col) == word[i]){
            if (i == word.length - 1) return 1;
            else return searchWord(row + v, col + h, h, v, i + 1);
        }
        else return 0;
    }
}