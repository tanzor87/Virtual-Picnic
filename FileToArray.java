import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileToArray {

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

//            System.out.println(inputData.size());
//            for (String word : inputData){
//                System.out.println(word);
//            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return inputData;
    }
}
