import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringcount {
    public static void main(String[] args) {
        String str="1abc23";
        System.out.println(sum(str));
    }

    static int sum(String str){
        int k=0;
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher(str);

        while (m.find()) {
            String matchednumber=m.group();
            int number=Integer.parseInt(matchednumber);
            k+=number;
        }
        return k;
    }
}
