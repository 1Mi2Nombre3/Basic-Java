import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n,n1,n2;
        System.out.println("Tamaño vector 1");
        do{n = enter.nextInt();}while(n<=0);
        int l[] = new int[n];
        leerV(l, n);

        System.out.println("Tamaño vector 2");
        do{n1 = enter.nextInt();}while(n1<=0);
        int l1[] = new int[n1];
        leerV(l1, n1);

        System.out.println("Tamaño vector 3");
        do{n2 = enter.nextInt();}while(n2<=0);
        int l2[] = new int[n2];
        leerV(l2, n2);
        System.out.println();

        mostrarV(l, n);
        mostrarV(l1, n1);
        mostrarV(l2, n2);

        System.out.println();

        int nR = n + n1 + n2;
        int lR[] = new int[nR];
        int cv = 1, a=0, b=0, c=0;

        for(int i=0; i<nR ; i++){
            if (cv==1){
                if (a < n){
                    lR[i] = l[a];
                    a = a + 1;
                    cv = 2;
                }
                else{
                    if(b < n1){
                        lR[i] = l1[b];
                        b = b + 1;
                        cv = 3;
                    }
                    else{
                        if(c < n2){
                            lR[i] = l2[c];
                            c = c + 1;
                            cv = 1;
                        }
                    }
                }
            }
            else{
                if(cv==2){
                    if(b < n1){
                        lR[i] = l1[b];
                        b = b + 1;
                        cv = 3;
                    }
                    else{
                        if(c < n2){
                            lR[i] = l2[c];
                            c = c + 1;
                            cv = 1;
                        }
                        else{
                            if(a < n){
                                lR[i] = l[a];
                                a = a + 1;
                                cv = 2;
                            }
                        }
                    }
                }
                else{
                    if(cv == 3){
                        if(c < n2){
                            lR[i] = l2[c];
                            c = c + 1;
                            cv = 1;
                        }
                        else{
                            if(a < n){
                                lR[i] = l[a];
                                a = a + 1;
                                cv = 2;
                            }
                            else{
                                if(b < n1){
                                    lR[i] =  l1[b];
                                    b = b + 1;
                                    cv = 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        mostrarV(lR, nR);

    }
    private static void leerV(int[] l, int n) {
        Scanner enter = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            l[i] = enter.nextInt();
        }
    }
    private static void mostrarV(int[] x, int n) {
        System.out.print("[ ");
        for (int i=0 ; i<n ; i++){
            System.out.print(x[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }
}