import java.util.Scanner;

public class MatrGusan_Der_Izq {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n,m;
        n = enter.nextInt();
        m = enter.nextInt();
        int a[][] = new int [n][m];
        leerM(a,n,m);
        GusanoM(a,n,m);
        mostrarM(a,n,m);
        enter.close();
    }

    private static void GusanoM(int[][] a, int n, int m) {
        int s = 1;
        for (int i=0 ; i<n ; i++){
            if (i % 2 == 0){
                for (int j=0 ; j<m ; j++){
                    a[i][j] = s;
                    s = s + 1;
                }
            }
            else{
                for (int k=m-1 ; k>-1 ; k--){
                    a[i][k] = s;
                    s = s + 1;
                }
            }
        }
    }

    private static void mostrarM(int[][] a, int n, int m) {
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.err.print(a[i][j]+" ");
            }
            System.err.println();
        }
    }

    private static void leerM(int[][] a, int n, int m) {
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                a[i][j] = 0;
            }
        }
    }
}
