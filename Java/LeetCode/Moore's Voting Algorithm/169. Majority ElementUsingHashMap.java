class Solution {
    public int majorityElement(int[] a) {
        
        
        int size=a.length;
        if(size==1) return a[0];
        
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        
        for(int i=0;i<size;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i],hm.get(a[i])+1);
            }
            else{
                hm.put(a[i],1);
            }
        }
        
        int maxi=Integer.MIN_VALUE;
        int store=0;
        
        for(int i=0;i<size;i++)
        {
            if(hm.get(a[i])>maxi)
            {
                maxi=hm.get(a[i]);
                store=a[i];
            }
        }
        
      //  System.out.println(maxi);
        if(maxi>(size/2)){
            return store;
        }
        
        return -1;
        
        
        
    }
}