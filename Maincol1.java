package org.example.collection1;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shop = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.println("Действия:\n1. Добавить товар\n2. Удалить товар\n3. Посмотреть список");
        System.out.print("Выберите действие по пунктам - ");
        int action = scanner.nextInt();
        scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.print("Введите название товара - ");
                    String itemName = scanner.nextLine();
                    shop.add(itemName);
                    System.out.println("Товар добавлен!");
                    break;
                case 2:
                    System.out.print("Введите номер товара для удаления - ");
                    int itemNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (itemNumber > 0 && itemNumber <= shop.size()) {
                        shop.remove(itemNumber - 1);
                        System.out.println("Товар удален!");
                    } else {
                        System.out.println("Неверный номер товара!");
                    }
                    break;
                case 3:
                    if (shop.isEmpty()) {
                        System.out.println("Список покупок пуст!");
                    } else {
                        System.out.println("Ваш список покупок: ");
                        for (int i = 0; i < shop.size(); i++) {
                            System.out.println((i + 1) + ". " + shop.get(i));
                        }
                    }
                    break;
                default:
                    System.out.println("Данного пункта в списке действий нету. Попробуйте ещё раз!");
            }
        }
    }
}