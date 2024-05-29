import java.util.Scanner;

public class studentmarks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int choice;
        do{
            System.out.println("Menu:");
            System.out.println("Enter student marks");
            System.out.println("Enter your choice");
            choice=scanner.nextInt();

            switch (choice) {
                case 1:
                    enterstudentmarks(scanner);   
                    break;
                case 0:
                    System.out.println("exiting");
                    break;
                default:
                    System.out.println("invalid choice please enter 0 or 1");
            }
        }while(choice!=0);
    }

    public static void enterstudentmarks(Scanner scanner){
        System.out.println("Enter student marks(out of 100): ");
        int marks=scanner.nextInt();

        if (marks>=90) {
            System.out.println("good");
        }
        else if (marks>=60) {
            System.out.println("average");
        }
        else if (marks>=0) {
            System.out.println("better");
        }
        else{
            System.out.println("marks entered is invalid");
        }
    }
}
