import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n;
        do{
            n = enter.nextInt();
        }while(n<=0);
        par(n);
        enter.close();
    }

    private static void par(int n) {
        Scanner enter = new Scanner(System.in);
        int i,x;
        for (i=1 ; i<=n ; i++){
            x = enter.nextInt();
            if (x%2 == 0){
                System.out.print(x+" ");
            }
        }
    }
}
