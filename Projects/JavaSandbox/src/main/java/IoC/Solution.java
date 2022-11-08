package IoC;

public class Solution {
    public static void main(String[] args) {
        ChatPrinter chatPrinter = new ChatPrinter(new HelloReader(), new ByeReader());
        chatPrinter.chat("Valya");
    }
}
