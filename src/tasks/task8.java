// Aidyn Yeskendirov IT-2504
package tasks;

public class task8 {
    public static boolean if_digits(char[] arr, int ind){
        if(ind < 0){
            return true;
        }
        if(arr[ind] == '0'
                || arr[ind] == '1'
                || arr[ind] == '2'
                || arr[ind] == '3'
                || arr[ind] == '4'
                || arr[ind] == '5'
                || arr[ind] == '6'
                || arr[ind] == '7'
                || arr[ind] == '8'
                || arr[ind] == '9'){ return if_digits(arr, ind-1);}
        return false;
    }
}
