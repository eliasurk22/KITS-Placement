import java.util.*;

public class passcheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int u = 0, l = 0, n = 0, sym = 0;

        if (a.length() >= 8) {
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                    u = 1;
                else if (ch >= 'a' && ch <= 'z')
                    l = 1;
                else if (ch >= '0' && ch <= '9')
                    n = 1;
                else
                    sym = 1;
            }

            if (u + l + n + sym == 4)
                System.out.println("Strong Password");
            else
                System.out.println("Weak Password");
        } else {
            System.out.println("Password too short");
        }
    }
}

