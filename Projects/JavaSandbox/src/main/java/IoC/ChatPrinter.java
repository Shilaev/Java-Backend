package IoC;

public class ChatPrinter {
    // зависимость от Reader
//    private Reader helloReader = new HelloReader();
//    private Reader byeReader = new ByeReader();

    Reader helloReader;
    Reader byeReader;

    // Теперь у нас есть возможность управлять функционалом интерфейса Reader
    // но класс ChatPrinter не знает о существовании и внутренней работе
    // данного интерфейса. это еще называется Агрегация
    public ChatPrinter(Reader helloReader, Reader byeReader) {
        this.helloReader = helloReader;
        this.byeReader = byeReader;
    }

    public void chat(String s){
        helloReader.print(s);
        byeReader.print(s);
    }
}
