package JavaPhilosophy.multithreading;

/*
Интерфейс Runnable является инструментом для описания задач,
которые будут выполняться внутри потока.

Thread.yield() - является рекомендацией для планиовщика потоков.
Метод говорит, что основная, важная часть цикла выполнена, сейчас было бы
неплохо переключиься на другую задачу.

Планировщик потоков - подсистема механизма потоков java,
которая переключает процессор с одного потока на другой.

Метод run() не обладает никакими "встроенными" потоковыми способностями.
Чтобы добиться потокового выполнения, необходимо явно присоединить задачу к потоку.
 */

class LiftOff implements Runnable {
    private static int taskCount = 0;
    private final int id = taskCount++;

    protected int countDown = 10; // default

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "LiftOff!!") + "), ";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }
}

public class RunnableInterfaceExample {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
