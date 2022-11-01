package Algorithms;

import java.util.LinkedList;
import java.util.List;

public class QuickSort {
    public List<Integer> sort(List<Integer> list) {

        if (list.size() < 2)
            return list;

        int ref = list.get(list.size() / 2);
        List<Integer> predRef = new LinkedList<Integer>();
        List<Integer> postRef = new LinkedList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            int cursor = list.get(i);

            if (ref > cursor) {
                list.set(i, ref);
                predRef.add(cursor);
            }
            if (ref < cursor) {
                postRef.add(cursor);
            }
        }

        List<Integer> returnList = new LinkedList<>();
        returnList.addAll(sort(predRef));
        returnList.add(ref);
        returnList.addAll(sort(postRef));

        return returnList;
    }
}
