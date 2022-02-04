import java.util.Scanner;

public class RotarIzq {
    public static void main(String[] args) {
        Scanner  enter = new Scanner(System.in);
        int n;
        do{n = enter.nextInt();}while(n<=0);
        String x[] = new String [n];
        leerV(x,n);
        mostrarV(x,n);
        RotIzq(x,n);
        enter.close();
    }
    private static void RotIzq(String[] x, int n) {
        String aux = x[0];
        int c = 0;
        for(int i=1 ; i<n ; i++){
            x[c] = x[i];
            c ++;
        }
        x[c] = aux;
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
