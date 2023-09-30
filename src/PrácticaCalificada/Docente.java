
package PrácticaCalificada;

import javax.swing.JOptionPane;

public class Docente extends Empleado {
    private String categoria;
    private int gradoAcademico;
    
    private static final double BONO = 100.0;

    public Docente(String categoria, int gradoAcademico, String nombre, double sueldoBase,
            int numeroEmpleado, int antigüedad) {
    super(nombre, sueldoBase, numeroEmpleado, antigüedad);
    this.categoria = categoria;
    this.gradoAcademico = gradoAcademico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(int gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
    
    @Override
    public double sueldoN() {
        double sueldoFinal = getSueldoBase();
        switch (gradoAcademico) {
            case 1 ->
                sueldoFinal += BONO;
            case 2 ->
                sueldoFinal += BONO*3;
            case 3 ->
                sueldoFinal += BONO*5;
            default -> {
            } 
        }

        return sueldoFinal;
    }
    
    @Override
     public String toString() {
         
        String mensaje = super.mensaje();
        String grado = "";
        grado = switch (gradoAcademico) {
            case 1 -> "Licenciatura";
            case 2 -> "Maestría";
            case 3 -> "Doctorado";
            default -> "Otro";
        };
        
        String info = 
                
                "Nombre: " + getNombre() + "\n" +
                "Sueldo Base: " + getSueldoBase() + "\n" +
                "Número de Empleado: " + getNumeroEmpleado() + "\n" +
                "Categoría: " + categoria + "\n" +
                "Grado Académico: " + grado + "\n" +
                "Sueldo Final: " + sueldoN() + "\n" +
                mensaje;
        
        JOptionPane.showMessageDialog(null, info);
        return info;
     }

}
