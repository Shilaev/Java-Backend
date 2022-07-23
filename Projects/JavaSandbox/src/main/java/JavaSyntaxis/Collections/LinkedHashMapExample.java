package JavaSyntaxis.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        for (int i = 0; i <= 100; i++) map.put(i, Integer.toString(i * 10));

        for (String elem : map.values()) System.out.println(elem);
        for (int elem : map.keySet()) System.out.println(elem);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
