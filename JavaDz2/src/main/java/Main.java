import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text");
        Scanner scanner = new Scanner(file);

        List<String> words = new ArrayList<>();
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] arrLine = line.toLowerCase().replaceAll("([^a-z\\s]+)", "").split(" ");
            System.out.println(line);

            for (String x : arrLine) {
                words.add(x);
            }
        }
        scanner.close();

        Collections.sort(words);
        Map<String, Integer> mapWords = new TreeMap<>();

        for (String key : words) {
            if (!mapWords.containsKey(key)) {
                mapWords.put(key, 1);
            } else {
                mapWords.put(key, mapWords.get(key) + 1);
            }
        }

        int max = 0;  // Максимальное число повторений
        String keyMaxWord = "";  // Значение, которое повторяется

        for (Map.Entry entry: mapWords.entrySet()) {

            int value = (int) entry.getValue();

            // Поиск максимального кол-ва повторений и повторяющегося значения
            if (value > max) {
                max = value; // Максимальное кол-во повторений элемента
                keyMaxWord = (String) entry.getKey(); // Элемент

            } else if (value == max) {
                if ((String) entry.getKey() != keyMaxWord) {
                    max = value;
                    keyMaxWord = keyMaxWord + " " + (String) entry.getKey();
                }
            }
        }



        int len = words.size();
        int frequency = Math.round((max*100)/len);


        for (Map.Entry entry: mapWords.entrySet()) {
            String key = (String) entry.getKey();
            int value = (int) entry.getValue();
            System.out.println(key+": "+value);
        }


        System.out.println(keyMaxWord);
        System.out.println(frequency+"%");

    }
}
