import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileToArray {

    /**
     * Метод считывает файд и формирует список из слов считанных из файла.
     * Если в получившемся списке имеются пустые строки они удаляются
     * @param fileName - имя файла для считывания
     * @return - список слов List<String>
     */
    public List<String> fileToArray(String fileName) {
        List<String> inputData = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String text = reader.readLine();
            String[] textList = text.split(" ");
            inputData = Arrays.stream(textList)
                    .filter(item -> !item.isEmpty())
                    .toList();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return inputData;
    }
}
