public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        System.out.println(" ");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        // Задача 2
        System.out.println(" ");
        System.out.println("Задача 2");
        System.out.println(" ");
        String s1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s1);
        // Задача 3
        System.out.println(" ");
        System.out.println("Задача 3");
        System.out.println(" ");
        fullName = "Иванов Семён Семёнович";
        String s2 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + s2);
    }
    }