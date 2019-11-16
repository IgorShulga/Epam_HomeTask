package ua.ihorshulha.HT_02;

import org.junit.Test;

import static org.junit.Assert.*;

public class testTask05 {
    private static final int[]ARRAY1 = {1,2,3,1};
    private static final int[]ARRAY2 = {1,2,3,4};
    private static final int[]ARRAY3 = {1,1,1,3,3,4,3,2,4,2};

    @Test
    public void testContainsDublicates(){
        assertTrue(Task05.findDublicates(ARRAY1));
        assertFalse(Task05.findDublicates(ARRAY2));
        assertTrue(Task05.findDublicates(ARRAY3));
    }

}