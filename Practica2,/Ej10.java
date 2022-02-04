import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int x;
        do{x = enter.nextInt();}while(x<=0);
        String y = Integer.toString(x);
        int cd = y.length();
        int a[] = new int [cd];
        enter.close();
        for(int i=0 ; i<cd ; i++){
            String aux = y.charAt(i) + "";
            int aux1 = Integer.parseInt(aux);
            a[i] = aux1;
        }
        mostrarImpar(a, cd);
        mostrarPar(a, cd);
    }
    private static void mostrarPar(int[] a, int n) {
        System.out.print("[ ");
        for (int i=0 ; i<n ; i++){
            if (a[i] % 2 == 0){
                System.out.print(a[i]+" ");    
            }
        }
        System.out.print("]");
    }
    private static void mostrarImpar(int[] a, int n) {
        System.out.print("[ ");
        for (int i=0 ; i<n ; i++){
            if (a[i] % 2 != 0){
                System.out.print(a[i]+" ");    
            }
        }
        System.out.print("]");
    }
}