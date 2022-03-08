class Solution {
    public int majorityElement(int[] a) {
       
        int size=a.length;
        
        if(size==1) return a[0];
        
        int count=0;
        int index=0;
        int major=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==a[index])
            {
                count++;
            }
          
          else  
            {
                count--;
            }
            
            
            if(count==0)
            {
                index=i;
                count=1;
            }
        }
        
        
        for(int i=0;i<size;i++)
        {
            if(a[index]==a[i])
            {
                major++;
            }
        }
        
        if(major>size/2) return a[index];
        
        return -1;
        
        
        
    }
}