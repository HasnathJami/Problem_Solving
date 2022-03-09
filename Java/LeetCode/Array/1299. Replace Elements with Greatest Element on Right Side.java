class Solution {
    public int[] replaceElements(int[] arr) {
        
        int len=arr.length;
        int right[]=new int[len];
        int maxi=arr[len-1];
        
        for(int i=len-2;i>=0;i--)
        {
          
            // right[i]=maxi;
            //if(arr[i]>maxi)
           //     maxi=arr[i];
            
            int store=arr[i];
            arr[i]=maxi;
            if(store>maxi)    
                maxi=store;
            
        
        }
        
        //right[len-1]=-1;
        arr[len-1]=-1;
        
       // return right;
        return arr;
        
    }
}