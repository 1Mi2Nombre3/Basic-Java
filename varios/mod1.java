import java.util.Scanner;

public class mod1 {
    
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n,x,y,s,i;
        n = enter.nextInt();
        x = enter.nextInt();
        y = enter.nextInt();
        s = 0;
        enter.close();
        for(i=1 ; i<=n ; i++){
            s = s + (((int)Math.pow(x, fac(i*2-1)))/(fac(i*y)));
        }
        System.out.println(s);
    }
    private static int fac(int x) {
        int i,f=1;
        for (i=1 ; i<=x ; i++){
            f = f * i;
        }
        return (f);
    }
}
