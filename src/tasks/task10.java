// Aidyn Yeskendirov IT-2504
package tasks;

public class task10{
    public static int gcd(int a, int b){
        if(a%b == 0) {return b;}
        return gcd(b, a%b);
    }
}
