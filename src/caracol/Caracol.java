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
import java.util.Date;

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
	
        Controlador control = new Controlador();
        
        String line = readFile.readLine();
        String user;
        String password;
        int menuOption;
        
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
            System.out.println("Usuario/id:");
            user = stdIn.readLine();
            //pedir contraseña
            System.out.println("Conraseña:");
            password = stdIn.readLine();
       
        }while(false);//!iniciarSesion(user, password));
        
        System.out.println("*******************************************");
        System.out.println("             Bienvenido " + user + "!");
        System.out.println("*******************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        
        readFile = new BufferedReader (new FileReader 
             ("/Users/Mauro/Dropbox/5 Semestre/AMSS/McDinero/Caracol/Caracol/"
                     + "src/caracol/Archivos/menu.txt"));
        //imprimir menu
        line = readFile.readLine();
        while(line != null) {
            System.out.println(line);
            line = readFile.readLine();
        }
        
        menuOption = Integer.parseInt(stdIn.readLine());
        
        switch(menuOption) {
            case 1://registrar alumno
                String nombre, telefono, email, direccion;
                int edad;
                
                System.out.println("Nombre del alumno:");
                nombre = stdIn.readLine();
                System.out.println("Edad del alumno:");
                edad = Integer.parseInt(stdIn.readLine());
                System.out.println("Telefono del alumno:");
                telefono = stdIn.readLine();
                System.out.println("Email del alumno:");
                email = stdIn.readLine();
                System.out.println("Dirección del alumno:");
                direccion = stdIn.readLine();
                
                control.Alumno(nombre, edad, telefono, email, direccion);
                break;
            case 2:
                break;
            case 3: //modificar alumno
                String edadS;
                int modAlumnoDecision = 0;
                while(modAlumnoDecision != 6) {
                    readFile = new BufferedReader (new FileReader 
             ("/Users/Mauro/Dropbox/5 Semestre/AMSS/McDinero/Caracol/Caracol/"
                     + "src/caracol/Archivos/modificarAlumno.txt"));
                    //imprimir menu
                    line = readFile.readLine();
                    while(line != null) {
                        System.out.println(line);
                        line = readFile.readLine();
                    }
                    
                    modAlumnoDecision = Integer.parseInt(stdIn.readLine());
                    
                    System.out.println("Nombre actual del alumno:");
                    String nombreA = stdIn.readLine();
                    
                    switch (modAlumnoDecision) {
                        case 1:
                            System.out.println("Nuevo nombre del alumno:");
                            nombre = stdIn.readLine();
                            control.modificarAlumno(nombreA, nombre, modAlumnoDecision);
                            break;
                        case 2:
                            System.out.println("Nueva edad del alumno:");
                            edadS = stdIn.readLine();
                            control.modificarAlumno(nombreA, edadS, modAlumnoDecision);
                            break;
                        case 3:
                            System.out.println("Nuevo telefono del alumno:");
                            telefono = stdIn.readLine();
                            control.modificarAlumno(nombreA, telefono, modAlumnoDecision);
                            break;
                        case 4:
                            System.out.println("Nuevo email del alumno:");
                            email = stdIn.readLine();
                            control.modificarAlumno(nombreA, email, modAlumnoDecision);
                            break;
                        case 5:
                            System.out.println("Nueva dirección del alumno:");
                            direccion = stdIn.readLine();
                            control.modificarAlumno(nombreA, direccion, modAlumnoDecision);
                            break;
                        default:
                            break;
                    }
                    
                    
                    
                }
                break;
                
            case 4:
                break;
            case 5://registrar curso
                String nombreCurso, lugar, tutor;
                Date fecha_inicio, fecha_fin;
                int cupo, ano, mes, dia, hora, minuto;
                
                System.out.println("Nombre del curso:");
                nombreCurso = stdIn.readLine();
                System.out.println("Lugar del curso:");
                lugar = stdIn.readLine();
                System.out.println("Cupo del curso:");
                cupo = Integer.parseInt(stdIn.readLine());
                System.out.println("Nombre del tutor del curso:");
                tutor = stdIn.readLine();
                System.out.println("Fecha de inicio del curso");
                System.out.println("Año:");
                ano = Integer.parseInt(stdIn.readLine());
                System.out.println("Mes: (1-12)");
                mes = Integer.parseInt(stdIn.readLine());
                System.out.println("Día: (1-31)");
                dia = Integer.parseInt(stdIn.readLine());
                System.out.println("Hora: (Solo hora, 0-24)");
                hora = Integer.parseInt(stdIn.readLine());
                System.out.println("Minuto: (0-59)");
                minuto = Integer.parseInt(stdIn.readLine());
                fecha_inicio = new Date(ano, mes, dia, hora, minuto);
                System.out.println("Fecha de fin del curso");
                System.out.println("Año:");
                ano = Integer.parseInt(stdIn.readLine());
                System.out.println("Mes: (1-12)");
                mes = Integer.parseInt(stdIn.readLine());
                System.out.println("Día: (1-31)");
                dia = Integer.parseInt(stdIn.readLine());
                System.out.println("Hora: (Solo hora, 0-24)");
                hora = Integer.parseInt(stdIn.readLine());
                System.out.println("Minuto: (0-59)");
                minuto = Integer.parseInt(stdIn.readLine());
                fecha_fin = new Date(ano, mes, dia, hora, minuto);

                control.Curso(nombreCurso, tutor, cupo, lugar, fecha_inicio, fecha_fin);
                break;
            default:
                System.out.println("Opcion invalida");
                System.out.println("Porfavor escriba el numero del boton:");
                break;
        }
    }
    
    
    
    /*
    + eliminarAlumno(id : Integer)
+ iniciarSesion(usuario : Administrador, password : String)
+ inscribirAlumno(AlumnoID : Integer, CursoID : Integer)
+ modificarAlumno(x : Estudiante)
+ registrarAlumno(nombre : String, edad : Integer, telefono : String, email : String, direccion : String)
+registrarCurso(nombre : String, tutor : Tutor, cupo : Integer, lugar : String, fecha_inicio : Date, fecha_fin : Date)*/
    
}
