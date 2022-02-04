import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String cad = enter.nextLine();
        int i, c=0;
        enter.close();

        for(i=0 ; i<cad.length() ; i++){
            if((cad.charAt(i) == '¡') || (cad.charAt(i) == '!')){
                c = c + 1;
            }
        }
        System.out.println("hay "+ c +" signos de admiracion en la cadena");
    }
}
