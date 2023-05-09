package Patterns.Structural.proxy;

public class Service implements ServiceInterface {

    private String work;

    public Service(String work) {
        this.work = work;
    }

    @Override
    public void operation() {
        System.out.println("doing this: " + work);
    }
}
