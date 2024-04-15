import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FileToArray array = new FileToArray();
        String fileName = "input.txt";
        System.out.println(array.fileToArray(fileName).size());
    }
}
