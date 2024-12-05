package advent24;

import base.Advent04;

public class Advent0402 extends Advent04 {

    protected final char[] word = {'M', 'A', 'S'};

    public Advent0402(String filePath) {
        super(filePath);
        resolveProblem();
    }

    public void resolveProblem() {
        int intResult = 0;
        for (int row = 0; row < matrix.size(); row++)
            for (int col = 0; col < matrix.get(row).size(); col++){
                int cross = 0;
                if (matrix.get(row).get(col) == word[1]){
                    for (int i = -1; i < 2; i+=2)
                        for (int j = -1; j < 2; j+=2)
                            if (getChar(row + j, col + i, word[0]) && getChar(row + (j*-1), col + (i*-1), word[2]))
                                cross++;
                    if (cross == 2) intResult++;
                }
            }
        result = Integer.toString(intResult);
    }

    private boolean getChar(int row, int col, char c) {
        if (row >= 0 && col >= 0 && row < matrix.size() && col < matrix.getFirst().size())
            return matrix.get(row).get(col) == c;
        else return false;
    }
}