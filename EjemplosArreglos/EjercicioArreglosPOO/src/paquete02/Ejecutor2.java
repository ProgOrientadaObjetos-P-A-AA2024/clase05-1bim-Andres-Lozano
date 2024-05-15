
package paquete02;

import paquete01.LibretaCalificacion;

public class Ejecutor2 {
    public static void main(String[]arg ){
        double[] notas = {10,9,10};
        String nombreEstudiante = "Rene Elizalde";
        
        LibretaCalificacion libreta = new LibretaCalificacion(nombreEstudiante,
        notas);
        libreta.establecerPromedio();
        // no se llama a nungun metodo por ende presenta "0" por que es el valor por defecto 
        libreta.establecerPromedioCualitativo();
        // no se llama a ningun metodo por ende presenta "null" que es el valor por defecto 
        System.out.printf("%s\n", libreta);
            
        
    }
    
}
