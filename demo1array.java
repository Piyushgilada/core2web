import java.util.Scanner;
//sum of even and odd numbers from array
public class demo1array {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of element in array");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("insert elements:-");
        for (int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
              sum=sum+array[i];
            }
        }
        System.out.println("sum is "+sum);
    }
}
