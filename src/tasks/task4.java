// Aidyn Yeskendirov IT-2504
package tasks;

public class task4 {
    public static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        return num*factorial(num-1);
    }
}
