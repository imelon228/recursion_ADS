// Aidyn Yeskendirov IT-2504
package tasks;

public class task2 {
    public static float find_sum(int[] arr, int steps){
        if (steps == arr.length){
            return 0;
        }
        return arr[steps] + find_sum(arr, steps+1);
    }
}
