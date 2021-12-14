/******************************************************************************
 *  Compilation:  javac Percolation.java
 *  Execution:    java Percolation
 *
 *
 *  % java Percolation
 ******************************************************************************/

public class Percolation {

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {

        // Check to see if int n is acceptable value  
        if (n <= 0) { 
            throw IllegalArgumentException;   
        }

        // Construct array of size n + 1
        int grid = new int[n * n]  

        // Initializes the array to be set at its own id 
         

    
    } 

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) { 
        if (row > n || row < 1 || col > n || col < 1) { 
            throw IllegalArgumentException;   
        }  
    } 

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (row > n || row < 1 || col > n || col < 1) { 
            throw IllegalArgumentException;   
        }  
    } 

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if (row > n || row < 1 || col > n || col < 1) { 
            throw IllegalArgumentException;   
        }  
 
    } 

    // returns the number of open sites
    public int numberOfOpenSites() { 
    } 

    // does the system percolate?
    public boolean percolates()

    // test client (optional)
    public static void main(String[] args)
}
