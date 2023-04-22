import java.util.Scanner;

public class Switch_case {
    public static void main (String []args){
//        int ch=65;
//        switch (ch){
//            case 65:
//                System.out.println("A");
//                break;
//            case 'B':
//                System.out.println("B");
//                break;
//            case 'C' :
//                System.out.println("C");
//                break;
//            default:
//                System.out.println("no match");
//                break;
//
//        }
//        System.out.println("after switch");
        Scanner str =new Scanner(System.in);
        System.out.println("enter day name?");
        String day= str.nextLine();
        switch (day){
            case "monday":
                System.out.println("mon");
                break;
            case "tuesday":
                System.out.println("tues");
                break;
            default:
                System.out.println("sun");
                break;
        }
    }
}