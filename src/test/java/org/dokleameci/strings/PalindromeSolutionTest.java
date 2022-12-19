package org.dokleameci.strings;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Testing PalindromeSolution Class")
class PalindromeSolutionTest {

    private PalindromeSolution underTest;

    @BeforeEach
    void setUp(){
        underTest = new PalindromeSolution();
    }

    @Test
    void itShouldReturnTrueWhenIsPalindromeHasInputOfLengthOne() {
        String input = "b";

        boolean actual = underTest.isPalindrome(input);

        assertThat(actual).isTrue();
    }

    @Test
    void itShouldReturnFalseWhenIsPalindromeHasNoPalindromicInput() {
        String input = "abcbaa";

        boolean actual = underTest.isPalindrome(input);

        assertThat(actual).isFalse();
    }

    @Test
    void itShouldReturnFalseWhenIsPalindromeHasPalindromicInput() {
        String inputOne = "abcba";
        String inputTwo = "abba";


        boolean actualOne = underTest.isPalindrome(inputOne);
        boolean actualTwo = underTest.isPalindrome(inputTwo);

        assertThat(actualOne).isTrue();
        assertThat(actualTwo).isTrue();
    }

    @Test
    void itShouldReturnFalseWhenIsPalindromeHasNOPalindromicInput() {
        String input = "absadfsadsadasdascba";

        boolean actual = underTest.isPalindrome(input);

        assertThat(actual).isFalse();
    }
}