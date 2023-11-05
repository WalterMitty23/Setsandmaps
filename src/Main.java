import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        TreeSet<Integer> uniqueEvens = new TreeSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                uniqueEvens.add(num);
            }
        }

        for (Integer even : uniqueEvens) {
            System.out.println(even);
        }
    }

    public static void task3() {
        List<String> words = new ArrayList<>(List.of("apple", "banana", "cherry", "apple", "date", "banana"));

        HashSet<String> uniqueWords = new HashSet<>(words);

        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCounts.keySet()) {
            System.out.println(wordCounts.get(word));
        }
    }
}
