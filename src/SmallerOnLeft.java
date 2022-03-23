
class Complete{
    // Function for finding maximum and value pair
    public static int[] Smallestonleft (int arr[], int n) {
        int[] res=new int[n];
        res[0]=-1;
        for(int i=1;i<n;i++){
            int max=-1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>max && arr[j]<arr[i]){
                    max=arr[j];
                }
            }
            res[i]=max;
        }
        return res;
    }
}