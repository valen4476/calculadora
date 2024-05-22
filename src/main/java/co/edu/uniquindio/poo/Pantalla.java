package co.edu.uniquindio.poo;

public class Pantalla {
    private final int filas;
    private final int columnas;
    private final boolean aColor;

    public Pantalla(int filas, int columnas, boolean aColor) {
        this.filas = filas;
        this.columnas = columnas;
        this.aColor = aColor;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public boolean isAColor() {
        return aColor;
    }
}
