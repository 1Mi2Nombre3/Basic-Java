import java.util.Scanner;

public class class4M {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n,m;
        n = enter.nextInt();
        m = enter.nextInt();
        int a[][] = new int [n][m];
        int b[] = new int[n];
        leerMP(a,n,m);
        mostrarM(a,n,m);
        System.out.println();
        SumaFilas(a,b,n,m);
        enter.close();
    }
    private static void SumaFilas(int[][] a, int[] b, int n ,int m) {
        for(int i=0 ; i<n ; i++){
            int s = 0;
            for (int j=0 ; j<m ; j++){
                s = s + a[i][j];
            }
            b[i] = s;
            int cd = (int)(Math.log10(b[i])+1);
            while (cd != 0){
                int d = (int)(b[i] / (Math.pow(10, cd - 1)));
                b[i] = (int)(b[i] % (Math.pow(10, cd - 1)));
                System.out.print(d + " ");
                cd = cd - 1;
            }
            System.out.println();
        }
    }
    private static void mostrarM(int[][] a, int n, int m) {
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void leerMP(int[][] a, int n, int m) {
        int s = 2;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                a[i][j] = s;
                s = s + 2;
            }
        }
    }
}