package Patterns.Structural.proxy;

public class ServiceProxy implements ServiceInterface {
    private Service realService;
    private String work;

    public ServiceProxy(String work) {
        this.work = work;
    }

    public String getWork() {
        return this.work;
    }

    @Override
    public void operation() {
        if (realService == null) {
            realService = new Service(work);
        }
        realService.operation();
    }
}
