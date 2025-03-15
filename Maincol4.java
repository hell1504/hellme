package collection4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:\n1. Добавить человека в очередь\n2. Обслужить следующего человека\n3. Посмотреть, кто в очереди\n4. Выход");
            System.out.print("Выберите действие - ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.print("Введите имя человека - ");
                    String personname = scanner.nextLine();
                    queue.offer(personname);
                    System.out.println(personname + " успешно добавлен(а) в очередь");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        String persondone = queue.poll();
                        System.out.println(persondone + " успешно обслужен(а)");
                    } else {
                        System.out.println("Очередь пуста :(");
                    }
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Очередь пуста :(");
                    } else {
                        System.out.println("В очереди:");
                        Queue<String> tempqueue = new LinkedList<>(queue);
                        int count = 1;
                        while (!tempqueue.isEmpty()) {
                            System.out.println(count + ". " + tempqueue.poll());
                            count++;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Данного пункта в списке действий нету. Попробуйте ещё раз!");
            }
        }
    }
}