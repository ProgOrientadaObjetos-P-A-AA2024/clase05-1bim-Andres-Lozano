/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class EjemploTres {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {new Calificacion(10, "Computación"), 
            new Calificacion(9, "Electrónica")};
        // es un objeto anonimo donde se lo crea dentro de la asignacion de valores del arreglo 
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
        }
        
    }
}
