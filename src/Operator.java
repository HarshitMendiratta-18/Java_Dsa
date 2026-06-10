public class Operator {
   public static void main() {
       int solvedWeek1=30;
       int solvedWeek2=50;
       int totalSolved=solvedWeek1+solvedWeek2;
       System.out.println(totalSolved);

       // arithmetic operator:
       int solvedThisWeek=25;
       int solvedLastWeek=15;
       int total=solvedThisWeek+solvedLastWeek;
       int difference=solvedThisWeek-solvedLastWeek;
       int product=solvedThisWeek*4;
       int division=solvedThisWeek/7;
       int modulus=solvedThisWeek%7;
       System.out.println("Arithmetic Operators:");
       System.out.println(total);
       System.out.println(difference);
       System.out.println(product);
       System.out.println(division);
       System.out.println(modulus);

       //Relational operator:
       int currentStreak=45;
       int targetStreak=50;
       System.out.println("Relational Operators:");
       System.out.println(currentStreak == targetStreak);
       System.out.println(currentStreak != targetStreak);
       System.out.println(currentStreak>targetStreak);
       System.out.println(currentStreak<targetStreak);
       System.out.println(currentStreak>=targetStreak);
       System.out.println(currentStreak<=targetStreak);

       //Logical Operators:
       boolean completedDsa=true;
       boolean completedCore=false;
       System.out.println("Logical opeartors:");
       System.out.println(completedDsa && completedCore);
       System.out.println(completedDsa || completedCore);
       System.out.println(!completedDsa);

       //Assignment operator:
       int rating=100;
       System.out.println("Assignment operator");
       rating+=20;
       System.out.println(rating);
       rating-=22;
       System.out.println(rating);
       rating*=8;
       System.out.println(rating);
       rating/=9;
       System.out.println(rating);
       rating%=4;
       System.out.println(rating);

       //unary operator:
       int activeUsers = 100;

       int prefix = ++activeUsers;
       int postfix = activeUsers++;
       System.out.println("Unary operator");
       System.out.println(prefix);
       System.out.println(postfix);
       System.out.println(activeUsers);

       //ternary operator:
       int solvedProblem=320;
       String level=(solvedProblem>300)?"ADVANCED":"INTERMEDIATE";
       System.out.println("Ternary operator");
       System.out.println(level);

       //Instance of operator:
       String track = "CodeHelp ONE";

       boolean result = track instanceof String;
       System.out.println("Instance of operator");
       System.out.println(result);

    }
}
