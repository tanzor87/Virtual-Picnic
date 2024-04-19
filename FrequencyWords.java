import java.util.*;

/**
 * Класс анализирует, сколько раз каждое слово встречается в считываемом файле.
 */
public class FrequencyWords {
    private HashMap<String, Integer> words = new HashMap<>();

    /**
     * Метод вычисляет сколько раз каждое слово встречается в считываемом файле формируя тип данных HashMap<String, Integer>
     * @param fileName - Имя считываемого файла
     */
    public void frequencyWords(String fileName){
        FileToArray array = new FileToArray();
        List<String> arrayData = array.fileToArray(fileName);

        for (String word : arrayData){
            Integer count = words.get(word);
            if (words.containsKey(word)){
                words.put(word, count + 1);
            }
            else{
                words.put(word, 1);
            }
        }
    }

    /**
     * Метод выводит в консоль слово и число его повторений
     */
    public void showWords() {
        System.out.println("Количество овощей и фруктов в корзине составило:");

        for (Map.Entry<String, Integer> fruit : words.entrySet()){
            System.out.println(fruit.getKey() + ": " + fruit.getValue());
        }
    }

    /**
     *  Метод выводит в консоль слово и число его повторений, сортируя по убыванию повторений
     */
    public void sortedShowWords() {
        System.out.println("Количество овощей и фруктов в корзине, отсортированных по убыванию их количества, составило:");

        List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        for (Map.Entry<String, Integer> fruit : list){
            System.out.println(fruit.getKey() + ": " + fruit.getValue());
        }
    }
}
