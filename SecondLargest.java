import java.util.*;
public class SecondLargest
{
   
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int []a = new int[n];
	    int i , f , s; 
	    for(i=0;i<n;i++)
	    {
	        a[i] =sc.nextInt();
	    }
	    f = a[0];
	    s = a[0];
	    for(i=1;i<n;i++)
	    {
	        if(f<a[i])
	        {
	            s = f ; 
	            f = a[i];
	        }
	        else if(s<a[i])
	        {
	            s = a[i];
	        }
	    }
	    
	    System.out.println(f + "  "+s);
	    
	}
}