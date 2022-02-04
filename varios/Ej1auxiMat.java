import java.util.Scanner;

public class Ej1auxiMat {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int m = n;
        int[][] a = new int [n][m];
        leerM(a,n,m);
        mostrarM(a,n,m);
        enter.close();
        int x = (int)(n / 2);
        int aux = 1;
        System.out.println(x);
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                
                if (x == j){
                    a[i][j] = aux;
                    aux = aux + 1;
                }
                a[i][j] = 0;
            }
        }
        
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
                a[i][j] = 0;
            }
        }
        enter.close();
    }   
}
