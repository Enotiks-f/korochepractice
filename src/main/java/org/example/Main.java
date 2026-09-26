package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right) {

            boolean flagLeft = false;
            boolean flagRight = false;
            if (Character.isLetter(chars[left])) {
                flagLeft = true;
            }else {
                left++;
            }
            if (Character.isLetter(chars[right])) {
                flagRight = true;
            }else {
                right--;
            }

            if (flagLeft && flagRight) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        System.out.println(new String(chars));
    }
}

