public class Patterns {
    static void main() {
        //pattern1:
//        int n=4;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=n;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //pattern2:
//
//        int n=3;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //pattern3:
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern4:
//        int n=5;
//        for(int i=1;i<=n;i++){
//
//            //some spaces
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            //stars
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern5:
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-(i-1);j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern6:
//        int n=5;
//       for(int i=1;i<=n;i++){
//
//            //some spaces
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            //stars
//            for(int j=1;j<=(2*i-1);j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern7:
//              int n=5;
//       for(int i=1;i<=n;i++){
//
//            //some spaces
//            for(int j=1;j<=(i-1);j++){
//                System.out.print(" ");
//            }
//            //stars
//            for(int j=1;j<=(2*(n-i)+1);j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern8:
        int n=5;
        for(int i=1;i<=n;i++){

            //some spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
