import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String cad = enter.nextLine();
        String cad1 = "";
        enter.close();
        for(int i=0 ; i<cad.length() ;i++){
            if(cad.charAt(i) != ' '){
                cad1 = cad1 + cad.charAt(i); 
            }
            else{
                cad1 = cad1 + '$';
            }
        }
        System.out.println(cad1);
    }   
}
