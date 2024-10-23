package Calculadora;


import java.util.Scanner;

public class ClCalculadora {

    public static void main(String args[])
    {
        /*
           public cuando puedo o le permito ser utilizado entre clases
           private cuando el metodo o variable es utilizado solo es la misma clase*/

        //declarar variables
        String nombre, apellido;
        int num1, num2;
        double resultado;

        //instanciar la clase
        Scanner sc = new Scanner(System.in);

        System.out.println("Buenos Dias");
        System.out.print("Ingrese el nombre: \n");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = sc.nextLine();

        System.out.println("El nombre es: " + nombre + "\nSu apellido es: " + apellido);

        /******************* valores numericos **********************************/
        System.out.println("Ingrese el numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el numero 2: ");
        num2 = sc.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);


    }

}
