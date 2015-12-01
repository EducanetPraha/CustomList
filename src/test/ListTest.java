package test;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by semanticer on 1. 12. 2015.
 */
public class ListTest {

    List<Integer> empty = new Nil<>();
    List<Integer> testList = new Cons<>( 10, new Cons<>(5, new Cons<>(15, empty)));

    @org.junit.Test
    public void testSize() throws Exception {
        assertEquals(3, testList.size());
        assertEquals(0, empty.size());
    }

    @org.junit.Test
    public void testNth() throws Exception {
        assertEquals(10, (int) testList.nth(0));
        assertEquals(5, (int) testList.nth(1));
        assertEquals(15, (int) testList.nth(2));
    }


    @org.junit.Test(expected=IndexOutOfBoundsException.class)
    public void testNthException() throws Exception {
        testList.nth(3);
    }

    @org.junit.Test
    public void testAdd() throws Exception {
        List<Integer> testWithNew = testList.add(2);

        assertEquals(2, (int) testWithNew.nth(0));
        assertEquals(4, testWithNew.size());
    }

}