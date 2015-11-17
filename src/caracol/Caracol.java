/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Debml
 */
public class Caracol {

    public static void main(String[] args) throws IOException {
        BufferedReader stdIn = new BufferedReader( new InputStreamReader
                                                                   (System.in));
        BufferedReader readFile = new BufferedReader (new FileReader 
             ("/Users/Mauro/Dropbox/5 Semestre/AMSS/McDinero/Caracol/Caracol/"
                     + "src/caracol/Archivos/interfaz.txt"));
		
        String line = readFile.readLine();
        String user;
        String password;
        
        for (int i = 0; i < 10000; i++) {
            System.out.println("L");
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("LO");
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("LOA");
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("LOAD");
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("LOADI");
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("LOADIN");
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("LOADING");
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("LOADING.");
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("LOADING..");
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println("LOADING...");
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println();
        }
        
        while(line != null) {
            System.out.println(line);
            line = readFile.readLine();
        }
        
        do {
            System.out.println();
            System.out.println();
            System.out.println();
        
            //pedir usuario
            System.out.println("Usuario:");
            user = stdIn.readLine();
            //pedir contraseña
            System.out.println("Conraseña:");
            password = stdIn.readLine();
       
        }while(!iniciarSesion(user, password));
        
        System.out.println("*******************************************");
        System.out.println("       Bienvenido " + user + "!");
        System.out.println("*******************************************");
    }
    
    
    
    /*
    + eliminarAlumno(id : Integer)
+ iniciarSesion(usuario : Administrador, password : String)
+ inscribirAlumno(AlumnoID : Integer, CursoID : Integer)
+ modificarAlumno(x : Estudiante)
+ registrarAlumno(nombre : String, edad : Integer, telefono : String, email : String, direccion : String)
+registrarCurso(nombre : String, tutor : Tutor, cupo : Integer, lugar : String, fecha_inicio : Date, fecha_fin : Date)*/
    
}
