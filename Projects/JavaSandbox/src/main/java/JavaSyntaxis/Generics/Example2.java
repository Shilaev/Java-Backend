package JavaSyntaxis.Generics;

interface PersonalAccount<T> {
    T getId();

    T getSum();

    void setSum(T newSum);
}

class MyPersonalAccount implements PersonalAccount{

    @Override
    public Object getId() {
        return null;
    }

    @Override
    public Object getSum() {
        return null;
    }

    @Override
    public void setSum(Object newSum) {

    }
}

public class Example2 {
    public static void main(String[] args) {

    }
}
