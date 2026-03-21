// Aidyn Yeskendirov IT-2504
package tasks;

public class task5 {
    public static int Fibonacci(int num){
        if(num == 0){ return 0;}
        if(num == 1){ return 1;}
        return (Fibonacci(num - 1) + Fibonacci(num - 2));
    }
}
