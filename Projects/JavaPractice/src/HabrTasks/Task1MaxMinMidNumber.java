/*
Задача:
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */

package HabrTasks;

import java.util.*;

public class Task1MaxMinMidNumber {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        
        Random randomNumber = new Random();
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < randomNumber.nextInt(10_000, 200_000); i++)
             numbers.add(randomNumber.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE));
        
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.copy(sortedNumbers, numbers);
        Collections.sort(sortedNumbers);
        
        int numbersSum = 0;
        for (int i = 0; i < numbers.size(); i++)
             numbersSum += numbers.get(i);

        int minNumber = sortedNumbers.get(0);
        int midNumber = numbersSum / sortedNumbers.size();
        int maxNumber = sortedNumbers.get(sortedNumbers.size() - 1);
        
        long timeStop = System.currentTimeMillis();
        
        System.out.println("RunTime: " + (timeStop - timeStart));
        System.out.println("size: " + sortedNumbers.size());
        System.out.println("min: " + minNumber);
        System.out.println("mid: " + midNumber);
        System.out.println("max: " + maxNumber);
    }
}
