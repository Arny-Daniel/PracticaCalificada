
package PrácticaCalificada;

import javax.swing.JOptionPane;

public class PrácticaCalificada1 {

    public static void main(String[] args) {
        
    JOptionPane.showMessageDialog(null, "Ingrese datos del empleado");
    
        String nombre = JOptionPane.showInputDialog("Nombre: ");
        double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Sueldo Base: "));
        int numeroEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Número de Empleado: "));
        int antigüedad = Integer.parseInt(JOptionPane.showInputDialog("Antigüedad: "));
        String categoria = JOptionPane.showInputDialog("Categoría: ");
        int gradoAcademico = Integer.parseInt(JOptionPane.showInputDialog(
                "Grado Académico (1-Licenciatura, 2-Maestría, 3-Doctorado): "));

        Docente docente = new Docente(categoria, gradoAcademico, nombre, sueldoBase, 
                numeroEmpleado, antigüedad);

        docente.toString();
    }
}
