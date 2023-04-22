//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import  java.io.*;

public class BufferdReader {
    public static void main (String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter character");
        char A=(char)br.read();
        br.skip(1);

        System.out.println("enter string");
        String B=br.readLine();

        System.out.println("enter int");
        int C=Integer.parseInt(br.readLine());

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
