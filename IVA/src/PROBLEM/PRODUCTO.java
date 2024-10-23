package PROBLEM;
import javax.swing.JOptionPane;


public class PRODUCTO {

    private String nombre;
    private double precio;
    private boolean tieneIVA;

    public PRODUCTO(String nombre, double precio, boolean tieneIVA) {
        this.nombre = nombre;
        this.precio = precio;
        this.tieneIVA = tieneIVA;
    }

    public double calcularIVA() {
        if (!tieneIVA) {
            return 0;
        } else if (precio <= 500) {
            return precio * 0.12; // 12% de IVA
        } else if (precio > 500 && precio <= 1500) {
            return precio * 0.14; // 14% de IVA
        } else {
            return precio * 0.15; // 15% de IVA
        }
    }

    public double calcularPrecioTotal() {
        return precio + calcularIVA();
    }

    public void mostrarInformacion() {
        String info = "Información del Producto:\n" +
                "Nombre: " + nombre + "\n" +
                "Precio: " + precio + "\n" +
                "Tiene IVA: " + (tieneIVA ? "Sí" : "No") + "\n" +
                "IVA: " + calcularIVA() + "\n" +
                "Precio Total: " + calcularPrecioTotal();
        JOptionPane.showMessageDialog(null, info);
    }

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
        int tieneIVAInput = JOptionPane.showConfirmDialog(null, "¿El producto tiene IVA?", "IVA", JOptionPane.YES_NO_OPTION);
        boolean tieneIVA = (tieneIVAInput == JOptionPane.YES_OPTION);

        PRODUCTO producto = new PRODUCTO(nombre, precio, tieneIVA);
        producto.mostrarInformacion();
    }


}
