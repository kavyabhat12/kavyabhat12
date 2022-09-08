import java.util.LinkedList;
import java.util.List;


class LinkedListDemo {
    public static void main(String[] args) {
        
    
    LinkedList<Character> l1=new LinkedList<Character>();
    l1.add('B');
    l1.add('E');
    l1.add('F');
    System.out.println("Original Content:"+l1);

    l1.addLast('G');
    l1.addFirst('A');
    System.out.println("\nAfter call to addfirst()and addlast()");
    System.out.println("contenmts :"+l1);
    System.out.println("\nhere are first elemnt:"+l1.getFirst()+ " "+l1.getLast());

    List<Character> sub=l1.subList(2, 5);
    System.out.println("Content of sublistview:"+sub);
    LinkedList<Character> ll2=new LinkedList<Character>();
    l1.removeAll(ll2);
    System.out.println("\nAfter removing ll2 from l1");
    System.out.println("Contents:"+l1);


    System.out.println("\nAfter deleting first and last element");
    System.out.println("Contents:"+l1);

    l1.removeFirst();
    l1.removeLast();

    l1.set(0,Character.toLowerCase(l1.get(0)));

    System.out.println("\nAfter change :"+l1);

    l1.addLast('z');
    System.out.println("Contents :"+l1);
    l1.set(3, Character.toUpperCase(l1.get(3)));
    System.out.println("\n After change :"+l1);


    


    }
    
}
