public class App {
    public static void main(String[] args) {
        String fileName = "input.txt";

        FileToArray array = new FileToArray();
        System.out.println("Общее количество овощей и фруктов в корзине составило: " +
                array.fileToArray(fileName).size() +
                " шт.");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        LongWord words = new LongWord();
        words.longWord(fileName);

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        FrequencyWords freqWords = new FrequencyWords();
        freqWords.frequencyWords(fileName);
        freqWords.showWords();

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        freqWords.sortedShowWords();
    }
}
