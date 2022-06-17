/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author marco
 */
public class Ejecutor2 {
public static void main(String[] args) {   
   String nombre = "René";
   String apellido = "Elizalde";
   String identificacion = "110011";
   int edad = 36;
   int numeroCreditos = 5;
   double costoCreditos = 30.000;
   
   
        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad);
        
        estudiantePresencial.establecerCostoAsignatura(50.5);
        estudiantePresencial.establecerNumeroAsginaturas(5);
        estudiantePresencial.calcularMatriculaDistancia();
        
        System.out.println(estDistancia);  
  
  
  }







    
}
