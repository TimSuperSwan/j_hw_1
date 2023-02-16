import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    /*
     * Задано уравнение вида q + w = e, q, w, e >= 0.
     * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69
     * Требуется восстановить выражение до верного равенства.
     * Предложить хотя бы одно решение или сообщить, что его нет.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите выражение типа q + w = e, где q, w, e >= 0");
        String expres = sc.nextLine(); //вводим выражение
        expres = expres.replace(" ", ""); // чистим от проблеов
        String[] equation = expres.split(""); // превращаем выражение в массив
        String[] charIndexes = findCharIndex(equation); // создаем массив индексов вопросиков
        

        solveEquation(equation, charIndexes, 0); // вызов метода решения уравнения


        sc.close();
    }

    private static Boolean chek(String[] equation) { // метод, который проверяет, решено ли наше уравнение
        int a = Integer.parseInt(equation[0]) + Integer.parseInt(equation[1]) * 10;
        int b = Integer.parseInt(equation[3]) + Integer.parseInt(equation[4]) * 10;
        int c = Integer.parseInt(equation[6]) + Integer.parseInt(equation[7]) * 10;
        if ((a + b) == c) {
            return true;
        } else {
            return false;
        }
    }

    /*рекурсивный метод, которые перемещается внутри уравнения по индексам вопросиков и циклично поочереди туда
    подставляет значения от 0 до 9, в котором indexInIndexes это индекс в массиве индексов вопросиков
     */
    private static void solveEquation(String[] equation2, String[] charIndexes2, int indexInIndexes) {
        int posList = Integer.parseInt(charIndexes2[indexInIndexes]); // индекс ? в уравнении
        for (int j = 0; j < 10; j++) {
            equation2[posList] = Integer.toString(j);
            if (indexInIndexes == charIndexes2.length - 1) {
                if (chek(equation2)) {
                    System.out.println(Arrays.toString(equation2));
                }

            }
            if (indexInIndexes < charIndexes2.length - 1) {
                int newIndexInIndexes = indexInIndexes + 1;
                solveEquation(equation2, charIndexes2, newIndexInIndexes);
            }

        }
    }

    // Метод, которые создаёт массив с индексами вопросиков
    private static String[] findCharIndex(String[] string) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < string.length; index++) {
            if (string[index].equals("?")) { 
                result.append(index);
            }
        }
        String[] finalResult = result.toString().split("");
        return finalResult;
    }

}
