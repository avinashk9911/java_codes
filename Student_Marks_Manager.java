import java.util.Scanner;
public class Student_Marks_Manager {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for(int i = 0; i< marks.length; i++){
            System.out.println(String.format("give  the marks for student %d",i));
            marks[i] = sc.nextInt();
        }

        System.out.println("marks of all students" + marks);

        int totalmarks  = 0;
        for(int i : marks){
            totalmarks = totalmarks+i;
        }

        System.out.println("total marks = "+ marks);

        System.out.println("Average marks = "+ totalmarks/5);

        int higestmarks = 0;
        for(int i : marks){
            if(i>higestmarks){
                higestmarks = i;
            }
        }

        System.out.println("highest marks = "+ higestmarks);

        for(int i= 0; i < marks.length; i++){
            if(marks[i]<40){
                System.out.println(String.format("the student at index %d is Fail as the student have just got %d marks", i, marks[i]));
            }
        }

    }
}
