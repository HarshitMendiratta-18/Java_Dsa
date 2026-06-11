public class Loops {
    static void main() {
        //for loop
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        //even no 2-10
        for(int i2=2;i2<=10;i2+=2){
            System.out.println("Even numbers are: ");
            System.out.println(i2);
        }

        String msg="Hello";
        for(int i3=1;i3<=3;i3++){
            System.out.println(msg);
        }

        for(int i4=1;i4<=10;i4+=2){
            System.out.println(i4);
        }

        //nested for loop:
        for(int i5=1;i5<=3;i5++){
            for(int j1=1;j1<=3;j1++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i6=1;i6<=3;i6++){
            for(int j3=1;j3<=3;j3++){
                System.out.println("i = "+ i6 + ",j = "+ j3);
            }
        }
     //break:
        for(int i9=1;i9<=10;i9++){
            if(i9==5){
                break;
            }
            System.out.println(i9);
        }

        //continue:
        for(int i8=1;i8<=10;i8++){
            if(i8==5){
                continue;
            }
            System.out.println(i8);
        }

        //while loop:
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        int moduleLeft=5;
        while(moduleLeft>=1){
            System.out.println("ModuleLeft is "+ moduleLeft);
            moduleLeft--;
        }

        //nested while loop:
        int i1=1;
        while(i1<=2){
            int j=1;
            while(j<=3){
                System.out.println("i ="+i1+"j="+j);
                j++;
            }
            i++;
        }

        //do-while loop:
//        int i11=1;
//        do{
//            System.out.println(i11);
//            i11++;
//        } while(i11<=5);

    }
}
