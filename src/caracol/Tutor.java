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
public class Tutor extends Persona {
    Curso clase;
    
    Tutor(String nombre, String telefono, String email, int id){
        super(nombre, telefono, email, id);
    }
    
}
