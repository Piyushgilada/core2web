import java.io.*;
public class practice1 {
    public static void main (String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter where to start >>");
        int start=Integer.parseInt(br.readLine());
        System.out.println("enter where to end >>");
        int end=Integer.parseInt(br.readLine());
        for(int i=start;i<=end;i++) {
            if(i%2==1){
                System.out.print(i+" ");
            }
            }
        System.out.println();
        for(int j=end;j>=start;j--) {
            if(j%2==0){
                System.out.print(j+" ");
            }
        }
        }
    }

