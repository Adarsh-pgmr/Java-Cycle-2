import java.util.*;

public class Experiment4{

	public static void main(String[] args) {	
  Scanner obj = new Scanner(System.in); 

	System.out.printf("Enter the number of element:\n ");

	        int n = obj.nextInt();

	        int a[] = new int[20];

	        System.out.printf("Enter the elements:\n ");

	        int i,temp;

	        for(i=1;i<=n;i++)

	        {

	          a[i]=obj.nextInt();

	        }

	        for(i=0;i<n;i++)

	        {

	            for(int j=0;j<n;j++)

	            {

	            	if(a[j]<a[j+1])

	            	{

	            	temp=a[j];

	            	a[j]=a[j+1];

	            	a[j+1]=temp;

	            	}

	            }

	        }

	        System.out.println("The second largest element is"+a[1]);

	        			

	        		

	}

}
