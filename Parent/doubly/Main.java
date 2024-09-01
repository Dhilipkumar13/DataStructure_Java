
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Doubly o=new Doubly();
		    o.InsertAtBegin(9);
			o.InsertAtBegin(9);
			o.InsertAtBegin(9);
			o.InsertAtBegin(9);
			o.InsertAtBegin(9);
			o.InsertAtEnd(4);
			o.InsertAtMiddle(54,1);
			o.Display();
			
		    o.length();
		   
				}
}
class Doubly{
    node head,tail;
    class node{
        int data;
        node prev,next;
        node(int value){
            data=value;
            prev=next=null;
        }
    }
    int l=0;
    void InsertAtEnd(int d){
        node t=new node(d);
        if(head==null)
        {
            head=tail=t;
            t.next=head;
            head.prev=t;
        }
        else{
            tail.next=t;
             t.prev=tail;
            t.next=head;
            head.prev=t;
            tail=t;
        }
        
    }
   void Display(){
        if(head==null){
          System.out.print("no element to display");
            
        }else{
          node t=head;
         do{
            System.out.print(t.data+" ");
            t=t.next;
          } while(t!=tail.next);
          System.out.println("");
        }
    }
    void InsertAtBegin(int d){
      node t=new node(d);
      if(head==null){
        head=tail=t;
       head.prev=tail;
      }else{
        node te=head;
        head=t;
        head.prev=tail;
        head.next=te;
        te.prev=head;
        tail.next=head;
 
      }
      
    }
    void InsertAtMiddle(int d,int pos){
     length();
      node t=new node(d);
      if(pos==0){
      InsertAtBegin(d);
      }
       else if(pos>=l|| pos<0){
              System.out.println("enter valid position");
                            }
          else{
                int i=0;
                node temp=head;
                node temp1=head;
                while(i!=pos){
                temp1=temp;
                temp=temp.next;
                 i++;
      }
    
      temp1.next=t;
      t.prev=temp1;
      t.next=temp;
      temp.prev=t;
          }
          
    }
    void length()
    {
        l=0;
        node temp=head;
    do        {
            temp =temp.next;
            l++;
       
        }   while(temp!=tail);
        //System.out.println(l+1);
    }
    
}