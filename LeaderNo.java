import java.util.Scanner;
public class LeaderNo
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    
	    int m[] = new int[n];
	    
	    int j = 0;
	    for(int i = 0 ; i < n ; i++){
	        a[i] = sc.nextInt();
	    }
	    
	    m[j] = a[n -1];
	    
	    for (int i = n - 1 ; i >= 0 ; i--){
	        if(m[j] < a[i]){
	            j++;
	            m[j] = a[i];
	        }
	    }
	    
	    for (int  i = 0 ; i<m.length ; i++){
	        if(m[i]!=0 )
	        System.out.print(m[i] + " ");
	    }
	    
	    
	    
		
	}
}
