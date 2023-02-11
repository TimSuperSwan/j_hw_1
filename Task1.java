//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
/*1
 * 1+2
 * 1+2+3
 * 1+2+3+4
 */
import java.util.Scanner;
public class Task1{
    public static void main(String[] args){
        System.out.println("Введи число");
        Scanner sc = new Scanner(System.in, "cp866");
        String numStr = sc.nextLine();
        int num = Integer.parseInt(numStr);

        triangle(num);
        System.out.println("триугольное число: " + triangle(num));
        System.out.println("Факториал числа: " + fact(num));
        sc.close();
        
        }

    static int triangle(int num){ //рекурсия для треугольного числа
        if(num > 1){
            num += triangle(num-1);
        }
        else{
            return num;
        }
        return num;
        }
    
    static int fact(int num){
        if(num > 1){
            num *= fact(num-1);
        }
        else{
            return num;
        }
        return num;
        
    }
    
}