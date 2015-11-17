/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracol;

/**
 *
 * @author Debml and mauro
 */
public class Alumno extends Persona {
   String direccion;
	int edad;
	
	
	public Alumno(String nombre, String telefono, String email, String direccion, int edad) {
		super(nombre, telefono, email);
		this.direccion = direccion;
		this.edad = edad;
	}
	
	//eliminarEstudiante()
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
