public class backtracking {
    public static void print(String str,String permutation,int index){
        if (str.length()==0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            print(newstr, permutation+curr, index+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        print(str, "", 0);
    }
}
