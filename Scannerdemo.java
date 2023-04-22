import java.util.Scanner;

public class Scannerdemo {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("enter the company");
        String str = sc.next();

        System.out.println("enter your pakage");
        double pkg=sc.nextDouble();
        System.out.println(str);
        System.out.println(pkg);
}
}
