package prestaciones;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;

public class empleado {

    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    public empleado(String cedula, String nombre, String apellido, String genero, double salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    public int calcularEdad() {
        LocalDate today = LocalDate.now();
        return Period.between(fechaNacimiento, today).getYears();
    }

    public double calcularPrestaciones() {
        int antiguedad = Period.between(fechaIngreso, LocalDate.now()).getYears();
        return (antiguedad * salario) / 12;
    }

    public void mostrarInformacion() {
        String info = "Información del Empleado:\n" +
                "Cédula: " + cedula + "\n" +
                "Nombre: " + nombre + " " + apellido + "\n" +
                "Género: " + genero + "\n" +
                "Salario: " + salario + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Fecha de Ingreso: " + fechaIngreso + "\n" +
                "Edad: " + calcularEdad() + " años\n" +
                "Prestaciones: " + calcularPrestaciones();
        JOptionPane.showMessageDialog(null, info);
    }

    public static void main(String[] args) {
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");
        String genero = JOptionPane.showInputDialog("Ingrese el género del empleado:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));
        LocalDate fechaNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (YYYY-MM-DD):"));
        LocalDate fechaIngreso = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de ingreso (YYYY-MM-DD):"));

        empleado empleado = new empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);
        empleado.mostrarInformacion();

        double nuevoSalario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario del empleado:"));
        empleado.modificarSalario(nuevoSalario);
        empleado.mostrarInformacion();
    }

}
