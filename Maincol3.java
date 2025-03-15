package collection3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phone = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Действия:\n1. Добавить контакт\n2. Найти номер телефона по имени\n3. Выход");
            System.out.print("Выберите действие - ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.print("Введите имя - ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер телефона - ");
                    String number = scanner.nextLine();
                    phone.put(name, number);
                    System.out.println("Контакт добавлен!");
                    break;
                case 2:
                    System.out.print("Введите имя для поиска - ");
                    String namesearch = scanner.nextLine();
                    if (phone.containsKey(namesearch)) {
                        String numbersearch = phone.get(namesearch);
                        System.out.println("Номер телефона контакта " + namesearch + " - " + numbersearch);
                    } else {
                        System.out.println("Контакт с именем " + namesearch + " не найден!");
                    }
                    break;
                case 3:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Данного пункта в списке действий нету. Попробуйте ещё раз!");
            }
        }
    }
}

