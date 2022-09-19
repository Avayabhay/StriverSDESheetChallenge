public   public static void sort012(int[] arr)
{
    //Write your cde here
    int n =arr.length;
    int p0=0, p1=0, p2 = n-1;
    while(p1<=p2){
        if(arr[p1] == 0){
            swap(arr, p0, p1);
            p0++;
            p1++;
        }
        else if(arr[p1] == 1){
            p1++;
        }
        else{
            swap(arr, p1, p2);
            p2--;
        }
    }
} 
public static void swap(int arr [], int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
} {
    
}
