package co.edu.uniquindio.poo;

public class CalculadoraGraficadora extends Calculadora {
    public CalculadoraGraficadora(Pantalla pantalla, Teclado teclado) {
        super(pantalla, teclado);
    }

    
    @Override
public void sumar() {
    
    Vector3D vector1 = obtenerVectorDelTeclado();
    Vector3D vector2 = obtenerVectorDelTeclado();

   
    if (vector1 != null && vector2 != null) {
        
        Vector3D resultado = sumarVectores(vector1, vector2);
        
        mostrarResultadoEnPantalla(resultado);
    } else {
        
        mostrarErrorEnPantalla("Error: al menos uno de los vectores es nulo.");
    }
}

private Vector3D obtenerVectorDelTeclado() {

    
    return new Vector3D(0, 0, 0); 
}

private Vector3D sumarVectores(Vector3D vector1, Vector3D vector2) {

    double x = vector1.getX() + vector2.getX();
    double y = vector1.getY() + vector2.getY();
    double z = vector1.getZ() + vector2.getZ();
    
    return new Vector3D(x, y, z);
}

private void mostrarResultadoEnPantalla(Vector3D resultado) {

    System.out.println("El resultado de la suma de vectores es: " + resultado);
}

private void mostrarErrorEnPantalla(String mensaje) {
    
    System.out.println(mensaje);
}

public Vector3D sumar(Vector3D v1, Vector3D v2) {
   
    if (v1 == null || v2 == null) {
        
        return null;
    }

   
    return v1.sumar(v2);
}
}
