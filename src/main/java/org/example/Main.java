package org.example;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        StringReverse sr = new StringReverse();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = sr.reverseLatter(null);
        System.out.print(result);
    }
}

