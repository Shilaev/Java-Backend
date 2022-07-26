package JavaSyntaxis.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Character> characterQueue = new LinkedList<>();

        characterQueue.add(new Character("Vanya"));
        characterQueue.add(new Character("Olya"));
        characterQueue.add(new Character("Evgeniy"));
        characterQueue.add(new Character("Valentin"));
        characterQueue.add(new Character("Nastya"));

        while (!characterQueue.isEmpty()){
            System.out.println(characterQueue.poll().getName());
        }

        Queue<Character> characterArrayBlockingQueue = new ArrayBlockingQueue<>(5);

        characterArrayBlockingQueue.add(new Character("Vanya"));
        characterArrayBlockingQueue.add(new Character("Olya"));
        characterArrayBlockingQueue.add(new Character("Evgeniy"));
        characterArrayBlockingQueue.add(new Character("Valentin"));
        characterArrayBlockingQueue.add(new Character("Nastya"));

        while (!characterArrayBlockingQueue.isEmpty()){
            System.out.println(characterArrayBlockingQueue.poll().getName());
        }
    }
}

class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

