// Clase Libro


import java.util.Scanner;

public class Libro {
    Scanner sc = new Scanner(System.in);
    // Clase libro con los siguientes atributos;

    String titulo;
    String autor;
    int ejemplares;
    int prestados;

    // Constructor por defecto
    public Libro() {
        autor = "";
        titulo = "";
        ejemplares = 0;
        prestados = 0;
    }

    // Constructor con parámetros;
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    // SETTERS
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // GETTERS
    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public String getTitulo() {
        return titulo;
    }


    // Metodo solicitar datos;
    public void pedirDatos(Libro libro2) {
        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();
    }

    // Metodos prestamo: este metodo incrementa el atributo Prestados cada vez que empieze
    public boolean prestamo() {
        if (ejemplares == 0) {
            return false;
        } else {
            setEjemplares(ejemplares-1);
            return true;
        }
    }

    // Metodo devolucion que devuelve un libro, no se puede devolver
    // un libro que no se haya prestado
    public boolean devolucion() {
        if (prestados == 0) {
            return false;
        } else {
            setPrestados(prestados-1);
            return true;
        }
    }
}












