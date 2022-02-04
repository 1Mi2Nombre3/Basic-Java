public class Ej1Auxi {
    public static void main(String[] args) {
        String nombre = "Hola soy german ";
        int lon = nombre.length();
        String New="";
        for(int i=0 ; i<=lon-4; i+=4){
            String read = nombre.substring(i, i+4);
            if (read.equals("Hola")){
                New += "x";
            }
            else{
                New += read;
            }
        }
        System.out.print(New);
    }
}
