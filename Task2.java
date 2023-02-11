public class Task2 {
    //Вывести все простые числа от 1 до 1000

    public static void main(String[] args){
        for (int i = 0; i <= 1000; i++) {
            if (trySimple(i)) {System.out.println(i);}
        }
        
    }

    static boolean trySimple(int a){
        boolean answer = true;
        for (int i = 2; i < a; i++) {
            if(a % i == 0) {
                answer = false;
                break;
            }
        }
    return answer;
    }
}
