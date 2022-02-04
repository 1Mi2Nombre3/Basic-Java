import java.util.Scanner;

public class remplazoVoc {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String c1,c2="",c3="", voc="aeiou";
        int i,j,n,n1,cv=0;
        c1 = enter.nextLine();
        enter.close();
        n = c1.length();
        n1 = voc.length();
        for (i=0 ; i<n ; i++){
            cv = 0;
            for (j=0 ; j<n1 ; j++){
                if(c1.charAt(i) == voc.charAt(j)){
                    cv = 1;
                }
            }
            if (cv == 0){
                c2 = c2 + c1.charAt(i);
            }
            else{
                c3 = c3 + c1.charAt(i);
            }
        }
        System.out.println(c2);
        System.err.println(c3);

    }
}
