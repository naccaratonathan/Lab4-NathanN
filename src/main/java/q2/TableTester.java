package q2;

import test.TestHelper;

import java.util.Arrays;

public class TableTester {


    public static void main(String[] args) {

        test_Table_initializesCorrectly();
        test_Table_canHandleFewerNumbersThanNumberOfSpaces();
        test_Table_canHandleMoreNumbersThanNumberOfSpaces();

        test_getRows();
        test_getCols();

        test_set();
        test_get();

        test_equalityWith2dArray();
        test_inequalityWith2dArray();

        test_equalityWithAnotherTable();
        test_inequalityWithAnotherTable();

        test_as2dList();

        test_toString();
    }


    private static void test_Table_initializesCorrectly() {
        /*
        TODO: write a test that verifies that a typical call of the Table constructor initializes the table
                with the correct size AND data
            You may use the provided equals(int[][]) method to check whether the Table is equivalent to a given
            2d array, as in t.equals(a2dArrayOfInts)

            (NOTE: You may also use the equals(int[][]) method in the other tests in this file as appropriate.)
         */
        Table table1 = new Table(2,3, new int[]{0, 1,3,4,5,6});
        System.out.println(Arrays.deepToString(table1.getData()));
    }

    private static void test_Table_canHandleFewerNumbersThanNumberOfSpaces() {
        /* TODO: write a test that verifies that if the Table constructor is given an array with less numbers
            than the table has space for then the unfilled spaces are initialized to 0
         */
        Table table1 = new Table(2,3, new int[]{0, 1,3,4});
        System.out.println(Arrays.deepToString(table1.getData()));
    }

    private static void test_Table_canHandleMoreNumbersThanNumberOfSpaces() {
        /* TODO: write a test that verifies that if the Table constructor is given an array with more numbers
            than the table has space for then the extra numbers are ignored
         */
    }

    private static void test_getRows() {
        // TODO: write a test that verifies that the getRows method returns the expected value
    }

    private static void test_getCols() {
        // TODO: write a test that verifies that the getCols method returns the expected value
    }


    private static void test_set() {
        // TODO: write a test that verifies that the set method sets the correct value in the Table
    }

    private static void test_get() {
        // TODO: write a test that verifies that the get method returns the expected value
    }

    public static void test_toString() {
        // TODO: write a test that verifies that toString method returns the expected string
    }


    public static void test_equalityWithAnotherTable() {
        /* TODO: write a test that verifies that two different tables with the SAME set of values
            are evaluated as equal by the equals method
         */
    }

    public static void test_inequalityWithAnotherTable() {
        /* TODO: write a test that verifies that two different tables with a DIFFERENT set of values
            are evaluated as NOT equal by the equals method
         */
    }

    public static void test_equalityWith2dArray() {
        Table t1 = new Table(2, 3, new int[] {1, 2, 3, 4, 5, 6});
        int[][] arr = new int[][] {{1, 2, 3}, {4, 5, 6}};

        if ( ! t1.equals(arr) ) {
            TestHelper.failMessage("equals(int[][]) fails to equate a 2d array with an equivalent Table");
        } else {
            TestHelper.passMessage("equals(int[][]) detects equality");
        }
    }

    public static void test_inequalityWith2dArray() {
        Table t1 = new Table(2, 3, new int[] {1, 2, 3, 4, 5, 6});
        int[][] arr = new int[][] {{2, 2, 3}, {4, 5, 6}};

        if ( t1.equals(arr) ) {
            TestHelper.failMessage("equals(int[][]) reports equality with a 2d array when it should NOT");
        } else {
            TestHelper.passMessage("equals(int[][]) detects inequality");
        }
    }

    public static void test_as2dList() {
        /* TODO: write a test that verifies that the as2dList method returns an ArrayList of ArrayLists of Integers
            (i.e. a 2d ArrayList) that contains the same data as the original Table object.

            HINT: You may use a nested loop to compare each value in the returned ArrayList with each value in the Table
         */
    }


}