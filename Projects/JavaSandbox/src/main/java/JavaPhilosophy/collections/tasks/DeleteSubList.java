package JavaPhilosophy.collections.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MyClassForDeleteSubList {
    private int id = 0;

    public MyClassForDeleteSubList(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "" + id;
    }
}

public class DeleteSubList {
    public static void main(String[] args) {
//        Random rand = new Random(10);

        List<MyClassForDeleteSubList> myList1 = new ArrayList<>(20);
        for (int i = 0; i < 24; i++)
            myList1.add(new MyClassForDeleteSubList(i));
        System.out.println(myList1);

        myList1.retainAll(myList1.subList(0, 11));
        System.out.println(myList1);
    }
}
