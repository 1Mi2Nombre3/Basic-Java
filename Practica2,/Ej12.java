import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n;
        do{n = enter.nextInt();}while(n<=0);
        int l[] = new int[n];
        leerV(l, n);
        mostrarV(l, n);
        int l1[] = l;
        Inver(l1, n);
        mostrarV(l1, n);
        int l2[] = l;
        centerV(l2, n);
        mostrarV(l2, n);

        
    }
    private static void leerV(int[] x, int n) {
        Scanner enter = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            x[i] = enter.nextInt();
        }
        System.out.println();
    }
    private static void Inver(int[] x, int n) {
        for (int i=0 ; i<n ; i++){
            int cd = (int)(Math.log10(x[i]))+1;
            int a = x[i];
            String b,c="";
            b = Integer.toString(a);

            for (int j=(cd-1) ; j>=0 ; j--){
                c = c + b.charAt(j);
            }
            int d = Integer.parseInt(c);
            x[i] = d;
        }
    }
    private static void mostrarV(int[] x, int n) {
        System.out.print("[ ");
        for (int i=0 ; i<n ; i++){
            System.out.print(x[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    
    private static void centerV(int[] x, int n) {
        for (int i=0 ; i<n ; i++){
            int cd = (int)(Math.log10(x[i]))+1;
            int a = x[i];
            String b = Integer.toString(a);
            if((cd % 2 == 0)||(cd == 1)){
                int c = (int)(cd / 2);
                String d;
                d = (b.charAt(c)) + "" + (b.charAt(c-1)) + "";
                int e = Integer.parseInt(d);
                x[i] = e;
            }
            else{
                int f = (int)(cd / 2);
                String g = b.charAt(f) + "";
                int h = Integer.parseInt(g);
                x[i] = h;
            }
        }
    }
}
