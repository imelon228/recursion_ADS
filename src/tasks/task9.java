// Aidyn Yeskendirov IT-2504
package tasks;

public class task9 {
    public static int count_ch(char[] arr, int ind){
        if(ind == 0) {return 1;}
        return 1+count_ch(arr, ind-1);
    }
}
