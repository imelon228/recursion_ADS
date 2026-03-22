// Aidyn Yeskendirov IT-2504
import tasks.*;
import java.util.Scanner;

import static tasks.task2.find_sum;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(task3.isPrime(number,2) == true){
            System.out.println("Prime");
        } else{
            System.out.println("Composite");
        }
        scanner.close();
    }
}
