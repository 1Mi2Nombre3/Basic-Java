import java.util.Scanner;

public class LecturaDatos{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String c1,c2;
        c1= entrada.nextLine();
        c2 = entrada.nextLine(); 
        System.out.println(c1);
        System.out.println(c2);
        entrada.close();
        c1=c1.toUpperCase();
        System.out.println(c1);
        c2=c2.toLowerCase();
        System.out.println(c2);
    }
}