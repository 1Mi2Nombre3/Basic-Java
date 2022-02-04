import java.util.Scanner;

public class MatrizCaracol {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int [] [] matriz  = new int[n][n];
        int a = 0;
        int b = n-1;
        int valor = 1 ;
        enter.close();
        for(int j=0 ; j<matriz.length; j++){
            for(int i=a ; i<= b; i++ ){
                matriz[a][i] = valor++;
            }
            for(int i=a+1 ; i<=b ; i++){
                matriz[i][b] = valor++;
            }
            for(int i=b-1; i>=a ; i--){
                matriz[b][i] = valor++;
            }
            for(int i=b-1 ; i>=a+1; i--){
                matriz[i][a] = valor++;
            }
            a++; b--;    
        }
        mostrarM(matriz,n,n);
    }
    private static void mostrarM(int[][] matriz, int n, int m) {
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
