import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        Scanner enter = new Scanner (System.in);
        int n = enter.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        int contador = 0;
        LlenarVector(a, n);
        ImprimirVector(a, n);
    }

    public static void LlenarVector(int[]a , int n){
        Scanner enter = new Scanner(System.in);
        for (int i=0 ; i<n ; i++){
            a[i] = enter.nextInt();
        }
    }

    public static void ImprimirVector(int[]a , int n){
        Scanner enter = new Scanner(System.in);
        for (int i=0 ; i<n ; i++){
            System.out.print(a[i]+" ");
        }
    }
}
