import java.util.*;

public class reversell {

    static Node head= null;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =  data;
            this.next = null;
        }
    }

    public static void add(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        Node current = head;
        while(current.next!=null){
            current= current.next;
        }

        current.next = newnode;
    }

    public static void reverselist(){
        Node current = head;
        Node previous = null;

        while(current.next!=null){
            Node next = current.next;
            current.next= previous;
            previous= current;
            current = next;
        }

        current.next = previous;
        head= current;
    }

    public static void printll(){
        if(head==null){
            System.out.println("the list is empty!");
            return;
        }

        Node current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args){
        reversell list = new reversell();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printll();

        list.reverselist();

        list.printll();
    }
    
}
