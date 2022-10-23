import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        // No. 1
        System.out.println("No. 1");
        Map<String, List<Integer>> stringListMap = new HashMap<>();
        for (int i = 1; i < 6; i++) {
            String        key      = "string" + i;
            List<Integer> integers = new ArrayList<>();
            integers.add(ThreadLocalRandom.current().nextInt(0, 1000));
            integers.add(ThreadLocalRandom.current().nextInt(0, 1000));
            integers.add(ThreadLocalRandom.current().nextInt(0, 1000));
            stringListMap.put(key, integers);
        }
        printMapList(stringListMap);
        Map<String, Integer> stringIntegerMap = transformMap(stringListMap);
        printMap(stringIntegerMap);

        // No. 2
        System.out.println("No. 2");
        Map<Integer, String> integerStringMap = new LinkedHashMap<>();

        int cnt = 1;
        while (integerStringMap.size() < 10) {
            String value = "string_" + cnt++;
            integerStringMap.put(ThreadLocalRandom.current().nextInt(0, 100), value);
        }
        for (Integer key : integerStringMap.keySet()) {
            System.out.println(key + " -> " + integerStringMap.get(key));
        }

    }

    private static Map<String, Integer> transformMap(Map<String, List<Integer>> map) {
        Map<String, Integer> newMap = new HashMap<>();
        for (String s : map.keySet()) {
            int sum = 0;
            for (Integer integer : map.get(s)) {
                sum += integer;
            }
            newMap.put(s, sum);
        }

        return newMap;
    }

    private static void printMap(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

    private static void printMapList(Map<String, List<Integer>> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " -> [" + Arrays.toString(map.get(key).toArray()) + "]");
        }
    }

}