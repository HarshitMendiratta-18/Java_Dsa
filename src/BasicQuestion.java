import java.util.Scanner;

public class BasicQuestion {
    static void main() {
        //q1
        System.out.println("Hello, World!");

        //q2
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number=sc.nextInt();
        System.out.println("The Number entered by user is:" + number);

        //q3
        System.out.println("Enter the first integer: ");
        int integer1=sc.nextInt();
        System.out.println("Enter the second integer: ");
        int integer2=sc.nextInt();
        int sum=integer1+integer2;
        System.out.println("The Sum of two integers is : "+sum);

        //q4
        System.out.println("Enter the divisor: ");
        int divisor=sc.nextInt();
        System.out.println("Enter the dividend: ");
        int dividend=sc.nextInt();
        int quotient=divisor/dividend;
        System.out.println("The quotient is: "+quotient);
        int remainder=divisor%dividend;
        System.out.println("The remainder is: "+remainder);

        //q5
        System.out.println("int size :"+Integer.BYTES+"bytes");
        System.out.println("float size :"+Float.BYTES+"bytes");
        System.out.println("double size :"+Double.BYTES+"bytes");
        System.out.println("char size :"+Character.BYTES+"bytes");

        //q6
        int a=10;
        int b=20;
        int temp;
        temp=a; //temp ki value store ho gyi 10
        a=b;// a ki value b ke equal ho gyi jo 20 hai
        b=temp;// b ki value temp ke equal ho gyi jo hai 10
        System.out.println("After swap value of a and b is :"+a+","+b);

        //q7
        //ascii value find krne ke liye typecasting ka use krte hai
        char aplha='H';
        int asciiValue= (int)aplha;
        System.out.println("The ascii value of character is :"+asciiValue);

        //q8
        System.out.println("Enter number1: ");
        float num1=sc.nextFloat();
        System.out.println("Enter number2: ");
        float num2=sc.nextFloat();
        float product=num1*num2;
        System.out.println("The product if two numbers is :"+product);


    }
}
