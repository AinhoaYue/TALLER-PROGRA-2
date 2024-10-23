package calculo;

public class triangulo extends figuras{

    private double base;
    private double altura;
    private double lado1, lado2, lado3;

    public triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calculoArea() {

        return (base * altura) / 2;

    }

    @Override
    public double calculoPerimetro() {

        return lado1 + lado2 + lado3;

    }


}
