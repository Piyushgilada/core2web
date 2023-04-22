import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class practice {
    public static void main(String [] args) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter no of rows:>>");
        int row =Integer.parseInt(br.readLine());
        for(int i=1;i<=row;i++){
            int N=1;
            char ch='A';
            char ch1 ='D';
            int N1=4;
            for (int j=1;j<=row;j++){
                if(i%2==0){
                    System.out.print(ch+""+N+" ");
                    ch++;
                    N++;
                }
                else {

                    System.out.print(ch1+""+N1+" ");
                    ch1--;
                    N1--;
                }
            }
            System.out.println();
        }
    }
}

