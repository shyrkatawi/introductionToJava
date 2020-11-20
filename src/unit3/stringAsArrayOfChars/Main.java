package unit3.stringAsArrayOfChars;

import unit3.MethodsUnit3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "da";
        System.out.println(Arrays.toString(MethodsUnit3.toCharArray(s)));
        char[] chars = MethodsUnit3.toCharArray(s);
        for (char c : chars) {
            System.out.println(c);
            System.out.println(MethodsUnit3.toUpperCase(c));
        }
        System.out.println(MethodsUnit3.toLowerCase('C'));
    }

//    unit1.br T4, T5
}
