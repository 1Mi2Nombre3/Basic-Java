import java.util.Scanner;

public class Fibon_y_M5 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n;
        do{
            n = enter.nextInt();
        }while(n<=0);
        enter.close();
        if (n%2 == 0){
            fib(n);
        }
        else{
            m5(n);
        }
    }

    private static void m5(int n) {
        int i,a=5,b=0;
        for (i=0 ; i<n ; i++){
            b = a + b;
            System.out.print(b+" ");
        }
    }

    private static void fib(int n) {
        int i,a=0,b=1;
        for (i=0 ; i<n ; i++){
            a = a + b;
            b = a - b;
            System.out.print(b+" ");
        }
    }
}
