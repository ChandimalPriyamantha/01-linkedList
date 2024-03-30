package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

         myLinkedList.append(3);
         myLinkedList.append(5);
         myLinkedList.append(6);

        //System.out.println(myLinkedList.removeLast().value);

        //myLinkedList.prepend(1);
        //myLinkedList.insert(1,7);

        //myLinkedList.remove(1);

       //myLinkedList.removeFirst();

        myLinkedList.reverse();

        myLinkedList.printList();

        //System.out.println(myLinkedList.get(0).value);


    }
}
