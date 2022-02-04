import java.util.Scanner;
public class Ej2Doc {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String c2="",aux="",c1 = enter.nextLine();
        enter.close();
        
        int i,a=0;
        int lon = c1.length();
        String alp = "abcdefghijklmnopqrstuvwxyz";

        for (i=0 ; i<lon ; i++)
        {
            aux = aux+c1.charAt(i);
            a = alp.indexOf(aux)+1;
            
            if (aux.equals(" ")){
                c2=c2+" ";
            }
            else{
                c2 = c2 + alp.charAt(a);
            }

            if(a>=26){
                a=0;
            }
            aux="";   
        }  
        System.out.println(c2);
    }
}