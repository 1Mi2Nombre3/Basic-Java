import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        int[] l = new int [n];
        for (int i=0 ; i<n ; i++){
            l[i] = enter.nextInt();
        }
        for (int i=(n-1) ; i>=0 ; i--){
            System.out.println(l[i]);
        }
        enter.close();
    }
}
