import java.io.*;
public class practice2 {
    public static void main(String []args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of rows");
        int row=Integer.parseInt(br.readLine());
        for(int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                if (i%4==1){
                    System.out.print("$ ");
                }
                if (i%4==2){
                    System.out.print("@ ");
                }
                if (i%4==3){
                    System.out.print("& ");
                }
                if (i%4==0){
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

}
