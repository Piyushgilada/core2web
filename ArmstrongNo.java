public class ArmstrongNo  {
    public static void main(String[] args) {
        int n = 153;
        int temp1 = n;
        int temp2 = n;
        int count = 0;
        int rem, sum=0;

        while (n != 0) {
            count++;
            n = n / 10;
        }


        while (temp1!= 0) {
            int mul=1;
            rem = temp1 % 10;
            for(int i=1;i<=count;i++){
                mul=mul*rem;
            }
            sum=sum+mul;
            temp1=temp1/10;
        }
        if (sum==temp2)
        {
            System.out.println(sum+" is an armstrong number");
        }
        else {
            System.out.println("not an armstrong number");
        }
    }
}

