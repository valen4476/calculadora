package co.edu.uniquindio.poo;

public class Teclado {
    private final String marca;
    private final boolean esTactil;

    public Teclado(String marca, boolean esTactil) {
        this.marca = marca;
        this.esTactil = esTactil;
    }

    public String getMarca() {
        return marca;
    }

    public boolean esTactil() {
        return esTactil;
    }
}

