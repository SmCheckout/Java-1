import java.util.Arrays;

public class Lesson_2 {

    public static void main(String[] args) {
        System.out.println("Task 1:");
        Task1();

        System.out.println("\n\nTask 2:");
        Task2();

        System.out.println("\n\nTask 3:");
        Task3();

        System.out.println("\n\nTask 4:");
        Task4();

        System.out.println("\n\nTask 5:");
        Task5();
    }

    static void Task1() {
        int[] value = new int[] {1, 1, 0, 0, 1, 0, 1, 0};
        System.out.print("BEFORE: ");
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
            if (value[i] == 0) value[i] = 1;
            else value[i] = 0;
        }
        System.out.print("\nAFTER:  ");
        for (int i : value) {
            System.out.print(i + " ");
        }
    }

//    2. Задать пустой целочисленный массив длиной 100.
//    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    static void Task2() {
        int[] value = new int [100];
        for (int i = 0, j = 0; i < value.length; i++, j += 1) {
            value[i] = j;
            System.out.print(value[i] + " ");
        }
    }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//    пройти по нему циклом, и числа меньшие 6 умножить на 2;

    static void Task3() {
        int[] value = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("BEFORE: ");
        for (int i : value) {
            System.out.print(i + " ");
        }

        System.out.print("\nAFTER:  ");
        for (int i = 0; i < value.length; i++) {
            if (value[i] < 6) value[i] = value[i] * 2;
            System.out.print(value[i] + " ");
        }
    }


//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        static void Task4() {
            int[][] matrix = new int[5][5];

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = 1;
                matrix[i][matrix.length - i - 1] = 1;
            }

            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }


//вернуть макс и мин значения из массива


    static void Task5() {
        int[] values = {13, 66, -17,70, 123, 0, 178};
        System.out.println("Max: " + max(values));
        System.out.println("Min: " + min(values));
    }

    static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }

    static int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }
}
