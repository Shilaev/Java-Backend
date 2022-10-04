package JavaSyntaxis.generics;

interface PersonalAccount<T> {
    T getId();

    T getSum();

    void setSum(T newSum);
}

class MyPersonalAccount implements PersonalAccount<Integer> {

    int id;
    int sum;

    public MyPersonalAccount(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Integer getSum() {
        return sum;
    }

    @Override
    public void setSum(Integer newSum) {
        sum = newSum;
    }
}

public class Example2 {
    public static void main(String[] args) {
        MyPersonalAccount myPersonalAccount = new MyPersonalAccount(1, 123);
        System.out.println(myPersonalAccount.getId());
        myPersonalAccount.setSum(123);
        System.out.println(myPersonalAccount.getSum());
    }
}
