// you have been given a linkedlist
// you need to find the n'th node form the last and delete that node

public class nth_node_from_lata {
    static Node head;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void add(int data){
        Node newnode = new Node(data);
        
        if(head== null){
            head= newnode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current= current.next;
        }

        current.next = newnode;
        return;
    }

    public static void printll(){
        if(head==null){
            System.out.println("the linkedlist is empty!");
            return;
        }

        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
        return;
    }

    public static void deletenth(int target){
        if(head==null){
            return;
        }
        //we find the size of the linkedlist
        Node current = head;
        int size = 0;
        while(current!=null){
            current= current.next;
            size++;
        }

        target = size -target-1;//if I just do size-target it is giveing me the exeject
        // location of target element, but we want to be located at one more index back
        // so that we can delete the target element
        int i=0;
        Node temp1 = head;
        while(i!=target){ //this while loop we take me to the one element previous to the target element
            temp1 =  temp1.next;
            i++;
        }

        System.out.println("the element that you want to delete is: "+temp1.next.data);

        temp1.next = temp1.next.next;
        System.out.println("the new linkedlist is: ");
        printll();

    }


    public static void main(String[] args){
        nth_node_from_lata list = new nth_node_from_lata();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printll();
        list.deletenth(2);


    }
}
