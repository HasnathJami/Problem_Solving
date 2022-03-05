// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Stack<Integer> s=new Stack<>();
            int n=sc.nextInt();
            while(n-->0)
                s.push(sc.nextInt());
            GfG g=new GfG();
            Stack<Integer> a=g.sort(s);
            while(!a.empty()){
                System.out.print(a.peek()+" ");
                a.pop();
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.
        //	Stack<Integer> stTmp=new Stack<Integer>();

        //	while(!s.isEmpty())
        //	{

        //  int store=s.pop();


        //  while(!stTmp.isEmpty() && stTmp.peek()>store) // peek value smaller means stack is in descending order more large value is coming
        //  {
        //      s.push(stTmp.pop());
        //  }

        //  stTmp.push(store);


        //}

        //	return stTmp;
        Stack<Integer> stTmp=new Stack<Integer>();

        while(!s.isEmpty())

        {
            //for storing value back to the main stack if we get the smaller value in tmp.
            int store=s.pop();
            while(!stTmp.isEmpty() && store<stTmp.peek())
            {
                s.push(stTmp.pop());
            }

            // If the value of tmpStack is small the insert the values i.e: thats mean there is no problem bigger value is coming.
            stTmp.push(store);

        }

        return stTmp;


    }
}