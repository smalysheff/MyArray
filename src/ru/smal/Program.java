package ru.smal;

public class Program {
    public static void main(String[] args) {

        MyArray array = new MyArray(new int[10]);
        array.printArray();

        array.fillTheArray();
        array.printArray();

        array.sortArray();

        array.printArray();

    }
}
