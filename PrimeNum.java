import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n = sc.nextInt();
        boolean flag = false;
        if (n < 2) flag = false;
        for (int i = 2; i <= n/2 ; i++) {
            System.out.println(n);
            if(n%i==0) {
                flag = true;
                break;
            }

        }
        System.out.println(flag);
        if(!flag){
            System.out.println(""+"is a prime num");
        }else {
            System.out.println(""+"not a prime num");
        }

    }
}
