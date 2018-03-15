package ejercicio;

public class TipoImpuesto {

	private int porcentaje;
	private int porcentaje30;
	private String nombre;

	public TipoImpuesto(String _nom, int _porc, int _porc30) {
		this.nombre = _nom;
		this.porcentaje = _porc;
		this.porcentaje30 = _porc30;
	}

	public int getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(int _porcentaje) {
		this.porcentaje = _porcentaje;
	}

	public int getPorcentaje30() {
		return this.porcentaje30;
	}

	public void setPorcentaje30(int _porcentaje30) {
		this.porcentaje30 = _porcentaje30;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

}
