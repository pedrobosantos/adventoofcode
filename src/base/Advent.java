package base;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Advent implements AdventInt{

    private BufferedReader br;
    public String result;

    public String getResult() {
        return result;
    }

    public Advent(String filePath) {
        setBr(filePath);
    }

    private void setBr(String filePath) {
        try {
            this.br = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public BufferedReader getBr() {
        return br;
    }
}
