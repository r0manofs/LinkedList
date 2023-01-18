package org.example;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayOfStrings = new MyArrayList<>();
        arrayOfStrings.add("1");
        arrayOfStrings.add("2");
        arrayOfStrings.add("3");
        arrayOfStrings.add("3");
        arrayOfStrings.add("3");
        arrayOfStrings.add("3");
        arrayOfStrings.add("3");

        System.out.println(arrayOfStrings);

        System.out.println("\n" + arrayOfStrings.size());

        arrayOfStrings.remove(1);
        System.out.println(arrayOfStrings);
    }
}