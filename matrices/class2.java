import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        //dada una matriz cuadrada, hallar la suma de los elementos de la diagonal principal
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int m = enter.nextInt();
        int[][] a = new int [n][m];
        int suma = 0;
        leerM(a,n,m);
        mostrarM(a,n,m);
        Diago(a,n,m,suma);
        enter.close();
        
    }

    private static void Diago(int[][] a, int n, int m, int suma) {
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                if (i==j){
                    suma = suma + a[i][j];
                }
            }
        }
        System.err.println(suma);
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
