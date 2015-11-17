/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;

/**
 *
 * @author Debml
 */
public class Persona {
    String nombre;
    String telefono;
    String email;
    int id;
    
    Persona(String nombre, String telefono, String email, int id){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.id = id;
    }
    
}
