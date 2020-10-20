import java.util.Scanner;

class figurasClasico{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int base, altura, opcion;
        char letra;
        double resultado;
    do{
        System.out.println("Elija la opción deseada: ");
        System.out.println("1.- Calcular el area de un cuadrado: ");
        System.out.println("2.- Calcular el area de un triangulo: ");
        System.out.println("3.- Calcular el area de un circulo: ");
        System.out.println("4.- Salir ");

        opcion = entrada.nextInt();
        //segun sea el caso
        switch (opcion){
            case 1:
                //aqui es donde se realikzan las operaciones
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                resultado = base*base;

                System.out.println("El area del cuadrado es de: "+resultado);
                break;

            case 2:
                System.out.println("Ingresa el valor del lado");
                base = entrada.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                
                resultado = (base*altura)/2;

                System.out.println("El area del triangulo es de: "+resultado);
                break;

            case 3:
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();

                resultado = 3.1416*base*base;

                System.out.println("El area del cuadrado es de: "+resultado);
                break;

            default:
                System.out.println("Gracias por participar unu nwn/ ");
        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        letra = entrada.next().charAt(0);

        //si se utiliza char se usa ''
        //si usamos string se usa ""

    }while(letra == 's');
    }
}