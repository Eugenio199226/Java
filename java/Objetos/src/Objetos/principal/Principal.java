package Objetos.principal;

import Objetos.principal.models.Usuario;
import Objetos.principal.models.Direccion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario pepito = new Usuario();
		pepito.nombre="D�bora";
		pepito.apellido="Hombres";
		/*Direccion adir=new Direccion();
		
		adir.calle="Sin Numero";
		adir.numero=123;
		adir.ciudad="Springfield";*/
		pepito.dir=new Direccion();
		pepito.dir.calle="Sin Numero";
		pepito.dir.numero=123;
		pepito.dir.ciudad="Springfield";
		
		System.out.println(pepito.mostrarDatosCompletos());

	}

}
