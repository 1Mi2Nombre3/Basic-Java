import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n;
        do{n = enter.nextInt();}while(n<=0);
        int x[] = new int [n];

        leerV(x,n);
        enter.close();
    }

    private static void centerV(int x) {
        int lon = (int)(Math.log10(x))+1;
        int a[] = new int[lon];
        int d,cd=lon;
        for (int i=0 ; i<lon ; i++){
            d = x / (int)(Math.pow(10, cd - 1));
            x = x % (int)(Math.pow(10, cd - 1));
            cd--;
            a[i] = d;
        }
        if ((lon%2==0)||(lon==1)){
            if(lon == 1){
                for(int i=0 ; i<lon ; i++){
                    System.out.println(a[i]);;
                }
            }
            else{
                int c = (int)(lon/2);
                int b[] = new int[2];
                b[0] = a[c-1];
                b[1] = a[c];
                System.out.print(b[0]);
                System.out.print(b[1]);
                System.out.println();
                }
            }
        else{
            int c = (int)(lon/2);
            System.out.println(a[c]);
        }
    }
    private static void leerV(int[] x, int n) {
        Scanner enter = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            x[i] = enter.nextInt();
            centerV(x[i]);
        }
        enter.close();
    }
}