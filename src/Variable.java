public class Variable {
   public static void main() {
       //define or initialize
        int age=10;
       System.out.println(age);
       //Case sensitive
       int weight=80;
       int WEIGHT=90;
       System.out.println("weight:"+weight);
       System.out.println("Weight:"+WEIGHT);

       //Starting letter(name notation)
       int marks=10;
       int MARKS=11;
       int _marks=12;
       int $marks=14;
       //Subsequent letter
       int height5=10;
       int height_love=11;
       int height$love=12;
       int height_=22;
       int height$=23;


       //No reserved keywords
       //int class=11; (this is error as class is predefined keyword)i
       int main=9; // main is not reserved keyword in java

       //length
       int howIsYouAll=33;
       int a=44;
       int b=0;

       //Naming convention
       //CamelCase
       int myNameIsHarshit=13;
       //constants(uppercase)
       int DAYS_IN_YEAR=365;

       //practice q
       int contestRating=5;
       int totalProblemSolved=100;
       boolean subscriptionStatus=true;
       String name="harshit";
       System.out.println(contestRating);
       System.out.println(totalProblemSolved);
       System.out.println(subscriptionStatus);
       System.out.println(name);
    }
}
