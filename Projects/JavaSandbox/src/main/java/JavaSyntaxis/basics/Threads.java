package JavaSyntaxis.basics;

class Threads extends Thread {

    public static void main(String[] args) {
        Thread myThread = new Threads();
        myThread.start();
    }

    @Override
    public void run() {
        System.out.println("hello world");
    }
}

class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                synchronized (HelloWorld.class) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("this is thread");
                }
            }
        };
        Thread thread = new Thread(task);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (HelloWorld.class) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("This is thread1");
                }
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        System.out.println("finished");

    }
}
