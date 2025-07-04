
import java.util.*;
public class LargestSubarray
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int []a = new int[size];
	int i,j,max = 0,sum=0;
	for(i=0;i<size;i++)
	{
	   a[i] = sc.nextInt();   
	}
	
	max = 0 ;
for(i=0;i<size;i++)
{
    for(j=i;j<size;j++)
    {
        sum = sum + a[j];
        if(max < sum)
        {
            max = sum;
        }
    }
    sum = 0;
}

System.out.println(max);
	
	
	}
}

