import java.io.*;
public class practive4{
    public static void main (String [] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("no of rows");
        int row = Integer.parseInt(br.readLine());
        System.out.println("enter digit");
        int digit = Integer.parseInt(br.readLine());
        System.out.println("enter char");
        char ch = (char)isr.read();
        for (int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1) {
                    System.out.print(ch+" ");
                    ch--;
                    digit--;
                }
                else{
                    System.out.print(digit+" ");
                    ch--;
                    digit--;
                }
            }
            System.out.println();
        }
    }
}
