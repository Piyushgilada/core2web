//fibonacci series from 1 to 100
public class fibonacci_series {
    public static void main(String[] args) {
        int n1= 0;
        int n2=1,n3;
        int count=100;
        System.out.print(n1+" "+n2);

        for (int i = 2;i<=count;i++) {
            n3=n1+n2;
            if(n3<=100) {
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }
}