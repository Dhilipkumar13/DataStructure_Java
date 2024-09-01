import java.util.*;

public class Main {
    public static void main(String[] args) {
        Practice o = new Practice();
        o.increase(1);
        o.increase(2);
        o.increase(3);
        o.increase(4);
        o.increase(5);
      //  o.tell();
        o.person1=find(o.person1, o.p2);
    o.tell();
    }

    static inner find(inner a, inner b) {
        inner prev = null;
        inner current = a;
        inner nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
       a=prev;
             return prev;
        // a = prev;
        // System.out.println(" ");
        // while(prev!=null)
        // {
        //   System.out.print(prev.value+"  ");
        //   prev=prev.next;
        // }
    }
}
class inner {
    int value;
    inner next;

    inner(int l) {
        value = l;
    }
}
class Practice {
    inner person1, p2;
    void increase(int baby) {
        inner name = new inner(baby);
        if (person1 == null)
            person1 = p2 = name;
        else {
            p2.next = name;
            p2 = name;
        }
    }

    void tell() {
        inner temp = person1;
        while (temp != null) {
            System.out.print(temp.value + "   ");
            p2=temp;
            temp = temp.next;
        }
        
    }
}
