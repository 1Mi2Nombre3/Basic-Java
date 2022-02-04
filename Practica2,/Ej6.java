import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n;
        System.out.println("tamaño: ");
        do{n = enter.nextInt();}while(n<=0);
        System.out.println("[Escribir con salto de linea]");
        String[] x = new String [n];
        leerV(x,n);
        InverPar(x, n);
        enter.close();
        mostrarV(x, n);
    }
    private static void InverPar(String[] x, int n) {
        for(int i=0 ; i<n ; i++){
            int b = Integer.parseInt(x[i]);
            if(b%2 == 0){
                String d = "";
                int a = x[i].length();
                String c = Integer.toString(b);
                for(int j=(a-1) ; j>=0 ; j--){
                    d = d + c.charAt(j) + "";
                }
                x[i] = d;
            }
        }
    }
    private static void leerV(String[] x, int n) {
        Scanner enter = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            x[i] = enter.nextLine();
        }
        enter.close();
    }
    private static void mostrarV(String[] x, int n) {
        System.out.print("[ ");
        for (int i=0 ; i<n ; i++){
            System.out.print(x[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
}