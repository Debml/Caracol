/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mauro
 */
public class Controlador {
    ArrayList<Administrador> administradores = new ArrayList<Administrador>();
    ArrayList<Persona> personas = new ArrayList<Persona>();
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    ArrayList<Tutor> tutores = new ArrayList<Tutor>();
    ArrayList<Curso> cursos = new ArrayList<Curso>();
    
    public boolean validarUsuario(String usuario, String password) throws IOException {
        Administrador prueba = new Administrador("x", "x", "x", 0, usuario, password);
        return prueba.validarUsuario();
    }
    
    public void Alumno(String nombre, int edad, String telefono, String email, String direccion) {
        int id = alumnos.size()+1;
        Alumno aux = new Alumno(nombre, telefono, email, direccion, edad, id);
        alumnos.add(aux);
    }
    
    public void Curso(String nombre, String tutor, int cupo, String lugar, Date fecha_inicio, Date fecha_fin) {
        int id = cursos.size()+1;
        Tutor aux = null;
        for (Tutor tutorAux : tutores) {
            if (tutorAux.getNombre() == tutor) {
                aux = tutorAux;
                break;
            }
        }
        
        Curso aux2 = new Curso(nombre, id, aux, fecha_inicio, fecha_fin, lugar, cupo);
        cursos.add(aux2);
    }
    
    
}


/*+ eliminarAlumno(id : Integer)
+ validarUsuario(usuario : Administrador, password : String)
+ Alumno(AlumnoID : Integer)
+ Curso(CursoID : Integer)
+ EstudianteCurso(Alumno : Estudiante, Curso : Curso)
+ modificarAlumno(x : Estudiante)
+ Alumno(nombre : String, edad : Integer, telefono : String, email : String, direccion : String)
+ Curso(nombre : String, tutor : Tutor, cupo : Integer, lugar : String, fecha_inicio : Date, fecha_fin : Date)
+ verifica_existenciaCurso(Curso)*/