import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n,i,j;
        do{n = enter.nextInt();}while(n<=0);
        enter.close();
        int x[] = new int [n];
        int a=0, b=1; 
        int c=0, p=2 , d=2;
        for(i=1 ; i<=n ; i++){
            if(i%2 == 0){
                a = a + b;
                b = a - b;
                x[i-1] = b;
            }
            else{
                int N = 0;
                while (N==0){
                    if(p%d==0){
                        if(p==d){
                            x[i-1] = p;
                            N = 1;
                            c = c + 1;
                        }
                        d = 2;
                        p = p + 1;
                    }
                    else{
                        d = d + 1;
                    }
                }
            }
        }
        System.out.print("[ ");
        for (j=0 ; j<n ; j++){
            System.out.print(x[j]+" ");
        }
        System.out.println("]");
    }
}
