import java .util.*;

public class Experiment8 {

	public static void main(String[] args) {	  
  Scanner obj = new Scanner(System.in);

	    System.out.println("Enter the Number:");

	    int n = obj.nextInt(); 

	    int a[ ][ ] = new int[n][n];

	    System.out.println("Enter the Elements:"); 

	    int i,j;

	   for( i=0;i<n;i++)

	   {

	       for(j=0;j<n;j++)

	    {

	    	a[i][j]= obj.nextInt();

	    }

	   }

	   int b[ ][ ] = new int[n][n];

	   System.out.println("Enter the Elements:"); 

	   for( i=0;i<n;i++)

	   {

	       for(j=0;j<n;j++)

	    {

	    	b[i][j]= obj.nextInt();

	    }

	   }   

	    System.out.println("The Multiplicational matrix is : ");

	     int c[ ][ ] = new int[n][n];

	    for( i=0;i<n;i++)

	   {

	       for(j=0;j<n;j++)

	    {

	    	  c[i][j]=a[i][j]*b[i][j];

	    	 System.out.print(c[i][j]);

	    	  System.out.print("  ");	 

	    }

	     System.out.print("\n");

	   }

	 	

	}

}
