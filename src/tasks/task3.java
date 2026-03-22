// Aidyn Yeskendirov IT-2504
package tasks;

public class task3 {
    public static boolean isPrime(int num, int divisor) {
        if (num < 2) {
            return false;
        }
        if (divisor * divisor > num){
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return isPrime(num, divisor + 1);
    }
}
