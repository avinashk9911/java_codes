public class methords {
    public static void main(String[] args){
        greet();
        System.out.println(additon(5, 6));
        System.out.println(compare(6,7));
    }

    public static void greet(){
        System.out.println("Hello Everyone");
    }

    public static int additon(int a, int b){
        return a+b;
    }

    // comparing two numbers
    public static int compare(int a, int b){
        int larger = (a>b?a:b);
        return larger;
    }
}
