import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n;
        do{n = enter.nextInt();}while(n<=0);
        int suma = 0;
        int x[] = new int [n];

        leerV(x,n);
        mostrarV(x,n);
        Esprimo(x,n,suma);
    }
    
    private static void leerV(int[] x, int n) {
        Scanner enter = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            x[i] = enter.nextInt();
        }
    }

    private static void mostrarV(int[] x, int n) {
        System.out.print("[ ");
        for (int i=0 ; i<n ; i++){
            System.out.print(x[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    private static void Esprimo(int[] x, int n, int suma) {
        int c = 0;

        for(int i=0 ; i<n ; i++){
            c=0;
            for(int j=1 ; j<=x[i] ; j++){
                if (x[i] % j == 0){
                    c++;
                }
            }
            if (c==2){
                suma = suma + x[i];
            }
        }
        System.out.println("la suma de primos es: "+suma);
    }
}
