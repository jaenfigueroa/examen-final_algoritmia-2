package subclases;

import clases.Docente;

public class Contratado extends Docente{
	// ATRIBUTOS
	private int horas;
	private double pagoPorHora;

	// CONTRUCTOR
	public Contratado(int codigo, String nombre, int horas, double pagoPorHora) {
		super(codigo, nombre);

		this.horas = horas;
		this.pagoPorHora = pagoPorHora;
	}

	// GETTERS Y SETTERS
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getPagoPorHora() {
		return pagoPorHora;
	}

	public void setPagoPorHora(double pagoPorHora) {
		this.pagoPorHora = pagoPorHora;
	}

	// METODOS
	public double sueldo() {
		return horas * pagoPorHora;
	}

	public double bonificacion() {
		return 0.15 * sueldo();
	}

	public String tipoDocente() {
		return super.tipoDocente() + " Contratado";
	}
}
