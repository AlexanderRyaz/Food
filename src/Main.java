import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        while (integers.size() < 21) {
            integers.add(ThreadLocalRandom.current().nextInt(0, 1000));
        }
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println("-");
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}