import java.util.*;
public class TreeSet {
    // Function for finding maximum and value pair
    public static int[] Smallestonleft (int arr[], int n) {
        int[] res=new int[n];
        res[0]=-1;
        TreeSet set=new TreeSet<Integer>();
        set.add(arr[0]);
        for(int i=1;i<n;i++){
            Integer x=set.floor(arr[i]-1);
            if(x==null){
                res[i]=-1;
            }
            else{
                res[i]=x;
            }
            set.add(arr[i]);
        }
        return res;
    }
}