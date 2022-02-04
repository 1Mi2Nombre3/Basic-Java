import java.util.Scanner;

public class BusPar {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n;
        do{n = enter.nextInt();}while(n<=0);
        int x[] = new int [n];
        leerV(x,n);
        mostrarV(x,n);
        buscarParV(x,n);
        enter.close();
    }

    private static void buscarParV(int[] x, int n) {
        for(int i=0 ; i<n ; i++){
            if(x[i] % 2 == 0){
                System.out.println(x[i] + " es par");
            }
        }
    }

    private static void mostrarV(int[] x, int n) {
        for (int i=0 ; i<n ; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }

    private static void leerV(int[] x, int n) {
        Scanner enter = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            x[i] = enter.nextInt();
        }
        enter.close();
    }
}
