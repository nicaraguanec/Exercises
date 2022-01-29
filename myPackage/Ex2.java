package myPackage;

import java.util.Stack;

public class Ex2 {
    public static boolean isPalindrome(String inputStr) {

        if (inputStr.isEmpty())
            return false;
        if (inputStr.length() == 1)
            return true;

        int count = 0;

        if (inputStr.length() % 2 != 0)
            count = (inputStr.length() / 2) + 1;
        else
            count = inputStr.length() / 2;

        for (int x = 0; x < count; x++) {
            if (inputStr.charAt(x) != inputStr.charAt(inputStr.length() - 1 - x))
                return false;
        }

        return true;
    }


}


