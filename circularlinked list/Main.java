public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        circular a=new circular();
        a.InsertBegin(6);
        a.InsertBegin(6);
        a.InsertEnd(8);
        a.InsertAtMiddle(1,2);
        a.display();
    }
}
class circular{
    node head,tail;
    class node{
        int data;
        node next;
        node(int value){
            data=value;
            next=null;
        }
    }
    void InsertBegin(int n)
    {
        node t=new node(n);
        if(head==null){
            head=t;
            tail=t;
        }
        else{
           tail.next=t;
           t.next=head;
           head=t;
            
        }
    }
    void InsertEnd(int m)
    {
      node t=new node(m);
      if(head==null){
        head=tail=t;
        t.next=head;
      }
      else{
        tail.next=t;
        t.next=head;
        head=t;
      }
    }
    void InsertAtMiddle(int insertValue,int pos){
    node t=new node(insertValue);
    /*if(pos>len)
    {
        System.out.println("enter valid position");
    }
    else*/ if(pos==0)
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
void display()
{
    if(head==null)
    {
        System.out.print("list is empty");
    }
    else{
        node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }while(temp!=head);
    }
}
}