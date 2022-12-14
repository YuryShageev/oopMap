import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");
        Random random = new Random();

        Map<String, List<Integer>> vasya = new HashMap<>();
        vasya.put("Вася", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
        vasya.put("Коля", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));

        System.out.println(vasya);

        Map<String, Integer> sample1 = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry : vasya.entrySet()) {
            int number = 0;
            for (Integer integer:entry.getValue()) {
                number += integer;
            }
            builder.append(entry.getKey()).append("->").append(number).append(", \n");
            sample1.put(builder.toString(), number);
        }
        System.out.println(builder);

//        Map<String, List<Integer>> yura = new HashMap<>();
//        yura.put("Юра", List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000)));
//
//        System.out.println(yura);

//        Map<String, Integer> yura1 = new HashMap<>();
//        StringBuilder builder1 = new StringBuilder();
//        for (Map.Entry<String, List<Integer>> entry1 : yura.entrySet()) {
//            int number = 0;
//            for (Integer integer : entry1.getValue()) {
//                number += integer;
//            }
//            builder1.append(entry1.getKey()).append("->").append(number);
//            yura1.put(builder1.toString(),number);
//        }
//        System.out.println(builder1);
//        hateMaps();
    }

//    public static void hateMaps() {
//        Random random = new Random();
//
//        Map<Integer, String> map = new HashMap<>();
//        map.put(random.nextInt(20), "Света");
//        map.put(random.nextInt(20), "Вика");
//        map.put(random.nextInt(20), "Марина");
//        map.put(random.nextInt(20), "Оля");
//        map.put(random.nextInt(20), "Рита");
//        map.put(random.nextInt(20), "Катя");
//        map.put(random.nextInt(20), "Олеся");
//        map.put(random.nextInt(20), "Алина");
//        map.put(random.nextInt(20), "Маша");
//        map.put(random.nextInt(20), "Лиза");
//        System.out.println(map);
//
//        int number = 0;
//        StringBuilder builder = new StringBuilder();
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//
//            number = number + 1;
//            builder.append(number).append(". ").append(entry.getKey()).append(":").append(entry.getValue()).append(" \n");
//        }
//        System.out.println(builder);
//    }
}
