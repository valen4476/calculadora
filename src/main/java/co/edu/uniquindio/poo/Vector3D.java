package co.edu.uniquindio.poo;

public class Vector3D {
    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D sumar(Vector3D otro) {
        return new Vector3D(this.x + otro.x, this.y + otro.y, this.z + otro.z);
    }
    
}

