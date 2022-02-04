import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String cad = enter.nextLine();
        String cad1 = "";
        enter.close();
        String voc = "aeiou";
        int cv;
        for (int i=0 ; i<cad.length() ; i++){
            cv = 0;
            for (int j=0 ; j<voc.length() ; j++){
                if (cad.charAt(i) == voc.charAt(j)){
                    if (voc.charAt(j) != 'a'){
                        cad1 = cad1 + voc.charAt((j-1)%4);
                    }
                    else{
                        cad1 = cad1 + 'u';
                    }
                    cv = 1;
                }
            }
            if (cv == 0){
                cad1 = cad1 + cad.charAt(i);
            }
        }
        System.out.println(cad1);
    }
}
