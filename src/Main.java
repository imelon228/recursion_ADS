// Aidyn Yeskendirov IT-2504
import tasks.*;
import java.util.Scanner;

import static tasks.task2.find_sum;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(task10.gcd(num1, num2));

        scanner.close();

    }
}
