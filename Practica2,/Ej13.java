import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int i,n;
        do{n = enter.nextInt();}while(n<=0);
        int l[] = new int[n];
        int l1[] = l;
        leerV(l, n);
        int aux = 0;
        for(i=0 ; i<n ; i++){
            l1[i] = l[i] + aux; 
            aux = l1[i]; 
        }
        mostrarV(l1, n);
        
    }
    private static void leerV(int[] x, int n) {
        Scanner enter = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            x[i] = enter.nextInt();
        }
        System.out.println();
    }
    private static void mostrarV(int[] x, int n) {
        System.out.print("[ ");
        for (int i=0 ; i<n ; i++){
            System.out.print(x[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
}
