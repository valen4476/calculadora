package co.edu.uniquindio.poo;

public abstract class Calculadora {
    protected final Pantalla pantalla;
    protected final Teclado teclado;

    public Calculadora(Pantalla pantalla, Teclado teclado) {
        this.pantalla = pantalla;
        this.teclado = teclado;
    }

    public abstract void sumar();

    public Pantalla getPantalla() {
        return pantalla;
    }

    public Teclado getTeclado() {
        return teclado;
    }
}

