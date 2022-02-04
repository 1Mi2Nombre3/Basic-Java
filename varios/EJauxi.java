import java.util.Scanner;

public class EJauxi {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n;
        n = enter.nextInt();
        int a=2,aux=0,cv=0,b=4;
        int x=2,y=2,aux1=0;
        for(int i=0 ; i<n ; i++){
            if(cv == 1){
                if(aux < b){
                    a = a + b;
                    aux = aux + 1;
                }
                else{
                    b = b + 2;
                    aux = 0;
                    a = a + b;
                    aux = aux + 1;
                }
            }
            if (i==1){
                a = a + 2 ;
                cv = 1;
            }
            if(aux1 < y){
                aux1 = aux1 + 1;
            }
            else{
                y = y + 2;
                x = x + 2;
                aux1 = 0;
                aux1 = aux1 + 1;
            }
            System.out.print(a+"/"+x+" ");
        }
    }
}
