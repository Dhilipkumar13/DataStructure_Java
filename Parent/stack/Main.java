import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int capacity=scanner.nextInt();
		int choice,value;
		Stack a=new Stack(capacity);
	 do
      {
	System.out.println ("1. push operation");
	System.out.println ("2. pop operation");
	System.out.println ("3. peek operation");
	System.out.println ("4. isempty operation");
	System.out.println ("5. is full operation");
	System.out.println ("6. Display");
	System.out.println ("0. Exit");
	System.out.print ("Enter your choice: ");
	choice = scanner.nextInt ();
	switch (choice)
	  {
	  case 1:
	    System.out.print ("Enter valueto be push: ");
	    value = scanner.nextInt ();
	    a.push(value);
	    System.out.println ("value is successfully pushed");
	    break;
	    case 2:
	    a.pop();
	    System.out.println ("value is successfully poped");
	    break;
	    case 3:
	     a.peek();
	     break;
	    case 4:
	      a.isempty();
	    break;
	    case 5:
	      a.isfull();
	    break;
	    case 6:
	      a.display();
	    break;
	    case 0:System.out.println ("mudunchu poda");
	    break;
	    default:System.out.println ("Invalid choice.");
	  }
      }
    while (choice != 0);
		
		
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
    void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("stack is overflow");
        }
        else{
            
            a[++top]=data;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is underflow");
        }
        else{
            top--;
        }
    }
    void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            for(int i=0;i<=top;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println(" ");
        }
        
    }
    void peek()
    {
         if(top==-1)
        {
            System.out.println("stack is underflow");
        }
        else{
            System.out.println("the peek element is:"+a[top]);
        }
    }
    void isfull()
    {
           if(top==size)
        {
            System.out.println("stack is full");
        }
        else{
            System.out.println("Stack is not full");
        }
    }
    void isempty()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }
}