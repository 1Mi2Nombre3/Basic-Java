import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        // dado una matriz n x m con datos leidos desde teclado, mostrar sus datos.
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int m = enter.nextInt();
        int[][] a = new int [n][m];
        leerM(a,n,m);
        mostrarM(a,n,m);
        enter.close();
        
    }

    private static void mostrarM(int[][] a, int n, int m) {
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void leerM(int[][] a, int n, int m) {
        Scanner enter = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                a[i][j] = enter.nextInt();
            }
        }
        enter.close();
    }   
}