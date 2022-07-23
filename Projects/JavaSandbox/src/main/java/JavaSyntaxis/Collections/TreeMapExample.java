package JavaSyntaxis.Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        for (int i = 0; i <= 100; i++) map.put(i, Integer.toString(i * 10));

        for (String elem : map.values()) System.out.println(elem);
        for (int elem : map.keySet()) System.out.println(elem);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
