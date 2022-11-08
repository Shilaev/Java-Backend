package IoC;

public class Solution {
    // зависимость от Reader
    Reader helloReader = new HelloReader();
    Reader byeReader = new ByeReader();

    public void chat(String s){
        helloReader.print(s);
        byeReader.print(s);
    }
}
