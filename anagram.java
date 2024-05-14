import java.util.Arrays;

public class anagram {
    public static boolean anag(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()!=str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        String str1="eat";
        String str2="ate";

        System.out.println(anag(str1, str2));
    }
}
