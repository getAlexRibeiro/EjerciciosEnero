package Figuras;

public class Circulo {
    double _radio;

    public Circulo() { _radio =1; }
    public Circulo(double _radio) {
        double radio = _radio;
    }

    public double get_radio() {
        return _radio;
    }
    public void set_radio(double _radio) {
        this._radio = _radio;
    }
    public double Perimetro() {
        return _radio*Math.PI*2;
    }
    public double Area() {
        return Math.PI*Math.pow(_radio, 2);
    }
}
