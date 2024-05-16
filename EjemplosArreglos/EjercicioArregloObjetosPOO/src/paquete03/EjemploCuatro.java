/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;
public class EjemploCuatro {
    public static void main(String[] args) {
Profesor profesor1= new Profesor("Fanco","nombramiento");
Profesor profesor2= new Profesor("Richard","contrato");

// crear un arreglo de objetos de tipo Calificacion
        
        Calificacion [] calificaciones = new Calificacion[2];
        
        Calificacion c = new Calificacion(10, "Computación",profesor1);
        Calificacion c2 = new Calificacion(9, "Electrónica",profesor2);
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f- Profesor(%s-%s)\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre(),
                    objetoCalificacion.obtenerProfesor().obtenerTipo());
            
            // llamamos a los tres objetos para imprimir y obetner el nombre
            // la nota y el profesor y depues del metodo obtenerProfesor
            // llamamos a obtenerNormbre para asignarle un nombre al profesor
        }
        
    }
}
