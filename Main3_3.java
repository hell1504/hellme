package org.example.dom3_3;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Ольга Константиновна", 30000);
        Manager manager = new Manager("Александр Валерьевич", 60000);
        Chief chief = new Chief("Иван Иванович", 100000);
        Secretary secretary = new Secretary("Артём Александрович", 40000);

        System.out.println("РАБОЧИЙ: ");
        worker.work();
        System.out.println("Зарплата: " + worker.getSalary());

        System.out.println("\nМЕНЕДЖЕР: ");
        manager.work();
        System.out.println("Зарплата: " + manager.getSalary());

        System.out.println("\nДИРЕКТОР: ");
        chief.work();
        System.out.println("Зарплата: " + chief.getSalary());

        System.out.println("\nСЕКРЕТАРЬ: ");
        secretary.work();
        System.out.println("Зарплата: " + secretary.getSalary());
        secretary.attendMeeting();
    }
}
