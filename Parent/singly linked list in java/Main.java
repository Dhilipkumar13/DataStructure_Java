public class Main
{
	public static void main(String[] args) {
	System.out.println("Hello World");
	
	Singly a=new Singly();
	a.InsertAtEnd(2);
	a.InsertAtEnd(3);
	a.InsertAtEnd(4);
	a.InsertAtBegin(9);
	a.InsertAtMiddle(8,34);
	a.Display();
	a.DeleteAtEnd();
	a.Display();
	a.DeleteBegin();
	a.Display();
	a.DeleteAtMid(0);
	a.Display();
	a.length();

		}
}
class Singly{
    int len=0;
    node head;
class node{
    int data;
    node next;
    node(int value){
        data=value;
        
    }
}
void InsertAtEnd(int insertValue){
    node t=new node(insertValue);
    if(head==null){
        head=t;
    }
    else{
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=t;
        
    }
    
    
}
void Display()
{
    if(head==null)
    {
        System.out.println("list is empty");
    }
    else{
        node temp=head;
      while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
       
    }
}
void InsertAtMiddle(int insertValue,int pos){
    node t=new node(insertValue);
    if(pos>len)
    {
        System.out.println("enter valid position");
    }
    else if(pos==0)
    {
        node tem=head;
        head=t;
        t.next=tem;
    }else{
    int a=1;
    node temp=head;
    while(a!=pos)
    {
        temp=temp.next;
        a++;
    }
    node te=temp.next;
    temp.next=t;
    t.next=te;
}
}
void InsertAtBegin(int insertValue){
    node t=new node(insertValue);
    if(head==null){
        head=t;
    }
    else{
        node temp=head;
        head=t;
        head.next=temp;
    }
}
void DeleteAtEnd(){
    if(head==null)
    {
        System.out.println("no element to delete");
    }
    node temp=head;
    while(temp.next.next!=null)
    {
        temp=temp.next;
    }
    temp.next=null;
}
void DeleteBegin(){
    node temp=head.next;
    head=temp;
    
}
void DeleteAtMid(int pos){
    node temp=head;
    if(pos>len)
    {
        System.out.println("enter valid position");
    }
    else if(pos==0)
    {
        head=head.next;
    
    }
    else{
    int a=1;
    while(a!=pos)
    {
        temp=temp.next;
        a++;
    }
    node te=temp.next;
    temp.next=te.next;
   // te=null;
    
}
}
void length()
{
    node temp=head;
    while(temp!=null)
    {
        len++;
        temp=temp.next;
    }
    	System.out.println(len);
}
}