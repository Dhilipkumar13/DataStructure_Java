import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    System.out.println
      ("**********************welcome to kidumutti shop******************************");
    Scanner scanner = new Scanner (System.in);
    Singly a = new Singly ();
      a.length ();
    int choice = 0, value = 0, pos = 0;
    do
      {
	System.out.println ("1. Insert at beginning");
	System.out.println ("2. Insert at end");
	System.out.println ("3. InsertAtMiddle");
	System.out.println ("4. DeleteBegin");
	System.out.println ("5. DeleteAtMid");
	System.out.println ("6. DeleteAtEnd");
	System.out.println ("7. length");
	System.out.println ("8. Display");
	System.out.println ("0. Exit");
	System.out.print ("Enter your choice: ");
	choice = scanner.nextInt ();
	switch (choice)
	  {
	  case 1:
	    System.out.print ("Enter value: ");
	    value = scanner.nextInt ();
	    a.InsertAtBegin (value);
	    System.out.println ("value is successfully inserted");
	    break;
	    case 2:System.out.print ("Enter value: ");
	    value = scanner.nextInt ();
	    a.InsertAtEnd (value);
	    System.out.println ("value is successfully inserted");
	    break;
	    case 3:System.out.println ("Enter value to InsertAtMiddle: ");
	    value = scanner.nextInt ();
	    System.out.println ("Enter position");
	    pos = scanner.nextInt ();
	    a.InsertAtMiddle (value, pos);
	    System.out.println ("value is successfully inserted");
	    break;
	    case 4:a.DeleteBegin ();
	    System.out.println ("value is successfully delted");
	    break;
	    case 5:System.out.println ("enter the position to be deleted");
	    pos = scanner.nextInt ();
	    a.DeleteAtMid (pos);
	    System.out.println ("value is successfully deleted");
	    break;
	    case 6:a.DeleteAtEnd ();
	    System.out.println ("value is successfully deleted");
	    break;

	    case 7:a.length ();
	    break;
	    case 8:a.Display ();
	    break;
	    case 0:System.out.println ("mudunchu poda");
	    break;

	    default:System.out.println ("Invalid choice.");
	  }
      }
    while (choice != 0);

  }
}

class Singly
{
  int len = 0;
  node head;
  class node
  {
    int data;
    node next;
      node (int value)
    {
      data = value;

    }
  }
  void InsertAtEnd (int insertValue)
  {
    node t = new node (insertValue);
    if (head == null)
      {
	head = t;
      }
    else
      {
	node temp = head;
	while (temp.next != null)
	  {
	    temp = temp.next;
	  }
	temp.next = t;

      }


  }
  void Display ()
  {
    if (head == null)
      {
	System.out.println ("list is empty");
      }
    else
      {
	node temp = head;
	while (temp != null)
	  {
	    System.out.print (temp.data + " ");
	    temp = temp.next;
	  }
	System.out.println ();

      }
  }
  void InsertAtMiddle (int insertValue, int pos)
  {
    node t = new node (insertValue);
    if (head == null)
      {
	System.out.println ("list is empty");
      }
    if (pos > len)

      {
	System.out.println ("enter valid position");
      }
    else if (pos == 0)
      {
	node tem = head;
	head = t;
	t.next = tem;
      }
    else
      {
	int a = 1;
	node temp = head;
	while (a != pos)
	  {
	    temp = temp.next;
	    a++;
	  }
	node te = temp.next;
	temp.next = t;
	t.next = te;
      }
  }
  void InsertAtBegin (int insertValue)
  {
    node t = new node (insertValue);
    if (head == null)
      {
	head = t;
      }
    else
      {
	node temp = head;
	head = t;
	head.next = temp;
      }
  }
  void DeleteAtEnd ()
  {
    if (head == null)
      {
	System.out.println ("no element to delete");
      }
    node temp = head;
    while (temp.next.next != null)
      {
	temp = temp.next;
      }
    temp.next = null;
  }
  void DeleteBegin ()
  {
    if (head == null)
      {
	System.out.println ("no element to delete");
      }
    node temp = head.next;
    head = temp;

  }
  void DeleteAtMid (int pos)
  {
      if (pos >= len)
      {
	System.out.println ("enter valid position");
      }
      else{
    if (head == null)
      {
	System.out.println ("no element to delete");
      }
    node temp = head;
    
    if (pos == 0)
      {
	head = head.next;

      }
    else
      {
	int a = 1;
	while (a != pos)
	  {
	    temp = temp.next;
	    a++;
	  }
	node te = temp.next;
	temp.next = te.next;
	//te=null;

      }
      }
  }
  void length ()
  {
    node temp = head;
    while (temp != null)
      {
	len++;
	temp = temp.next;
      }

  }
}
