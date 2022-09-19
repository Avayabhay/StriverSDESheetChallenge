public class MaximumSubarraySum {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long maxTillNow =0;
        long maxCurr = 0;
        if(n == 0){
            return 0;
        }
        for(int i=0; i<n; i++){
            maxCurr += arr[i];
            if(maxCurr > maxTillNow){
                maxTillNow = maxCurr;
            }
            if(maxCurr < 0){
                maxCurr = 0;
            }
        }
        return maxTillNow;
	}
}
