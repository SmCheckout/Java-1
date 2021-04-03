public class lesson3 {

    public static void main(String[] args) {
        System.out.println(Task1(7, 5));

        System.out.println("\n\nTask 2:");
        Task2(0);

        System.out.println(Task3(1666));

        System.out.println("\nTask 4:");
        Task4("Я есть Грут!", 3);
    }



//1. Написать метод, принимающий на вход два целых числа
// и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

    static boolean Task1 (int a, int b) {
        System.out.println("Task 1:");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

//2. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

    static void Task2 (int a) {
        if (a >= 0) System.out.println(a + " = положительное число");
        else System.out.println(a + " = отрицательное число");
    }

//3. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean Task3 (int a) {
        System.out.println("\nTask 3:");
        if (a < 0) return true;
        return false;
    }

//4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз.


    static void Task4 (String message, int a) {
        for (int i = 0; i <a ; i++)
            System.out.println(message);
    }
}