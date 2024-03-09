package clases;

import java.util.ArrayList;

import subclases.Contratado;
import subclases.Estable;

public class ArregloDocentes {
	// ATRIBUTOS
	private ArrayList<Docente> docentes;

	// CONTRUCTOR
	public ArregloDocentes() {
		this.docentes = new ArrayList<Docente>();
	
		docentes.add(new Contratado(1001, "Jose", 24, 10));
		docentes.add(new Contratado(1002, "Maria", 24, 20));
		docentes.add(new Contratado(1003, "Elena", 24, 15));
		
		docentes.add(new Estable(2001, "Sebastian", "A"));
		docentes.add(new Estable(2002, "Luciana", "B"));
		docentes.add(new Estable(2003, "Carlos", "C"));
	}
	
	// GETTER *
	public ArrayList<Docente> getDocentes() {
		return docentes;
	}

	// METODOS
	public void adicionar(Docente d) {
		docentes.add(d);
	}
	
	public Docente obtener(int posicion) {
		return docentes.get(posicion);
	}
	
	public int tamano() {
		return docentes.size();
	}
	
	public double sumaSueldos() {
		double suma = 0.0;
		
		for (Docente docente : docentes) {
			suma += docente.sueldo();
		}
		
		return suma;
	}
	
	public int cantidadSueldosMenoresQue900() {
		int cantidad = 0;
		
		for (Docente docente : docentes) {
			if(docente.sueldo() < 900) {
				cantidad++;
			}
		}
		
		return cantidad;
	}
}
