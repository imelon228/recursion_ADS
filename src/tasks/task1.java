package tasks;

// Aidyn Yeskendirov IT-2504
public class task1 {
    public static void all_digits(int num){
        if(num / 10 == 0){
            System.out.println(num);
        } else {
            all_digits(num / 10);
            all_digits(num % 10);
        }
    }
}
