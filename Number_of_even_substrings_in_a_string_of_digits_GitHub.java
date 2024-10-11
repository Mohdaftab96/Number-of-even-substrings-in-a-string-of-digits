


import java.util.HashSet;

public class Number_of_even_substrings_in_a_string_of_digits_GitHub{

    static int evenSubstringAtLastIndex(String str,int n){

        String sum = "";
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                sum = str.substring(i, j); // 1, 12, 123, 1234, 2, 23, 234, 3, 34, 4
                int n1 = sum.length();

                if(sum.charAt(n1-1)%2 == 0){
                    count = count + 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "1234";
        int n = str.length();

//        evenSubstringAtLastIndex(str, n);

        System.out.println("Number of even substrings in a string of digits is : " + evenSubstringAtLastIndex(str, n));
//
    }
}
