package q2;

public class Table {

    // TODO: Add instance variables here

    /**
     * Create a table with the given number of rows and columns, and fill it with the given numbers
     *
     * @param rows The number of rows in the table
     * @param cols The number of columns in the table
     * @param numbers A 1d array of integers with which to fill the table, starting at row 0 col 0 and proceeding across the
     * first row, then down to the next row, etc.  If there are less numbers than spaces available
     * in the table, the remaining spaces will have the value 0; if there are more numbers than spaces
     * available in the table, the extra numbers are not included in the table.
     */

    private int rows;
    private int cols;
    private int row;
    private int col;
    private int currentSize;
    private int[] numbers;
    public int[][] tableData;

    public Table(int rows, int cols, int[] numbers) {
        int x = 0;
        this.rows = rows;
        this.cols = cols;
        this.numbers = numbers;
        tableData = new int[this.rows][this.cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                tableData[i][j] = numbers[x];
                x++;
                if (x==numbers.length){
                    break;
                }
                currentSize++;
            }
            if (x==numbers.length){
                break;
            }
            if (currentSize > (rows*cols)){
                break;
            }
        }
        System.out.println();
    }



    /**
     * @return The number of rows in the table
     */

    public int getRows() {
        // TODO: implement this method
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return The number of columns in the table
     */
    public int getCols() {
        // TODO: implement this method
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    /**
     * @return A reference to the 2d array that represents the data in this table
     */
    //public int getTable() {
    // TODO: implement this method
    //     return Table;
    //  }


    /**
     * Set the value of the table at the given indexes to the given number
     *
     * @param row    The row index.  Precondition: 0 <= row < getRows()
     * @param col    The column index.  Precondition: 0 <= col < getCols()
     * @param number The integer to set at the given indexes
     */
    // TODO: Implement the 'set' method
    public void set(int row, int col, int number) {
        this.row = row;
        this.col = col;
        this.numbers = numbers;
        if (row >= 0 && row < getRows() && col >= 0 && col < cols) {
            tableData[row][col] = number;
        }
    }

    /**
     * Returns the value of the table at the given indexes
     *
     */
    // TODO: Implement the 'get' method
    public int[][] getData() {
        // TODO: implement this method
        return tableData;
    }


    /**
     * @return A String representing the table.  Each row is separated by the system line separator, and
     * each value in a row is separated by a space.
     */
    // TODO: Implement the 'toString' method
    //public String toString(){
    //return integer2DArray.toString();
    // }

    /**
     * @param other The table to compare this table with
     * @return True if the two tables have the same number of rows and columns, and contain the same values
     */
    // TODO: Implement the 'equals' method for comparing with other tables

    /**
     * @param other The 2D array to compare this table with
     * @return True if this table has the same number of rows and columns,
     *              and contains the same values as the given 2D array
     */
    /**

     public boolean equals(int[][] other) {
     // Prevent the out-of-bounds exception that can happen in the second conditional below
     // if the 2D array has no rows.
     if ( other.length == 0 && getRows() == 0 ) {
     return true;
     } else if ( other.length == 0 ) {
     return false;
     }

     if ( other.length != getRows() || other[0].length != getCols() ) {
     return false;
     }

     for ( int row = 0 ; row < getRows() ; row++ ) {
     for ( int col = 0 ; col < getCols() ; col++ ) {
     if ( other[row][col] != getData()[row][col]) {
     return false;
     }
     }
     }

     return true;
     }

     /**
     * @return A 2D ArrayList of Integers containing the same data as this table
     */
    // TODO: Implement the as2dList method
}