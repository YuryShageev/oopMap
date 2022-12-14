import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");
        Random random = new Random();

        Map<String, List<Integer>> vasya = new HashMap<>();
        vasya.put("Вася", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));

        System.out.println(vasya);

        Map<String, Integer> sample1 = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry : vasya.entrySet()) {
            builder.append(entry.getKey()).append("->");
            int number = 0;
            for (Integer integer:entry.getValue()) {
                number += integer;
            }
            sample1.put(builder.toString(), number);
        }
        System.out.println(sample1);

        Map<String, List<Integer>> yura = new HashMap<>();
        yura.put("Юра", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));

        System.out.println(yura);

        Map<String, Integer> yura1 = new HashMap<>();
        StringBuilder builder1 = new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry1 : yura.entrySet()) {
            int number = 0;
            for (Integer integer : entry1.getValue()) {
                number += integer;
            }
            builder1.append(entry1.getKey()).append("->").append(number);
            yura1.put(builder1.toString(),number);
        }
        System.out.println(builder1);
    }
}
