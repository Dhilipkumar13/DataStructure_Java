import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      BST o=new BST();
      for(int i=0;i<5;i++)
      o.insert(sc.nextInt());
    System.out.print("Inorder :");
     o.inorder(o.Realroot);
      System.out.println();
     System.out.print("preorder :");
      o.preorder(o.Realroot);
       System.out.println();
     System.out.print("postorder :");
      o.postorder(o.Realroot);
       System.out.println();
             System.out.println(o.Search(o.Realroot,4));
             o.count(o.Realroot);
             System.out.println(o.cout);
             o.minimum(o.Realroot);
             o.maximum(o.Realroot);
             o.secondmaximum(o.Realroot);
             o.secondminimum(o.Realroot);
  }
}
class node{
  int data;
  node left,right;
  node(int key){
    data=key;
    left=right=null;
  }
}

class BST{
      node Realroot;
    void insert(int key){
        Realroot=insertRecursively(Realroot,key);
    }
    node insertRecursively(node dupRoot,int key){
 
        if(dupRoot==null){
          dupRoot=new node(key);
            return dupRoot;
        }
        if(key>dupRoot.data){
            dupRoot.right=insertRecursively(dupRoot.right,key);
        }  
       else if(key<dupRoot.data){
              dupRoot.left=insertRecursively(dupRoot.left,key);
        }
        return dupRoot;
    }
    void inorder(node root)
    {
        if(root!=null)
        {
             inorder(root.left);
             System.out.print(root.data+" ");
             inorder(root.right);
        }
    }
        void preorder(node root)
    {
        if(root!=null)
        {
             System.out.print(root.data+" ");
             preorder(root.left);
             preorder(root.right);
        }
    }
        void postorder(node root)
    {
        if(root!=null)
        {
             postorder(root.left);
             postorder(root.right);
             System.out.print(root.data+" ");
        }
    }
    boolean Search(node temp,int key){
       // node temp=Realroot;
           if(temp==null){
            return false;}
        else if(key<temp.data){
            return Search(temp.left,key);
        }
        else if(key>temp.data){
            return Search(temp.right,key);
        }
        else{
            return true;
        }
    }
    int cout=1;
      void count(node root)
    {
        if(root!=null)
        {
             count(root.left);
          //   System.out.print(root.data+" ");
             cout=cout+1;
             count(root.right);
        }
    }
    int minva=0;
    int maxva=0;
    void minimum(node temp)
    {
        if(temp==null)
        {
            System.out.println("tree is empty");
        }
        else{
            while(temp!=null)
            {
                minva=temp.data;
                temp=temp.left;
            }
            System.out.println("minimum value is :"+ minva);
        }
        
    }
        void maximum(node temp)
    {
        if(temp==null)
        {
            System.out.println("tree is empty");
        }
        else{
            while(temp!=null)
            {
                maxva=temp.data;
                temp=temp.right;
            }
            System.out.println("maximum  value is :"+ maxva);
        }
        
    }
    int secmax=0;
    void secondmaximum(node temp)
    {
        if(temp==null)
        {
            System.out.println("tree is empty");
        }
        else{
          int m=temp.data;
            while(temp!=null)
            {
                m=temp.data;
                secmax=m;
                temp=temp.right;
            }
            System.out.println("second maximum  value is :"+ secmax);
        }
        
    }
        int secmin=0;
    void secondminimum(node temp)
    {
        if(temp==null)
        {
            System.out.println("tree is empty");
        }
        else{
            while(temp.left!=null)
            {
                secmin=temp.data;
                temp=temp.left;
            }
            System.out.println("second minimum  value is :"+ secmin);
        }
        
    }
  }
