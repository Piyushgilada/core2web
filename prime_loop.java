public class prime_loop {
    public static void main(String[] args) {
        int n=1;
                while(n<=100){

                    int count=0;
                    for (int i = 1; i <= n; i++) {
                        if(n%i==0)
                        {
                            count++;
                        }
                    }
                    if (count==2) {
                        System.out.println(n+" is the prime no");
                    }
//                    else {
//                        System.out.println(n+ " is not prime");
//                    }
                    n++;
                }
    }
}
