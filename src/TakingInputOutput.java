import java.util.Scanner;

public class TakingInputOutput {
    static void main() {
        //Taking input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for the firstNum: ");
        int firstNum=sc.nextInt();
        System.out.println("Enter the value for secondNum: ");
        int secondNum=sc.nextInt();
        int ans=firstNum+secondNum;
        System.out.println("The answer is: "+ ans);

        System.out.println("Enter firstName: ");
        String firstName= sc.next();
        System.out.println("Enter LastName: ");
        String LastName= sc.next();
        String fullName=firstName+ " "+ LastName;
        System.out.println("Your Name is : "+ fullName);

        boolean flag=sc.nextBoolean();
        System.out.println("Enter flag value: "+flag);
        sc.close();
    }
}
