package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.BinarySearch;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTests {

    private BinarySearch binarySearch;
    private int[] sample;

    @BeforeEach
    public void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void binarySearch_Found() {
        int expected = 3;
        int actual = binarySearch.binarySearch(new int[]{4, 5, 1, 4, 10, 3, -34, 7}, 4);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearch_NotFound() {
        int expected = -1;
        int actual = binarySearch.binarySearch(new int[]{-4, 5, 1, 4, 10, 3, -34, 7}, 40);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearch_EmptyArray() {
    	int expected = -1;
        int actualIndex = binarySearch.binarySearch(new int[] {}, 1);
        assertEquals(expected, actualIndex);
    }
    
    @Test
    public void binarySearch_ArrayWithLengthOne() {
    	int expected = 0;
        int actualIndex = binarySearch.binarySearch(new int[] {4}, 4);
        assertEquals(expected, actualIndex);
    }
    
    @Test
    public void binarySearch_ArrayWithEvenLengthTarget_Found() {
    	int expected = 0;
        int actualIndex = binarySearch.binarySearch(new int[] {-4, 2, 5, 1, 4, 10, 3, 7}, -4);
        assertEquals(expected, actualIndex);
    }
    
    
}