package JavaSyntaxis.Generics;

class BaseAccount {
    private int id;
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public BaseAccount(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }
}

class ClassicAccount extends BaseAccount {

    public ClassicAccount(int id, int sum) {
        super(id, sum);
    }
}

class Transaction<T extends BaseAccount> {
    private T from;
    private T to;
    private int sum;

    public Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        int newSum = from.getSum() - sum;
        from.setSum(newSum);

        newSum = to.getSum() + sum;
        to.setSum(newSum);
    }
}

public class Example4 {
    public static void main(String[] args) {
        ClassicAccount bob = new ClassicAccount(1, 10000);
        ClassicAccount mari = new ClassicAccount(2, 0);
        System.out.println(bob.getSum());
        System.out.println(mari.getSum());

        Transaction sendMoney = new Transaction<>(bob, mari, 10000);
        sendMoney.execute();
        System.out.println(bob.getSum());
        System.out.println(mari.getSum());
    }
}
