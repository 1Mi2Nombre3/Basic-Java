import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int n,i,x;
        do{n = enter.nextInt();}while(n<=0);
        enter.close();
        for(i=0 ; i<n ;i++){
            Scanner ent = new Scanner(System.in);
            int men = 9;
            x = ent.nextInt();
            int x1 = x;
            int cd = (int)(Math.log10(x))+1;
            int cd1 = cd;
            while (x!=0){
                int d = x / (int)(Math.pow(10, cd - 1));
                x = x % (int)(Math.pow(10, cd - 1));
                cd--;
                if (men>=d){
                    men = d;
                }
            }
            while (x1!=0){
                int d = x1 / (int)(Math.pow(10, cd1 - 1));
                x1 = x1 % (int)(Math.pow(10, cd1 - 1));
                cd1--;
                if (men != d){
                    System.out.print(d);
                }
            }
            System.out.println();
        }
    }
}