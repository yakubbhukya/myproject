package Javademo;


	public class PrintTriangle {
	    public static void main(String[] args) {
	        int rows = 5; // Number of rows in the triangle
	        
	        // Outer loop for rows
	        for (int i = 1; i <= rows; i++) {
	            
	            // Inner loop for printing asterisks
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            
	            // Move to the next line after printing each row
	            System.out.println();
	        }
	    }
	}

	

