package org.example.dom2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 10, 5, 1, -7};

        try {
            int element = getElement(numbers, 2);
            System.out.println("Элемент массива по индексу 2 = " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс вне границ массива");
        }
    }

    public static int getElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
}
