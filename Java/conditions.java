public class conditions {
    public static void main(String[] args){

        System.out.println("print for loop");

        for (int i =0; i<=5; i++){
            System.out.println(i);
        }

        System.out.println("printing while loop");
        int i =0;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        System.out.println("printing do-while loop");
        int j = 5;
        do{
            System.out.println(j);
            j++;
        }while(j<5);

        //loop breaking
        System.out.println("breaking the loop when k=4");
        for(int k =0; k<=7; k++){
            if(k == 4) break;
            System.out.println(k);
        }

        //skipping a condition
        System.out.println("skip when value = 4");
        for(int l=0; l<=5; l++){
            if(l == 4) continue;
            System.out.println(l);
        }


        // odd and even printing
        for(int m =0; m<=10; m++){
            if(m%2==0){
                System.err.println("even: " + m);
            }

            else{
                System.out.println("odd: "+ m);
            }
        }

        //simple calculater using Swithch case
        int x = 10;
        int y = 6;
        char calculater = '+';

        switch (calculater){
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            case '%':
                System.out.println(x%y);
                break;
            default:
                System.out.println("wrong value selected");

        }

    }
}
