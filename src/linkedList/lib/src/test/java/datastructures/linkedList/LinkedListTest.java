/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package datastructures.linkedList;

import dataStructures.linkedList.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void checkedEmptyLinkedList() {
        LinkedList linkedList = new LinkedList();

        assertNull(linkedList.getHead());
    }

    @Test
    void checkInsertFunctionality() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(7);

        assertNotNull(linkedList.getHead());
    }

    @Test
    void checkIncludeElements() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(6);
        boolean expectedVlue = linkedList.include(3);
        assertTrue(expectedVlue);
    }

    @Test
    void checkReturnCollection() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(7);
        linkedList.insert(5);
        linkedList.insert(7);
        linkedList.insert(3);
        String expected = "{ 3 } -> { 7 } -> { 5 } -> { 7 } -> NULL";
        String actual = linkedList.toString();
        assertEquals(expected, actual);
    }

    @Test
    void checkInsertTail() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(4);
        linkedList.insert(6);
        linkedList.insert(9);
        linkedList.insert(1);
        linkedList.insert(3);
        linkedList.append(10);
        String expected = "{ 3 } -> { 1 } -> { 9 } -> { 6 } -> { 4 } -> { 10 } -> NULL";
        String actual = linkedList.toString();
        assertEquals(expected, actual);
    }

    @Test
    void checkInsertBeforeMiddle() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(4);
        linkedList.append(6);
        linkedList.append(3);
        linkedList.append(9);
        linkedList.append(5);
        linkedList.insertBefore(3, 10);
        String expected = "{ 4 } -> { 6 } -> { 10 } -> { 3 } -> { 9 } -> { 5 } -> NULL";
        String actual = linkedList.toString();
        assertEquals(expected, actual);
    }

    @Test
    void checkInsertBeforeFirst() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(4);
        linkedList.append(6);
        linkedList.append(3);
        linkedList.append(9);
        linkedList.append(5);
        linkedList.insertBefore(4, 1);
        String expected = "{ 1 } -> { 4 } -> { 6 } -> { 3 } -> { 9 } -> { 5 } -> NULL";
        String actual = linkedList.toString();
        assertEquals(expected, actual);

    }

    @Test
    void checkInsertAfterLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(4);
        linkedList.append(6);
        linkedList.append(3);
        linkedList.append(9);
        linkedList.append(5);
        linkedList.insertAfter(5, 8);
        String expected = "{ 4 } -> { 6 } -> { 3 } -> { 9 } -> { 5 } -> { 8 } -> NULL";
        String actual = linkedList.toString();
        assertEquals(expected, actual);
    }

    @Test
    void check_k_greater_than_size() {
        String actual = null;
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(3);
            linkedList.append(4);
            linkedList.append(5);
            linkedList.kth_from_end(6);
            String expect = "not allowed (k > size)";
            assertEquals(expect, actual);
        } catch (Exception c) {
            actual = c.getMessage();
        }
    }

    @Test
    void check_k_and_size_theSame() {
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(3);
            linkedList.append(4);
            linkedList.append(5);
            String actual = linkedList.kth_from_end(5);
            String expect = "the value is :" + 1;
            assertEquals(expect, actual);
        } catch (Exception c) {
            System.out.println(c.getMessage());
            ;
        }
    }

    @Test
    void check_k_negative_number() {
        String actual = null;
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(3);
            linkedList.append(4);
            linkedList.append(5);
            linkedList.kth_from_end(-4);
            String expect = "k cannot be negative number";
            assertEquals(expect, actual);
        } catch (Exception c) {
            actual = c.getMessage();
        }
    }

    @Test
    void check_happy_path(){
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(3);
            linkedList.append(4);
            linkedList.append(5);
            String actual = linkedList.kth_from_end(2);
            String expect = "the value is :" + 3;
            assertEquals(expect, actual);
        } catch (Exception c) {
            System.out.println(c.getMessage());
            ;
        }
    }

    @Test void testMergeMethod(){
        try {
            LinkedList linkedList = new LinkedList();
            LinkedList list1 = new LinkedList();
            list1.append(1);
            list1.append(3);
            list1.append(2);

            LinkedList list2 = new LinkedList();
            list2.append(5);
            list2.append(9);
            list2.append(4);

            String expected = "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> { 4 } -> NULL";
            assertEquals(expected , linkedList.zipLists(list1 , list2).toString());
        }
        catch (Exception c){
            System.out.println(c.getMessage());
        }
    }

    @Test void test_Merge_On_Different_List_Length(){
        LinkedList linkedList = new LinkedList();
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(2);

        LinkedList list2 = new LinkedList();
        list2.append(5);
        list2.append(9);
        list2.append(4);
        list2.append(8);
        list2.append(6);

        String expected = "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> { 4 } -> { 8 } -> { 6 } -> NULL";
          assertEquals(expected , linkedList.zipLists(list1 , list2).toString());
    }
}
