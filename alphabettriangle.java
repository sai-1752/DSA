import java.util.Scanner;

public class alphabettriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numrows=scanner.nextInt();

        char startchar='a';
        for (int i = 1; i <=numrows; i++) {
            char currentchar=startchar;

            for (int j = 1; j <=i; j++) {
                System.out.print(currentchar);
                currentchar++;
            }
            currentchar--;
            for (int j = 1; j > 0; j--) {
                currentchar--;
                System.out.print(currentchar);
            }
            System.out.println();
            startchar++;
        }
        scanner.close();;
    }
}
