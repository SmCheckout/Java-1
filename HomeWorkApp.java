public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }


    public static void checkSumSign() {
        int a = 12;
        int b = 8;

        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
int value = 100;
//  Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
//  если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
//  если больше 100 (100 исключительно) - “Зеленый”;
if (value <= 0) {
    System.out.println("Красный");
}
        if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
// объявите две int переменные a и b, и инициализируйте их любыми значениями,
// Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
// в противном случае “a < b”;
        int a = 5;
        int b = 71;
        if (a>=b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a <= b");
        }
    }
}
