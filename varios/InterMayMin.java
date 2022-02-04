import java.util.Scanner;

public class InterMayMin {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String c1,c2="",c3="";
        int i,n,a=0;
        c1 = enter.nextLine();
        enter.close();
        n = c1.length();
        for(i=0 ; i<n ; i++){
            if (c1.charAt(i) != ' '){
                c2 = c2 + c1.charAt(i);
            }
            else{
                if (a % 2 == 0){
                    c2 = c2.toUpperCase();
                }
                else{
                    c2 = c2.toLowerCase();
                }
                c3 = c3 + c2 + ' ';
                c2 = "";
                a = a + 1;
            }
        }
        if (a % 2 == 0){
            c2 = c2.toUpperCase();
        }
        else{
            c2 = c2.toLowerCase();
        }
        c3 = c3 + c2;
        System.out.println(c3);
    }
}
