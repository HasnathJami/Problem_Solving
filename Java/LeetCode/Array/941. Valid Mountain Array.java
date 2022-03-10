class Solution {
    public boolean validMountainArray(int[] arr) {
        
        
        if(arr.length<3) return false;
        
        int n=arr.length;
        int inc=0,dec=n-1;
        
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1]) inc++;
            
            else break;
        }
        
        for(int i=n-1;i>0;i--)
        {
            if(arr[i]<arr[i-1]) dec--;
            else break;
        }
        
        if(inc==n-1) return false;
        if(dec==0) return false;
        
        
       // int store=n-(inc+dec)
        return inc==dec;
        
       

        
    }
}