package org.example;

import java.util.Scanner;

public class StringReverse {
    public String reverseLatter(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            boolean flagLeft = false;
            boolean flagRight = false;
            if (Character.isLetter(chars[left])) {
                flagLeft = true;
            } else {
                left++;
            }
            if (Character.isLetter(chars[right])) {
                flagRight = true;
            } else {
                right--;
            }

            if (flagLeft && flagRight) {
                swap(chars, left, right);
                left++;
                right--;
            }

        }
        return new String(chars);
    }

    public void swap(char[] chars, int left, int right) {
        char tmp = chars[left];
        chars[left] = chars[right];
        chars[right] = tmp;
    }


}
