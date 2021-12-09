package pro.sky.java.course2.homework06;

import java.util.*;

public class Main06 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 2");
        nums.sort(Comparator.naturalOrder());
        for (int i = 0; i < nums.size(); i++) {
            if (i == 0 && nums.get(i) % 2 == 0) {
                System.out.print(nums.get(i) + " ");
            } else if (nums.get(i) % 2 == 0 && !Objects.equals(nums.get(i), nums.get(i - 1))){
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 3");
        List<String> words = new ArrayList<>(List.of("привет", "как", "дела", "как", "погода", "очень", "очень", "хорошо"));
        List<String> words2 = words;
        words2.sort(Comparator.naturalOrder());
        for (int i = 0; i < words2.size(); i++) {
            if ((i == 0 && !Objects.equals(words2.get(i), words2.get(i + 1))) ||
                    (i == words2.size() - 1 && !Objects.equals(words2.get(i), words2.get(i - 1)))) {
                System.out.print(words2.get(i) + " ");
            } else if (!Objects.equals(words2.get(i), words2.get(i - 1)) && !Objects.equals(words2.get(i), words2.get(i + 1))) {
                System.out.print(words2.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 4");
        int doubles = 0;
        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = words.size() - 1; j > i; j--) {
                if (Objects.equals(words.get(i), words.get(j))) {
                    doubles++;
                }
            }
        }
        System.out.println(doubles);
    }

}
