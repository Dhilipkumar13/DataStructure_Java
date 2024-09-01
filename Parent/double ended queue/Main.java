public class Main{
  public static void main (String[] args) {
    DoubleEndedQueue o=new DoubleEndedQueue();
    
    o.enqRear(4);
    o.enqRear(5);
    o.enqRear(6);
    o.enqRear(7);
   o.enqFront(123);
   o.dequeueFront();
  }
}
class DoubleEndedQueue{
  final int size;
  int a[];
  int front,rear;
  DoubleEndedQueue(){
    size=5;
    a=new int[size];
    rear=-1;front=-1;
  }
  DoubleEndedQueue(int userSize){
    size=userSize;
    a=new int[size];
    rear=-1;front=-1;
  }
  boolean isFull(){
    if((front==0&&rear==size-1)||( front==rear+1))
    return true;
    return false;
  }
  void enqFront(int value){
    if(isFull()){
    System.out.println("QUEUE OVERFLOW");
    return ;
    }
    else if(front==-1&&rear==-1){
      front=0;
      a[front]=value;
       front=size;
    }
  else if(front==0){
      front=size;
    }
    a[--front]=value;
     }
  void enqRear(int value){
   if(isFull())
   System.out.println("QUEUE OVERFLOW");
   else if(front==-1&&rear==-1)
   front=rear=0;
   else if(rear==-1 && front!=-1)
   rear=1;
   else rear++;
   a[rear]=value;
     }
  void dequeueFront(){
    if(front==-1&&rear==-1)
    System.out.println("QUEUE UNDERFLOW");
    else if(front==rear)
    front=rear=-1;
    else if(front==size-1)
    front=0;
    else front--;
  }
}