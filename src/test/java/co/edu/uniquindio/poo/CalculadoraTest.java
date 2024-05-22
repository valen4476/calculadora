package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
 @Test
    public void testSumarConVectoresNulos() {
        Vector3D v1 = null;
        Vector3D v2 = null;
        CalculadoraGraficadora calculadoraGraficadora = new CalculadoraGraficadora(new Pantalla(5, 10, true), new Teclado("Casio", true));
        Vector3D resultado = calculadoraGraficadora.sumar(v1, v2);
        assertNull(resultado);
    }

    @Test
    public void testSumarConVectores() {
        Vector3D v1 = new Vector3D(2, 3, 4);
        Vector3D v2 = new Vector3D(5, 6, 7);
        CalculadoraGraficadora calculadoraGraficadora = new CalculadoraGraficadora(new Pantalla(5, 10, true), new Teclado("Casio", true));
        Vector3D resultado = calculadoraGraficadora.sumar(v1, v2);
        assertEquals(7.0, resultado.getX(), 0.01);
        assertEquals(9.0, resultado.getY(), 0.01);
        assertEquals(11.0, resultado.getZ(), 0.01);
    }
    @Test
    public void testObtenerCalculadorasGraficadoras() {
       
        List<Calculadora> calculadoras = List.of(
            new CalculadoraCientifica(new Pantalla(5, 10, true), new Teclado("Casio", true)),
            new CalculadoraGraficadora(new Pantalla(5, 10, true), new Teclado("Casio", true)),
            new CalculadoraGraficadora(new Pantalla(5, 10, true), new Teclado("HP", true))
        );

        SimuladorCalculadoras simulador = new SimuladorCalculadoras(calculadoras);
        List<CalculadoraGraficadora> graficadoras = simulador.obtenerCalculadorasGraficadoras();

        assertEquals(2, graficadoras.size());
    }
}
