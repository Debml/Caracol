/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;

import java.io.*;

/**
 *
 * @author Debml
 */
public class Administrador extends Persona{
    String nombreUsuario;
    String password;
    Curso cursos[];
    
    Administrador(String nombre, String telefono, String email, int id, String nombreUsuario, String password){
        super(nombre, telefono, email, id);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    
    //checa si un usuario está registrado como administrador
    boolean validarUsuario() throws FileNotFoundException, IOException {
             String line;
             BufferedReader in;
             String auxUser;
             String auxPassword;

             in = new BufferedReader(new FileReader("admins.txt"));
             line = in.readLine();

             //busca en la "base de datos" todos los usuarios
             while(line != null)
             {
                 auxUser = line;
                 line = in.readLine();
                 auxPassword = line;
                 
                 //si un par hace match, el login es valido
                 if(auxUser == nombreUsuario && auxPassword == password){
                     return true;
                 }
             }
             
             //si ningun par hace match, el login no es valido
             return false;
         }
        
    
}
