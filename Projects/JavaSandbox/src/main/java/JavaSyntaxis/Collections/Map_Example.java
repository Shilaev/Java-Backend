package JavaSyntaxis.Collections;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= 100; i++) map.put(i, i * 10);

        map.put(1, 1000000);
        map.get(1); // 1000000

        for (int elem : map.values()) System.out.println(elem);
        for(int elem: map.keySet()) System.out.println(elem);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

    }
}
