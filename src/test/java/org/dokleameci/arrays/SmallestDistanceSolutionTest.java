package org.dokleameci.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SmallestDistanceSolutionTest {
    private SmallestDistanceSolution underTest;

    @BeforeEach
    void setUp(){
        underTest = new SmallestDistanceSolution();
    }

    @Test
    void itShouldThrowException_WhenArraySizeZero(){
        // GIVEN
        int[] arrayOne = new int[]{34};
        int[] arrayTwo = new int[0];

        // WHEN
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            underTest.smallestDistancePair(arrayOne, arrayTwo);
        });

        // THEN
        String expectedMessage = "Arrays should have a minimum length of 1.";
        String actualMessage = exception.getMessage();

        assertThat(actualMessage).contains(expectedMessage);
    }

    @Test
    void itShouldReturnPairOfIndexes_WhenGivenInputArrays(){
        // GIVEN
        int[] arrayOne = new int[]{0, 21};
        int[] arrayTwo = new int[]{20, -2};

        // WHEN
        var actual = underTest.smallestDistancePair(arrayOne, arrayTwo);
        var expected = new int[]{21, 20};

        // THEN
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itShouldReturnPairOfIndexes_WhenGivenInputArrays_WithNotEqualSize(){
        // GIVEN
        int[] arrayOne = new int[]{0, 21, 4, 5, 2};
        int[] arrayTwo = new int[]{20, -2, 1};

        // WHEN
        var actual = underTest.smallestDistancePair(arrayOne, arrayTwo);
        var expected = new int[]{0, 1};

        // THEN
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itShouldReturnFirstPairOfIntegers_WhenGivenInputArrays_WithMoreThanOnePair(){
        // GIVEN
        int[] arrayOne = new int[]{4, 21, 0, 6, 2};
        int[] arrayTwo = new int[]{20, 5, 1};

        // WHEN
        var actual = underTest.smallestDistancePair(arrayOne, arrayTwo);
        var expected = new int[]{0, 1};

        // THEN
        assertThat(actual).isEqualTo(expected);
    }
}