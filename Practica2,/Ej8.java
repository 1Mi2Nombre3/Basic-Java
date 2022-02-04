import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int x = enter.nextInt();
        String y = Integer.toString(x);
        int cd = y.length();
        int a[] = new int [cd];
        enter.close();

        for(int i=0 ; i<cd ; i++){
            String aux = y.charAt(i) + "";
            int aux1 = Integer.parseInt(aux);
            a[i] = aux1;
        }
        mostrarV(a, cd);
    }
    private static void mostrarV(int[] a, int n) {
        System.out.print("[ ");
        for (int i=0 ; i<n ; i++){
            if (a[i] % 2 == 0){
                System.out.print(a[i]+" ");    
            }
        }
        System.out.print("]");
    }
}
