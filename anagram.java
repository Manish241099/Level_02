import java.util.Arrays;

import static java.util.Arrays.sort;

public class anagram {
    public static void main(String[] args) {
       String str1="cat";
        String str2="act";
        int l1=str1.length();
        int l2=str2.length();
        if (l1 != l2)
        {
            System.out.println("string is not anagram");

        }
        char a[]= str1.toCharArray();
        char b []= str1.toCharArray();
        sort(a);
        sort(b);
        if (Arrays.equals(a,b))
        {
            System.out.println("String is anagram");
        }
        else {
            System.out.println("string is not anagram");
        }


    }
}
