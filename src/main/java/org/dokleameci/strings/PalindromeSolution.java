package org.dokleameci.strings;

public class PalindromeSolution {
    // O(n) time, O(1) space
    public Boolean isPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            char leftCharacter = input.charAt(left);
            char rightCharacter = input.charAt(right);

            if (leftCharacter != rightCharacter) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
