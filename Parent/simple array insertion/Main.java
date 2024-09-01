import java.util.*;
public class Main {
    public static void main(String[] args) {
      //object creation for the ArrayList class
  ArrayList a=new ArrayList();
  //calling insert method in the ArrayList by using it's object 
 a.insert(1);
 a.insert(2);
 a.insert(3);
 a.insert(4);
 a.insert(5);
 a.display();
 a.insert(1);
 a.insert(2);
 a.insert(3);
 a.insert(4);
 a.insert(5);
 a.display();
 a.InsertParticular(28,3);
 a.DeleteParticularIndex(3);
 a.display();
 System.out.println("thank you for coming");
      }
}
class ArrayList{
  //initial size varible for every objects
 final static int initialSize=4;
//array declaration
private int a[]=new int[initialSize];
//index variable for data insertion and capacity for denoting total data can be added  
 int index=0,capacity=initialSize;
 //insert method
 void insert(int value){
//array capacity  reached condition 
  if(index==capacity)
  //calling grow method to increase the array size
  grow();
  //inserting data in the arraylist
   a[index++]=value;
 }
 void grow(){
  //increaing capacity value
   capacity=capacity*2;
   //copying original array with the increased capacity size and reassigning the new array referncwe to original array reference variable
   a=Arrays.copyOf(a,capacity);
   
   }
   void InsertParticular(int value,int pos)
   {
       if(pos>capacity||pos<0)
       {
          System.out.println("enter valid position");
          return;
       }
       if(pos==index)
       {
           a[pos]=value;
           return;
       }
       else 
       {
           if(index==capacity)
           {
               grow();
           }
           
           for(int i=index;i>pos;i--)
           {
                a[i]=a[i-1];
           }
           a[pos]=value;
           index++;
           }
       
    
   }
   void DeleteParticularIndex(int pos){
    if(index==0)
    {
        System.out.println("no element to delete");
        return;
    }
    if(pos>=capacity){
        System.out.println("give correct index");
        return;
    }
    else{
        for(int i=pos;i<index-1;i++)
        {
            a[i]=a[i+1];
        }
      index--;
           }
    }
     
 //display method to show data to user
 void display(){
  //array under flow condition
   if(index==0)
   System.out.println("List Is Empty");
   else{
     for(int i=0;i<index;i++)
   System.out.print(a[i]+" ");
   System.out.println();
 }
}
}