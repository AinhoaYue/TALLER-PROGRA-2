package ejercicio;
import javax.swing.JOptionPane;

  public class carro {

    private String numeroMotor;
    private int numeroVentanas;
    private int numeroPuertas;
    private String marca;
    private String modelo;
    private double kilometrajeInicial;
    private double kilometrajeFinal;

    public carro(String numeroMotor, int numeroVentanas, int numeroPuertas, String marca, String modelo, double kilometrajeInicial, double kilometrajeFinal) {
        this.numeroMotor = numeroMotor;
        this.numeroVentanas = numeroVentanas;
        this.numeroPuertas = numeroPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrajeInicial = kilometrajeInicial;
        this.kilometrajeFinal = kilometrajeFinal;
    }

     public double calcularKilometrosRecorridos() {
        return kilometrajeFinal - kilometrajeInicial;
    }

    public void mostrarInformacion() {
        String info = "Información del Vehículo:\n" +
                "Numero de Motor: " + numeroMotor + "\n" +
                "Numero de Ventanas: " + numeroVentanas + "\n" +
                "Numero de Puertas: " + numeroPuertas + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Kilometraje Inicial: " + kilometrajeInicial + " km\n" +
                "Kilometraje Final: " + kilometrajeFinal + " km\n" +
                "Kilómetros Recorridos: " + calcularKilometrosRecorridos() + " km";
        JOptionPane.showMessageDialog(null, info);

    }

    public static void main(String[] args) {

        String numeroMotor = JOptionPane.showInputDialog("Ingrese el numero de motor:");
        int numeroVentanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventanas:"));
        int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas:"));
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        double kilometrajeInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje inicial:"));
        double kilometrajeFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje final:"));


        carro carro = new carro(numeroMotor, numeroVentanas, numeroPuertas, marca, modelo, kilometrajeInicial, kilometrajeFinal);
        carro.mostrarInformacion();
    }

}