import java.util.Scanner;

public class arrays {
    public static void main(String[] args){

        //declaring and assigning array
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers[3]);

        //declaring an empty arrya of size 5
        int[] arr = new int[5];

        for(int i =0; i< arr.length; i++){
            arr[i] = i;
        }
        
        
        // to print all the value of an integer
        for(int i: arr){
            System.out.println(i);
        }


        //taking input form user and making an array
        Scanner sc = new Scanner(System.in);
        int[] newArray = new int[5];

        for(int i=0; i< newArray.length; i++){
            System.out.println(String.format("next value for index %d",i));
            newArray[i] = sc.nextInt();
        }

        for(int i:newArray){
            System.out.println(i);
        }

    }
}
