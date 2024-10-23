
import calculo.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Triángulo
        System.out.println("Triángulo");
        System.out.print("Ingrese la base del triángulo: ");
        double base = Double.parseDouble(br.readLine());
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el lado 1 del triángulo: ");
        double lado1 = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el lado 2 del triángulo: ");
        double lado2 = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el lado 3 del triángulo: ");
        double lado3 = Double.parseDouble(br.readLine());

        triangulo triangulo = new triangulo(base, altura, lado1, lado2, lado3);
        System.out.println("Área del triángulo: " + triangulo.calculoArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calculoPerimetro());


        System.out.println("\nCuadrado");
        System.out.print("Ingrese el lado del cuadrado: ");
        double ladoCuadrado = Double.parseDouble(br.readLine());

        cuadrado cuadrado = new cuadrado(ladoCuadrado);
        System.out.println("Área del cuadrado: " + cuadrado.calculoArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calculoPerimetro());


        System.out.println("\nRectángulo");
        System.out.print("Ingrese el largo del rectángulo: ");
        double largo = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = Double.parseDouble(br.readLine());

        rectangulo rectangulo = new rectangulo(largo, ancho);
        System.out.println("Área del rectángulo: " + rectangulo.calculoArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calculoPerimetro());
    }
}
