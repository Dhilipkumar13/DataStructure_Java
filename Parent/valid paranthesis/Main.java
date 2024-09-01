import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int capacity=scanner.nextInt();
		int choice,value;
		Stack stack=new Stack(capacity);
		String s=scanner.next();
		for(char c : s.toCharArray())
        {
            if(c=='{')
            {
                stack.push('}');
            }
            else if(c=='(')
            {
                stack.push(')');
            }
            else if(c=='[')
            {
                stack.push(']');
            }
            else if(stack.isempty() || stack.pop() != c)
            {
             System.out.println("false");
             return;
            }
        }
        System.out.println("true");
        return;
    }
	}

class Stack{
    final int size;
    int top=-1;
    int a[];
    Stack(int cap){
       size=cap;
       a=new int[size];
    }
    void push(char data)
    {
        if(top==size-1)
        {
            System.out.println("stack is overflow");
        }
        else{
            
            a[++top]=data;
        }
    }
    char pop()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow");
        }
        else{
            top--;
        }
        //return true;
    }
    boolean isempty()
    {
        if(top==-1)
        {
          return false;
        }
        return true;
        
    }
    
}