public class PerfectNo {
    public static void main(String[] args) {


        int n = 6;
        int count = 0;
        int per=0;
        for (int i=1;i<6;i++) {
            if (n % i == 0) {
                count++;
                per = per + i;
            }
        }
        if (per==n) {
            System.out.println("perfect no");
        }
        else{
            System.out.println("not perfect");
        }
    }
}
