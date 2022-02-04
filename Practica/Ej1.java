package Practica;
import java.util.Scanner;

public class Ej1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String a;
        int read;
        a = entrada.nextLine();
        read = a.length();
        for (int i=0 ; i<read ; i++)
        {
            System.out.print(a.charAt(i));
        }
        entrada.close();
    }
}