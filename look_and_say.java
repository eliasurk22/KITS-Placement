import java.util.Arrays;
public class look_and_say{
    public static String[] look_and_say(String s, int len){
        String[] seq = new String[len];
        seq[0] = s;
        for(int i = 1; i < len; i++){
            String val = seq[i-1];
            StringBuilder nextval = new StringBuilder();
            for(int ix = 0;ix < val.length();i++){
                char ch = val.charAt(ix);
                int n;
                for(n = 1; ++ix < val.length() && val.charAt(ix) == ch; n++);
                nextval.append(n).append(ch);
            }
            seq[i] = nextval.toString();
        }
        return seq;
    }
    public static void main(String[] args){
        String[] seq = look_and_say("8",10);
        for(int i = 0; i < 10; i++)
        System.out.println(seq[i]);
    }
}