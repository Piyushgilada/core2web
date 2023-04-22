import javax.swing.plaf.IconUIResource;
import java.io.*;
public class practice3{
    public static void main (String [] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("where to start");
        int start=Integer.parseInt(br.readLine());
        System.out.println("where to end");
        int end=Integer.parseInt(br.readLine());
        for (int i=start;i<=end;i++){
            int count=0;
            for (int j=1;j<=i;j++){

                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }

        }

    }

}