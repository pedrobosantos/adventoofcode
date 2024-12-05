package advent24;

import base.Advent;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Advent0301 extends Advent {

    StringBuilder str = new StringBuilder();

    public Advent0301(String filePath) {
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
        Pattern pattern = Pattern.compile("mul\\((\\d+),(\\d+)\\)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            intResult += (x * y);
        }
        result = Integer.toString(intResult);
    }
}
