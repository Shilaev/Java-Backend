package JavaSyntaxis.Basics;

public class Switch {
    public static void main(String[] args) {
        switch (args[0]){
            case "one":
                System.out.println("first one");
                break;
            case "two":
                System.out.println("two");
                break;
            default:
                System.out.println("No one");
                break;
        }
    }
}
