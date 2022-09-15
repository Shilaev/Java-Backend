package lambdaExpressions;

interface Executable {
    void execute();
}

class Runner {
    public Runner() {
    }

    public Runner(Executable e) {
    }

    public void run(Executable e) {
    }

}

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        Runner myRunner1 = new Runner();
        myRunner1.run(() -> {
        });

        Runner myRunner2 = new Runner(() -> {
        });
    }
}
