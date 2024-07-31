public class nthnumber {
    public static String findnumber(int n){
        String binaryRep=Integer.toBinaryString(n-1);

        StringBuilder number=new StringBuilder();
        for (char digit : binaryRep.toCharArray()) {
            if (digit=='0') {
                number.append('3');
            }
            else{
                number.append('4');
            }
        }
        return number.toString();
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(findnumber(n));
    }
}
