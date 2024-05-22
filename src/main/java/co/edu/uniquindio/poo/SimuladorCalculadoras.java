package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class SimuladorCalculadoras {
 private final List<Calculadora> calculadoras;

    public SimuladorCalculadoras(List<Calculadora> calculadoras) {
        this.calculadoras = calculadoras;
    }

    public List<CalculadoraGraficadora> obtenerCalculadorasGraficadoras() {
        List<CalculadoraGraficadora> graficadoras = new ArrayList<>();
        for (Calculadora calculadora : calculadoras) {
            if (calculadora instanceof CalculadoraGraficadora) {
                graficadoras.add((CalculadoraGraficadora) calculadora);
            }
        }
        return graficadoras;
    }
}

