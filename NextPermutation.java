import java.util.ArrayList;

public class NextPermutation {
    public static void main(String[] args) {

		ArrayList<Integer> ans =new ArrayList<Integer>();
		ans.add(1);
		ans.add(3);
		ans.add(2);
		ans = nextPermutation(ans);
		System.out.println(ans);
	} 
	
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
        
        int n = permutation.size();
        if(n==1) return permutation;
        int i = n-2;
        while(i>=0 && permutation.get(i)>permutation.get(i+1)) i--;
        if(i<0){
            //case for the no being the biggest
            //in this case return by reversing the no.
            reverseEle(0, permutation);
            return permutation;
        }
        int j=n-1;
        while(j>i && permutation.get(j) < permutation.get(i)) j--;
        swap(i, j, permutation);
        reverseEle(i+1, permutation);
        
        return permutation;
	}
    public static void swap(int i, int j, ArrayList<Integer> arr){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    public static void reverseEle(int i,ArrayList<Integer> arr){
        int n= arr.size();
        int j = n-1;
        while(i<=j){
            swap(i, j, arr);
            i++;
            j--;
        }
        
    }
}



	

