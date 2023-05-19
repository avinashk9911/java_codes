public class linked_list {

    static node head;
    static int size;

    linked_list(){
        this.size = 0;
    }

    public static class node{
        String data;
        node next;

        node(String data){
            this.data= data;
            this.next= null;
        }

    }


    public static void addfirst(String data){
        
        node newnode = new node(data);

        if(head==null){
            head= newnode;
            size++; //NEVER FORGET THIS 
            return;
        }
        newnode.next= head;
        head= newnode;
        size++;
        return;

    }

    public static void addlast(String data){
        node newnode = new node(data);
        if(head==null){
            head=newnode;
            return;
        }

        node temp = head;
        while(temp.next != null){
            temp= temp.next;
        }

        temp.next=newnode;

        size++;

    }

    public static void deletenode(String target){

        if(head==null){
            System.out.println("the linkedlist is empty!");
            return;
        }
        
        //to delete head
        if(target==head.data){
            head= head.next;
            size--;
            return;
        }

        node current = head;
        while(current.next.data!=target){
            current = current.next;
        }

        //to delete the last node
        // if(current.next.next==null){
        //     current.next = null;
        //     return;
        // }

        
        // to delete any number in between
        current.next = current.next.next;
        size--;
        return;


    }

    public static void printll(){
        node temp = head;
        while(temp!=null){   //(temp.next!=null): if we do this then we will miss the last element of linked list
            System.out.println(temp.data);
            temp = temp.next;
        }
        
        return;
    }


    // function to print our size of linkedlist 
    public static void llsize(){
        System.out.print("the size of linkedlist: "+ size);
        return;
    }

    public static void main(String[] args) {
        linked_list list = new linked_list();
        list.addfirst("1");
        list.addfirst("2");
        list.addfirst("3");
        list.addlast("10");
        list.addlast("20");
        list.printll();
        list.deletenode("20");
        System.out.println("new linkedlist");
        list.printll();
        list.llsize();
        
    
    }
    
}
