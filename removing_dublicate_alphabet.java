// code to remove adjacent same alphabet with same charactor

// This code is written by me but, in this code if the last alphabets are same then I am unable 
// usnable to change the alphabets

public class removing_dublicate_alphabet {

    public static void main(String[] args) {
        String S[] = { "a", "a", "b", "c", "d", "d" };

        int i = 1;

        while ((i < S.length) & (i != S.length - 1)) {
            if (S[i] == S[i - 1]) {
                int x = i;

                while (x < S.length - 2) {
                    if (S[x] == S[x + 1]) {
                        x++;
                    } else {
                        break;
                    }
                }

                String temp = S[i];
                S[i] = S[x + 1];
                S[x + 1] = temp;
            }
            i++;
        }

        for (int a = 0; a < S.length; a++) {
            System.out.println(S[a]);
        }
    }

}
