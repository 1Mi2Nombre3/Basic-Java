import java.util.Scanner;

public class Noprimos {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n,x,i;
        do{
            n = enter.nextInt();
        }while(n<=0);
        for(i=1 ; i<=n ; i++){
            x = enter.nextInt();
            if (esPrimo(x) == false){
                System.out.println(x+"soy");
            }
        }
        
    }

    private static boolean esPrimo(int a) {
        int cd = 0;
        for(int i=1 ; i<=a ; i++){
            if (a%i==0){
                cd++;
            }
        }
        if (cd==2){
            return (true);
        }
        else{
            return (false);
        }
    }
}
