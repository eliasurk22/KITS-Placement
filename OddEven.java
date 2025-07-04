import java.util.*;  //  os 1s 
public class OddEven
{
	public static void main(String[] args) {
	    Scanner ob = new Scanner(System.in);
	    int i,j =0 , k =0, count=0;
	    int n = ob.nextInt();
	    int a[] = new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i] = ob.nextInt();
	        if(a[i]%2==0)
	           count++;
	    }
	  int even[] = new int[count];
	   int odd[] = new int[n-count];
	  
	   for(i=0;i<n;i++)
	    {
	       if(a[i]%2==0)
	       {
	           even[j] = a[i];
	           j++;
	       }
	       else{
	           odd[k] = a[i];
	           k++;
	       }
	    }
	  
	  
	  
	  
	  
	  for(i=0;i<j;i++)
	    {
	        System.out.print(even[i] +" ");
	    }
	     for(i=0;i<k;i++)
	    {
	        System.out.print(odd[i] +" ");
	    }
	  
	    
	}
}
