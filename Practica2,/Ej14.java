import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n;
        do{n = enter.nextInt();}while(n<=0);
        String l[] = new String [n];
        leerV(l, n);
        BusEle(l, n);
    }
    private static void BusEle(String[] l, int n) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Elemento a buscar");
        String x = enter.nextLine();
        int c = 0;
        for(int i=0 ; i<n ; i++){
            int lon = l[i].length();
            String a = l[i];
            for(int j=0 ; j<lon ; j++){
                String b = a.charAt(j) + "";
                if(x.equals(b)){
                    c = c + 1;
                }
            }
        }
        System.out.println("el elemento ["+x+"] se halla "+c+" veces");
    }
    private static void leerV(String[] l, int n) {
        Scanner enter = new Scanner(System.in);
        int c = 1;
        for(int i=0 ; i<n ; i++){
            System.out.println("cad: "+c);    
            l[i] = enter.nextLine();
            c = c + 1;
        }
        System.out.println();
    }
}
