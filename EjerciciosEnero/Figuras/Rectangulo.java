package Figuras;

public class Rectangulo {
    double base;
    double altura;


    // Constructor que no recibe parametros e inicializa el valor de base
    // y altura a 1;
    public Rectangulo() {
        base = 1;
        altura = 1;
    }

    // Constructor que recibira como parametros el valor de la base y de la altura;
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo getAltura sin parametros que devuelva el valor de la altura;

    public double getAltura() {
        return altura;
    }

    // Metodo getBase sin parametros que devuelva el valor de la base;
    public double getBase() {
        return base;
    }


    // Metodo setAltura que recibe como parametro el valor de la altura y lo asigna
    // al atributo altura;
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Metodo setBase que recibe como parametro el valor de la base y lo asigna
    // al atributo base;
    public void setBase(double base) {
        this.base = base;
    }


    // Metodo setLados que recibe como parametros la base y la altura
    // y se lo asigna a los atriburos base y altura;
    public void setLados(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //UN metodo llamado perimetro que nos devuelve el peimetro del rectangulo.
    public double perimetro() {
        return 2 * altura * 2 * base;
    }

    // Metodo area que devuelva el area del triangulo
    public double area() {
        return base * altura;
    }



}
