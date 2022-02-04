import java.util.Scanner;

public class RotarDer {
    public static void main(String[] args) {
        Scanner  enter = new Scanner(System.in);
        int n;
        do{n = enter.nextInt();}while(n<=0);
        String x[] = new String [n];
        leerV(x,n);
        mostrarV(x,n);
        RotDer(x,n);
        enter.close();
    }
    private static void RotDer(String[] x, int n) {
        String aux = x[n-1];
        System.out.println(aux);
        for (int i=1 ; i<n ; i++){
            x[n-i] = x[n-(i+1)];
        }
        x[0] = aux;
        mostrarV(x, n);
    }
    private static void mostrarV(String[] x, int n) {
        for (int i=0 ; i<n ; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }

    private static void leerV(String[] x, int n) {
        Scanner enter = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            x[i] = enter.nextLine();
        }
        enter.close();
    }
}
