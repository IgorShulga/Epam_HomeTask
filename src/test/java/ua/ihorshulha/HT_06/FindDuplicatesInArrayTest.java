package ua.ihorshulha.HT_06;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDuplicatesInArrayTest {

    private final Integer[] array1 = new Integer[]{1, 2, 1, 3, 4, 5};
    private final Integer[] array2 = new Integer[]{1, 2, 3, 4, 5};
    private final Integer[] array3 = new Integer[]{1, null, 3, null, 5};
    private final Integer[] arrayEmpty = new Integer[]{};

    private final FindDuplicatesInArray findDuplicates = new FindDuplicatesInArray();

    @Test
    public void testArrayHasDuplicates() {
        assertTrue(findDuplicates.hasDuplicates(array1));
    }

    @Test
    public void testArrayHasNotDuplicates() {
        assertFalse(findDuplicates.hasDuplicates(array2));
    }

    @Test
    public void testArrayWithNull() {
        assertTrue(findDuplicates.hasDuplicates(array3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayEmpty() {
        findDuplicates.hasDuplicates(arrayEmpty);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayNull() {
        findDuplicates.hasDuplicates(null);
    }
}