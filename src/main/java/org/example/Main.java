package org.example;

public class Main {
    public static void main(String[] args) {
        ClassAge instance = new ClassAge();
        int returnedAge = instance.printAndReturnAge();
        System.out.println("~~~" + returnedAge + "~~~");
    }
}