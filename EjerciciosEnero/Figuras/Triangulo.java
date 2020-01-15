package Figuras;

public class Triangulo {
    double base;
    double altura;


    public Triangulo() {
        base = 1;
        altura = 1;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLados(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double area() {
        return (base*altura)/2;
    }
    public double perimetro() {
        return 2*base * 2*altura;
    }

}
package figuras;

public class Triangulo {
    double base;
    double altura;


    public Triangulo() {
        base = 1;
        altura = 1;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLados(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double area() {
        return (base*altura)/2;
    }
    public double perimetro() {
        return 2*base * 2*altura;
    }

}

