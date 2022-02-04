public class cadenas {
    public static void main(String[] args) {
        String nombre = "Jhonatan ";
        String apellido ="Nina Selaez";
        String nombrecompleto = nombre + apellido;
        System.out.println(nombrecompleto);

        String respuesta = nombrecompleto.substring(9,13);
        System.out.println(respuesta);

        int longitud = nombrecompleto.length();
        System.out.println(longitud);
        
        int Contador = 0;

        for(int i=0 ; i<longitud ; i++){
            String d = nombrecompleto.substring(i, i+1);
            System.out.println(d);
            if(d.equals("a")){
                Contador++;
            }
        }
        System.out.println("Hay "+Contador+" letras a");
    
    }
}
