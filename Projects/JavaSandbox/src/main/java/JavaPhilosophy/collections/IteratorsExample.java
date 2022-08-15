package JavaPhilosophy.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PersonForIteratorsExample {
    private int id;

    public PersonForIteratorsExample(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "" + id;
    }
}

public class IteratorsExample {

    public static void main(String[] args) {
        int size = 25;
        List<PersonForIteratorsExample> persons = new ArrayList<>(size);
        for (int i = 0; i < size; i++)
            persons.add(new PersonForIteratorsExample(i));

        Iterator<PersonForIteratorsExample> personIterator = persons.iterator();

        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }
    }
}
