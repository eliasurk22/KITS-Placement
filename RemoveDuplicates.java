public class RemoveDuplicates{
    public static String removeDuplicates(String str){
        boolean[] seen = new boolean[256];
        String result = "";
        for(int i = 0; i< str.length();i++){
            char ch = str.charAt(i);
            if(!seen[ch]){
                seen[ch] = true;
                result += ch;
            }
        }
        return result;
    }
}