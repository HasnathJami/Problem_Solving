import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().infixToPostfix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to convert an infix expression to a postfix expression.
    
      public static boolean isLeftToRightAssociative(Character operator)
    {
        if (operator == '^') return false;
        else return true;      
    }
    
    public static int prec(char ch) 
    { 
		switch (ch) 
		{ 
		    case '+': 
		    case '-': 
		        return 1; 
		    case '*': 
		    case '/': 
			    return 2; 
		    case '^': 
			    return 3; 
		} 
		return -1; 
	} 
    
	public static String infixToPostfix(String exp) 
	{
	   String result = new String("");
		Stack<Character> stack = new Stack<>(); 
		
		//iterating over the given string.
		for(int i = 0; i<exp.length(); ++i)
		{
			char c = exp.charAt(i); 
			
			//if current character is an operand, we add it to output string.
			if (Character.isLetterOrDigit(c)) 
				result += c;
				
			//else if current character is â€˜(â€˜, we push it to the stack.
			else if (c == '(')
				stack.push(c); 
			
			//else if current character is â€˜)â€™, we pop the elements from stack 
            //and add to output string until  â€˜(â€˜  is encountered in stack.
			else if (c == ')') 
			{ 
				while (!stack.isEmpty() && stack.peek() != '(') 
					result += stack.pop(); 
				
				if (!stack.isEmpty() && stack.peek() != '(') 
					return "Invalid Expression"; 				 
				else
					stack.pop(); 
			} 
			//else current character is an operator.
			else
			{ 
			    //while precedence of current character is less than or  
                //equal to precedence of top of stack we pop the top 
                //element and add it to the output string.
				while (!stack.isEmpty() && (prec(c) < prec(stack.peek()) || 
				(prec(c) == prec(stack.peek()) && 
				isLeftToRightAssociative(stack.peek()))))
					result += stack.pop(); 
					
				//pushing the current character in the stack.
				stack.push(c); 
			} 
		} 
		
		//popping all the remaining elements from the stack 
        //and adding them to output string.
		while (!stack.isEmpty()) 
			result += stack.pop(); 
			
		//returning the output string.
		return result; 
	} 
}