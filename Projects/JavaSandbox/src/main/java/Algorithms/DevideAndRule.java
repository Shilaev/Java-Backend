package Algorithms;

import java.util.LinkedList;
import java.util.List;

public class Accomulator {
    public int sumNumsInList(List<Integer> list) {
        // Recursive algorithm
        if(list.isEmpty()) return 0;

        return list.remove(0) + sumNumsInList(list);

//        // Simple algorithm
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }
//        return sum;
    }
    
}
