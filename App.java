import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String fileName = "input.txt";

        FileToArray array = new FileToArray();
        System.out.println("Количество слов в файле: " + array.fileToArray(fileName).size());

        System.out.println();
        LongWord words = new LongWord();
        words.longWord(fileName);
    }
}
