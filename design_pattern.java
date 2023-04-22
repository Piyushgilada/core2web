//public class design_pattern {
//    public static void main (String []args){
//        int n=3;
//        for (int i =1;i<=3;i++)
//        {
//            for (int j=1;j<=3;j++) {
//                if (i==2 && j==2) {
//                    System.out.print("  ");
//                    j++;
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
// output is :-
//        * * *
//        *   *
//        * * *

//public class design_pattern {
//    public static void main(String[] args) {
//        int n = 3;
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (i>j){
//                    System.out.print("  ");
//                    continue;
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//output is:-
//        * * *
//        * *
//        *


//public class design_pattern {
//   public static void main(String[] args) {
//       for (int i=1;i<=4;i++){
//           for (int j=1;j<=4;j++)
//           {
//               if (i==1) {
//                   System.out.print(j+" ");
//               }
//               if (i==2) {
//                   System.out.print(j+1+" ");
//               }
//              if (i==3) {
//                   System.out.print(j+2+" ");
//               }
//               if (i==4) {
//                   System.out.print(j+3+" ");
//               }
//           }
//           System.out.println();
//       }
//   }
//   }
//   output is:-
//
//           1 2 3 4
//           2 3 4 5
//           3 4 5 6
//           4 5 6 7
