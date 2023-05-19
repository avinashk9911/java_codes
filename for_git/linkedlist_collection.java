import java.util.*;
	
public class linkedlist_collection{

	public static void main(String[] args){

		LinkedList< String> linkedlist = new LinkedList< String>();

		//adding at the end of a linked list
		linkedlist.add("a");
		linkedlist.add("b");
		linkedlist.add("c");
		linkedlist.add("with");
		linkedlist.add("within");
		System.out.println(linkedlist);

		//adding at the bigning of linked list
		linkedlist.addFirst("name");
		linkedlist.addFirst("is");
		linkedlist.addFirst("what");
		System.out.println(linkedlist);

		//removing element 
		System.out.println("now we have removed 'a' form the list by passing a in as the parameter");
		linkedlist.remove("a");
		System.out.println(linkedlist);
		System.out.println("now we are removeing an element which is on the '2' index");
		linkedlist.remove(2);
		System.out.println(linkedlist);

		//size of linkedlist
		System.out.println("the length of linkedlist is: "+ linkedlist.size());

		//sorting a linkedlist
		System.out.println("when we sort teh linked list: ");
		Collections.sort(linkedlist);
		System.out.println(linkedlist);
		
		//Iterating the linkedlist
		for(int i=0; i<linkedlilst.size(); i++){
			System.out.print(linkedlist.get(i)+" ");
		}
		
		for(String str: ll){
			System.out.println(str+" ");
		}

	}
}

//https://www.studytonight.com/java/linkedlist-in-collection-framework.php
//good resource for the above code
