package JavaSyntaxis.generics;

class Account<T> {
    private final T id;
    private int sum;

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

class Example1<T> {
    public static void main(String[] args) {
        Account tomAcc = new Account<Integer>(1, 100000);
        System.out.println(tomAcc.getId());
        System.out.println(tomAcc.getSum());

        Account mariAcc = new Account<String>("second", 10000);
        System.out.println(mariAcc.getId());
        System.out.println(mariAcc.getSum());
    }
}




