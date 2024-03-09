package subclases;

import clases.Docente;

public class Estable extends Docente{
	// ATRIBUTOS
	private String categoria;

	// CONTRUCTOR
	public Estable(int codigo, String nombre, String categoria) {
		super(codigo, nombre);

		this.categoria = categoria;
	}

	// GETTERS Y SETTERS
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	// IMPLEMENTAR LOS METODOS ABSTRACTOS DE LA SUPERCLASE
	public double sueldo() {
		switch (categoria) {
			case "A":
				return 3500;
			case "B":
				return 3250;
			case "C":
				return 3000;
			case "D":
				return 2800;
			default:
				return 0;
		}
	}

	public double bonificacion() {
		return 0.10 * sueldo();
	}

	public String tipoDocente() {
		return super.tipoDocente() + " Estable";
	}
}
