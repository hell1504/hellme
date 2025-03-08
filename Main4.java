package org.example.dom4;

public class Main {

    public static int getElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс вне границ массива");
        }
        return arr[index];
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        try {
            int element1 = getElement(a, 1);
            System.out.println("Элемент по индексу 1 -- " + element1);

            int element2 = getElement(a, 5);
            System.out.println("Элемент по индексу 5 -- " + element2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне границ массива");
        }
    }
}
