import java.util.Scanner;
public class Ej3Doc {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String c1 = enter.nextLine();
        String x = enter.next();
        enter.close();

        String cad2="";
        int lon = c1.length();
        int i,c=0;
    
        for(i=0 ; i<lon ; i++)
        {
            cad2 = cad2 + c1.charAt(i);
            if (cad2.equals(x)){
                c++;
            }
            cad2="";
        }
        System.out.println("se repite "+c+" veces");
    }
}
