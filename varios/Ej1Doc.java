import java.util.Scanner;

public class Ej1Doc {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String c1,c2,aux; 
        c1 = enter.nextLine();
        enter.close();
        c2="";
        aux="";

        int i, lon, c=0; 
        lon = c1.length();

        for (i=0 ; i<lon ; i++){
            if(c1.charAt(i) == ' '){
                c++;
            }

            if(c%2 != 0){
                aux = aux+c1.charAt(i);
                aux = aux.toLowerCase();
                c2=c2+aux;
            }
            else{
                aux = aux+c1.charAt(i);
                aux=aux.toUpperCase();
                c2=c2+aux;
            }
            aux="";
        }
        System.out.println(c2);
    }
}