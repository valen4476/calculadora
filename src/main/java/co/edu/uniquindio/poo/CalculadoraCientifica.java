package co.edu.uniquindio.poo;

public class CalculadoraCientifica extends Calculadora{
    public CalculadoraCientifica(Pantalla pantalla, Teclado teclado) {
        super(pantalla, teclado);
    }
    @Override
    public void sumar() {
        double numero1 = obtenerNumeroDelTeclado();
        double numero2 = obtenerNumeroDelTeclado();
        double resultado = numero1 + numero2;
        mostrarResultadoEnPantalla(resultado);
    }

    private double obtenerNumeroDelTeclado() {
       
        return 0.0;
    }

    private void mostrarResultadoEnPantalla(double resultado) {
       
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
