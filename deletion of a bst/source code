import java.util.*;

public class Main {
    public static void main(String[] args) {
     BST o=new BST();
     o.insert(5);
     o.insert(3);
     o.insert(1);
     o.insert(11);
     o.insert(6);
     o.insert(12);
     o.insert(13);
     o.delete(o.Root,3);
     o.delete(o.Root,1);
     o.delete(o.Root,11);
     o.inorder(o.Root);
  }
}
class node{
  int data;
  node left,right;
  node(int value){
    data=value;
    left=right=null;
  }
}
class BST{
  void inorder(node temp){
    if(temp!=null){
      inorder(temp.left);
      System.out.print(temp.data+"  ");
      inorder(temp.right);
    }
  }
  node Root;
  void insert(int key){
    Root=inserting(Root,key);
  }
  node inserting(node duplicateRoot,int key){
    if(duplicateRoot==null)
    {
      duplicateRoot=new node(key);
      return duplicateRoot;
    }
    if(key>duplicateRoot.data)
    duplicateRoot.right=inserting(duplicateRoot.right,key);
    else if(key<duplicateRoot.data)
    duplicateRoot.left=inserting(duplicateRoot.left,key);
   
     return duplicateRoot;
    
  }
  node delete(node temp,int target){
    if(temp==null)
    return temp;
    if(target>temp.data)
    temp.right=delete(temp.right,target);
    else if(target<temp.data)
    temp.left=delete(temp.left,target);
    else{
      if(temp.left==null)
      return temp.right;
      else if(temp.right==null)
      return temp.left;
      temp.data=min(temp.right);
      temp.right=delete(temp.right,temp.data);
     
    } return temp;
  }
  int min(node temp){
    if(temp==null){
    System.out.println("Empty tree");return -1;}
    else {
      int minValue=temp.data;
      while(temp!=null){
        minValue=temp.data;
        temp=temp.left;
      }
      return minValue;
    }
  }
  

  
}
