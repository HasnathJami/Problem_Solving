class Solution {
    
    public int max(int a,int b)
        {
            if(a>b) return a;
            return b;
        }
    
    
    public int min(int a,int b)
        {
            if(a<b) return a;
            return b;
        }
    
    public int maxProfit(int[] prices) {
        
// Bruteforce        
//         int maxi=0; 
//         for(int i=0;i<prices.length-1;i++)
//         {
//             for(int j=i+1;j<prices.length;j++)
//             {
//                 maxi=max(maxi,prices[j]-prices[i]);
                
//             }            
//         }
                             
    //    return maxi;
        
       
       int maxi=Integer.MIN_VALUE;
       int mini=Integer.MAX_VALUE;
       int maxDiff=0;
        
        for(int i=0;i<prices.length;i++)
        {
            mini=min(mini,prices[i]);
            
            maxDiff=max(maxDiff,prices[i]-mini);
        }
        
        return maxDiff;
        
        
    }
}