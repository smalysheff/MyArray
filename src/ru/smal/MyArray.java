package ru.smal;

public class MyArray {
    int[] arr;

    public MyArray(int[] arr){
        this.arr = arr;
    }

    public int[] getArr(){
        return arr;
    }

    public int[] fillTheArray(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
    }
    public void printArray(){
        for (int x: arr) {
            System.out.printf("%d ", x);
        }
        System.out.println();
    }
    public void sortArray(){
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
