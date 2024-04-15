import java.util.LinkedHashSet;
import java.util.List;

public class LongWord {
    public void longWord(String fileName){
        FileToArray array = new FileToArray();
        List<String> arrayData = array.fileToArray(fileName);

        int countChar = 0;
        for (String word : arrayData){
            if (countChar < word.length()){
                countChar = word.length();
            }
        }

        LinkedHashSet<String> setWords = new LinkedHashSet<String>();
        for (String word : arrayData){
            if (word.length() == countChar){
                setWords.add(word);
            }
        }

        if (setWords.size() > 1){
            System.out.println("Самые длииные слова: ");
            for (String word : setWords){
                System.out.println(word);
            }
        }
        else {
            System.out.println("Самое длинное слово: " + setWords);
        }
    }
}
