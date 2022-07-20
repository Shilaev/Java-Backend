package JavaSyntaxis;

public class While {
    public static void main(String[] args) {
        int i = 1;

        while (i != 2) {
            System.out.println("bla bla");
        }

        do {
            System.out.println("bla bla");
            i++;
        } while (i != 2);
    }
}
