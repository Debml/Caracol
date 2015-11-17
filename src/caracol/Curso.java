/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Debml
 */
public class Curso {
    String nombre;
    int id;
    Tutor tutor;
    Date fechaInicio;
    Date fechaFin;
    String lugar;
    int cupo;
    
    Curso(String nombre, int id, Tutor tutor, Date fechaInicio, Date fechaFin, String lugar, int cupo){
        this.id = id;
        this.nombre = nombre;
        this.tutor = tutor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.lugar = lugar;
        this.cupo = cupo;
    }
    
    //checa si un curso existe
    boolean validarCurso() throws IOException{
             String line;
             BufferedReader in;
             String auxID;

             in = new BufferedReader(new FileReader("cursos.txt"));
             line = in.readLine();

             //busca en la "base de datos" todos los cursos
             while(line != null)
             {
                 auxID = line;
                 //si un ID existe, el curso ya existe
                 if(Integer.parseInt(auxID) == id){
                     return true;
                 }
                 //ignorar siguientes 6 lineas
                 for(int i = 0; i < 6; i++){
                    line = in.readLine();
                 }
             }
             
             //si ningun ID es igual, el curso es nuevo
             return false;
         }
    
    void agregaCurso(){
        try {
            FileWriter writer = new FileWriter("cursos.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write(id);
            bufferedWriter.newLine();
            bufferedWriter.write(nombre);
            bufferedWriter.newLine();
            bufferedWriter.write(tutor.id);
            bufferedWriter.newLine();
            bufferedWriter.write(fechaInicio.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(fechaFin.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(lugar);
            bufferedWriter.newLine();
            bufferedWriter.write(cupo);
            bufferedWriter.newLine();
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
