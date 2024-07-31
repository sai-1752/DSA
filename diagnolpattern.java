public class diagnolpattern {
    public static void printdiagnol(String input){
        int length=input.length();
        int mid=length/2;

        for (int i = 0; i <=mid; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(input.charAt(i));
            if (i!=mid) {
                for (int j = 0; j < length-2*i-2; j++) {
                    System.out.print(" ");
                }
                System.out.print(input.charAt(length-1-i));
            }
            System.out.println();
        }

        for (int i = mid-1; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(input.charAt(i));

            for (int j = 0; j < length-2*i-2; j++) {
                System.out.println(" ");
            }
            System.out.print(input.charAt(length-1-i));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String input1="1234";
        String input2="geeksforgeeks";
        
        printdiagnol(input1);
        printdiagnol(input2);
        
    }
}
