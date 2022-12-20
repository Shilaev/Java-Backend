package CodeWars;

public class SquareEveryDigit {
    public static void main(String[] args) {
    }

    public String squareDigits(int n) {
        String[] numbers = String.valueOf(n).split("");
        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            result.append(Integer.parseInt(number) * Integer.parseInt(number));
        }
        return result.toString();
    }
}
