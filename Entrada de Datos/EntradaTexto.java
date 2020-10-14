class EntradaTexto{
    //cuerpo principal del programa
    public static void main(String[] args){}
        //primero variables
        String nombre;
        System.out.println("Por favor, dime tu nombre *w*: ");
        //queremos obtener el nombre de la entrada estandar de la computadora
        //¿quien es la entrada?
        //teclado, a partir de la linea de comando

        //primera forma para obtener un texto
        nombre = System.console().readliene();
        System.out.println("Hola"+nombre+ "bienbenido a tu segundo programa");
    }
}