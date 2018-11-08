package Objetos.principal.models;

public class Usuario {
	
	public String nombre;
	public String apellido;
	public String email;
	public int edad;
	public Direccion dir;
	public String mostrarDatosCompletos() 
	{
		
		String datos = this.nombre+" "+this.apellido+", "+this.email+" "+this.edad+" Dirección:"+
		this.dir.mostrarDireccionCompleta();
		return datos;
	}
	
}
