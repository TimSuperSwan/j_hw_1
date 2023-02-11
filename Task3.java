import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    //Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4

    public static void main (String[] args){
    Scanner sc = new Scanner(System.in, "cp866");
    System.out.println("Калькулятор:");
    String virogenie = sc.nextLine();
    String[] parts = virogenie.split(" ");
    
    double answer = calc(parts);
    System.out.println(answer);



    }

    static double calc(String[] parts){
        double a = Integer.parseInt(parts[0]);
        double b = Integer.parseInt(parts[2]);
        switch(parts[1]){
            case "+":
            return a + b;
            case "-":
            return a - b;
            case "*":
            return a * b;
            case "/":
            return (a / b);
        }
        return 0;
    }
}
