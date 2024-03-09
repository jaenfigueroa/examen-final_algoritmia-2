package clases;

import interfaces.Identificable;

public abstract class Docente implements Identificable{
	// ATRIBUTOS
	private int codigo;
	private String nombre;

	// CONSTRUCTOR
	public Docente(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// METODOS ABSTRACTOS
	public abstract double sueldo();
	
	public abstract double bonificacion();
	
	// METODOS
	public String tipoDocente() {
		return "Docente";
	};
}
