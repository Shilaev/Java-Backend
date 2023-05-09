package Patterns.Structural.proxy;

public class Solution {
    public static void main(String[] args) {
        ServiceProxy service = new ServiceProxy("work");
        System.out.println(service.getWork());

        service.operation();
    }
}
