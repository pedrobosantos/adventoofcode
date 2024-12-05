package base;

import java.io.IOException;
import java.util.ArrayList;

public class Advent04 extends Advent implements AdventPartsInt {

    protected ArrayList<ArrayList<Character>> matrix = new ArrayList<>();

    public Advent04(String filePath) {
        super(filePath);
        readFile();
    }

    public void readFile() {
        String line;
        while (true) {
            try {
                if ((line = getBr().readLine()) == null) break;
                ArrayList<Character> charList = new ArrayList<>();
                for (char c : line.toCharArray()) {
                    charList.add(c);
                }
                matrix.add(charList);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}