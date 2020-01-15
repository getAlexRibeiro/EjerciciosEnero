package Figuras;

import javax.swing.*;

public class Main {

    static Rectangulo f1 = new Rectangulo();
    static Triangulo f2 = new Triangulo();
    static Circulo f3 = new Circulo();

    public static void main(String[] args) {
        String menu = "";
        int op;
        do {
            menu = "";
            menu += "Elige el tipo de figura:\n";
            menu += "1.- Triángulo Rectángulo \n";
            menu += "2.- Triángulo \n";
            menu += "3.- Círculo \n";
            menu += "4.- Salir \n";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1:
                    f1.altura = Integer.parseInt((JOptionPane.showInputDialog("Indique la altura del rectánguo:\n 'Se mostrata el resultado por consola'")));
                    f1.base = Integer.parseInt((JOptionPane.showInputDialog("Indique la base del rectángulo:\n 'Se mostrata el resultado por consola'")));

                    System.out.println(f1.perimetro());
                    System.out.println(f1.area());
                    break;
                case 2:
                    f2.altura = Integer.parseInt((JOptionPane.showInputDialog("Indique la altura del triángulo:\n 'Se mostrata el resultado por consola'")));
                    f2.base = Integer.parseInt((JOptionPane.showInputDialog("Indique la base del triángulo:\n 'Se mostrata el resultado por consola'")));

                    System.out.println(f2.area());
                    System.out.println(f2.perimetro());
                    break;
                case 3:
                    f3._radio = Integer.parseInt((JOptionPane.showInputDialog("Indique el radio del círculo:\n 'Se mostrata el resultado por consola'")));

                    System.out.println(f3.Area());
                    System.out.println(f3.Perimetro());
                    break;
            }

        } while (op != 4);
    }

}
