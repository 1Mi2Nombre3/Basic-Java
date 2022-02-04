import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int m = enter.nextInt();
        int a[][] = new int[n][m];
        int v[] = new int[n];
        llenarP(a, n, m);
        sumaFilas(a, n, m);
        descomV(v, n);
    }

    private static void descomV(int[] v, int n) {
        for(int i=0 ; i<n ; i++){
            while(v[i]!=0){
                int d = v[i]%10;
                v[i] = v[i] / 10;
                System.out.println();
            }
        }
    }

    private static void sumaFilas(int[][] a, int n, int m) {
        
    }

    private static void llenarP(int[][] a, int n, int m) {
        int p = 2;
        for (int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                a[i][j] = p;
                p++;
            }
        }
    }
    private static void mostrarM(int[] a, int n, int m) {
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }

    private static void leerM(int[][] a, int n, int m) {
        Scanner ent = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                a[i][j] = ent.nextInt();
            }
        }
    }  
}
