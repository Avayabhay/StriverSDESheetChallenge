import java.util.ArrayList;

public class BuyAndSellStocks{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
       int minSoFar=Integer.MAX_VALUE, currProft=0, maxProft = 0;
        
        for(int a : prices){
            if(minSoFar > a){
                minSoFar = a;
            }
            
            currProft = a - minSoFar;
            if(maxProft < currProft){
                maxProft = currProft;
            }
        }
        
        return maxProft;
    }
}