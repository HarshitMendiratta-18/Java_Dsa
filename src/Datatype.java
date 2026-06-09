public class Datatype {
   public static void main() {
       //Numeric DT-short,byte,long,int
       byte num1=100;
       //byte num1=500; (this will give error because value goes out of range of byte)
       System.out.println(num1);
       short num2=500;
       System.out.println(num2);
       int num3=777;
       System.out.println(num3);
       long num4=132435465;
       System.out.println(num4);

       //floating dt
       float num5=3.14f; // without f java treats float value as double
       System.out.println(num5);
       double num6=3.14;
       System.out.println(num6);

       //other-char,boolean
       boolean eligibleToVote=true;
       System.out.println(eligibleToVote);
       char gradeLevel = 'A';
       System.out.println(gradeLevel);
       //You can also assign using Unicode:
       char symbol = '\u2605';
       System.out.println(symbol);
       //Default value: '\u0000'


       //practice q:
       int noOfContest=20;
       float avgTime=4.5f;
       boolean isPremium=true;
       char grade='A';
       System.out.println(noOfContest);
       System.out.println(avgTime);
       System.out.println(isPremium);
       System.out.println(grade);

       char ascii='a'+1;
       System.out.println(ascii);

       //typecasting
       //explicit:
       long value1=123456789;
       int value2=(int)value1;//ye number int ki range me aata hai isliye no data loss vrna data loss hota hai.
       System.out.println(value2);

       //implicit:apne app ho jata hai conversion.
    }
}
