import java.util.Scanner;

public class Conditionals {
    static void main() {

        //if statement
        int dailyPractice=12;
        if(dailyPractice>=10){
            System.out.println("Good Consistency!");
        }

        int age=19;
        if(age>=18){
            System.out.println("You are eligible to vote.");
        }

        //if-else
        int score=34;
        if(score>=40)
            System.out.println("Pass");
        else
            System.out.println("Fail");

       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }


        //if-else-if
        int marks=55;
        if(marks>=90 && marks<100)
            System.out.println("Grade O");
        else if(marks>=80 && marks<89)
            System.out.println("Grade A");
        else if(marks>=70 && marks<79)
            System.out.println("Grade B");
        else if(marks>=60 && marks<69)
            System.out.println("Grade C");
        else if(marks>=50 && marks<59)
            System.out.println("Grade D");
        else System.out.println("Fail");

        System.out.println("Enter the character: ");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O'||ch=='U'){
            System.out.println("It is vowel");
        }
        else{
            System.out.println("It is consonant");
        }

        //nested-if-else:
        int age1=12;
        char gender='M';
        if(gender=='M'){
            System.out.println("You are Male");
            if(age1>18)
                System.out.println("You are male and age>18");
            else
                System.out.println("You are male and age<=18");
        }
        else{
            System.out.println("You are not male");
            if(age1>18)
                System.out.println("You are male and age>18");
            else
                System.out.println("You are male and age<=18");
        }
        //ternary
        int streakDays=35;
        String status=(streakDays>=32)?"Consistent":"Irregular";
        System.out.println(status);

        //switch
        int day=3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }


        //q1
        System.out.println("Enter the age of person:");
        int age2=sc.nextInt();
        if(age2>=18)
            System.out.println("Person is eligible to vote");
        else
            System.out.println("Person is nt eligible for vote");

        //q2
        System.out.println("Enter marks of subject 1: ");
        int marks1=sc.nextInt();
        System.out.println("Enter marks of subject 2: ");
        int marks2=sc.nextInt();
        System.out.println("Enter marks of subject 3: ");
        int marks3=sc.nextInt();
        System.out.println("Enter marks of subject 4: ");
        int marks4=sc.nextInt();
        System.out.println("Enter marks of subject 5: ");
        int marks5=sc.nextInt();
        float avg=(marks1+marks2+marks3+marks4+marks5)/500.0f;
        float percentage=avg*100;
        System.out.println("The Overall percentage of student is: "+percentage);

        //q3
        System.out.println("Enter the lowercase character");
        char character=sc.next().charAt(0);
        if(character>='a' && character<='z'){
            char upper= (char) (character-32);
            System.out.println("Uppercase character is "+upper);
        }
        else{
            System.out.println("Please enter valid character");
        }

        //q4

        System.out.println("Enter the uppercase character");
        char character1=sc.next().charAt(0);
        if(character1>='A' && character1<='Z'){
            char lower= (char) (character1+32);
            System.out.println("Lowercase character is "+lower);
        }
        else{
            System.out.println("Please enter valid character");
        }

        //q5

        System.out.println("Enter marks of subject 1: ");
        int m1=sc.nextInt();
        System.out.println("Enter marks of subject 2: ");
        int m2=sc.nextInt();
        System.out.println("Enter marks of subject 3: ");
        int m3=sc.nextInt();
        System.out.println("Enter marks of subject 4: ");
        int m4=sc.nextInt();
        System.out.println("Enter marks of subject 5: ");
        int m5=sc.nextInt();

        int least=m1;
        if(m2<least){
            least=m2;
        }
        if(m3<least){
            least=m3;
        }
        if(m4<least){
            least=m4;
        }
        if(m5<least){
            least=m5;
        }
        int total=m1+m2+m3+m4+m5;
        int top4=total-least;
        float percen=(top4/400.0f)*100;
        System.out.println("Dropped least marks: "+least);
        System.out.println("Total marks of top4 is: "+top4);
        System.out.println("Overall percentage is:"+percen);


        //q6
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c=sc.nextInt();
        int D=((b*b)-4*a*c);
        if(D>0){
            System.out.println("Roots are real and different");
        }
        else if(D==0){
            System.out.println("Roots are zero");
        }
        else{
            System.out.println("Roots are complex");
        }

       //q7
       System.out.println("Enter the year:");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("Leap Year");
        }
        if(year%100==0){
        System.out.println("Leap Year");
        }
        if(year%400==0){
            System.out.println("Leap Year");
        }

   }
}
