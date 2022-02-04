import java.util.Scanner;

public class prI {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String c = read.nextLine();
        read.close();
        String Minus = "abcdefghijklmnopqrstuvwxyz";
        int n = Minus.length();
        String Mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int n1 = Mayus.length();
        int i,j,cv=0;

        System.out.println(c);
        for(i=0 ; i<n ; i++){
            if(Minus.charAt(i) == c.charAt(0)){
                cv = 1;
            }
        }
        for(j=0 ; j<n1 ; j++){
            if(Mayus.charAt(i) == c.charAt(0)){
                cv = 0;
            }
        }
        if (cv == 0){
            System.out.println(c.toUpperCase());
        }
        else{
            System.out.println(c.toLowerCase());
        }
    }
}
