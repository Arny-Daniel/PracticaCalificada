package PrácticaCalificada;

public class Empleado {
    private String nombre;
    private double sueldoBase;
    private int numeroEmpleado;
    private int antigüedad;

    public Empleado(String nombre, double sueldoBase, int numeroEmpleado, int antigüedad) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.numeroEmpleado = numeroEmpleado;
        this.antigüedad = antigüedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    @Override
    public String toString() {
    return "";
  }

  public String mensaje() {
    return "Examen Práctico";
  }

  public double sueldoN() {
    return 0.0;
  }
}
