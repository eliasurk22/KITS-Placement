import java.util.*;
public class ParenthesisBalanceCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i,count = 0;
        for(i = 0;i < a.length() && count >=0; i++){
            if(a.charAt(i)=='(')
                count++;
            else if(a.charAt(i)==')')
                count--;
        }
        if(count == 0){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
    }
}