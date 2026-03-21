// Aidyn Yeskendirov IT-2504
import tasks.*;
import java.util.Scanner;

import static tasks.task2.find_sum;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = scanner.nextInt();
        }

        float avg = (float) find_sum(arr, 0) / num;
        System.out.println(avg);
        scanner.close();
    }
}
