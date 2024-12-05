package advent24;

import base.Advent;

import java.io.IOException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Advent0302 extends Advent {

    StringBuilder str = new StringBuilder();

    public Advent0302(String filePath) {
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
            str.append(line);
        }
    }

    private void resolveProblem() {
        int intResult = 0;
        boolean enabled = true;
        Pattern pattern = Pattern.compile("mul\\((\\d+),(\\d+)\\)|do\\(\\)|don't\\(\\)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) { // Find each occurrence
            if (Objects.equals(matcher.group(), "do()"))
                enabled = true;
            else if (Objects.equals(matcher.group(), "don't()"))
                enabled = false;
            else if (enabled){
                int x = Integer.parseInt(matcher.group(1));
                int y = Integer.parseInt(matcher.group(2));
                intResult += (x * y);
            }
        }
        result = Integer.toString(intResult);
    }
}
