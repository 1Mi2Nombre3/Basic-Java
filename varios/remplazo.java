import java.util.Scanner;

public class remplazo {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String cad, cad1;
        int i, n;
        cad = enter.nextLine();
        cad1 = "";
        enter.close();
        n = cad.length();
        for(i=0 ; i<n ; i++){
            if(cad.charAt(i) != ' '){
                cad1 = cad1 + cad.charAt(i);
            }
            else{
                cad1 = cad1 + '-';
            }
        }
        System.out.println(cad1);
    }
}
