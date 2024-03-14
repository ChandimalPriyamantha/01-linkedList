package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

         myLinkedList.append(3);

        //System.out.println(myLinkedList.removeLast().value);

        myLinkedList.prepend(1);

         myLinkedList.printList();


    }
}
