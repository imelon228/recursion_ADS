// Aidyn Yeskendirov IT-2504
package tasks;

public class task7 {
    public static String reverse(int[] arr, int ind){
        if(ind == 0){
            return " ";
        }
        //System.out.println(arr[ind-1] + reverse(arr, ind-1));
        return arr[ind-1] + " " + reverse(arr, ind-1);
    }
}
