import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      BST o=new BST();
      System.out.println("enter how many node to be created");
      int a=sc.nextInt();
      for(int i=0;i<a;i++)
      o.insert(sc.nextInt());
      System.out.println(o.depth(o.Realroot));
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

int depth(node root)
{
    if(root==null)
    {
        return 0;
    }
    if(root.left==null)
    {
        return depth(root.right)+1;
    }
     if(root.right==null)
    {
        return depth(root.left)+1;
    }
    return Math.max(depth(root.left),depth(root.right));
}
}