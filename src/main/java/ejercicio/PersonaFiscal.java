package ejercicio;

public class PersonaFiscal {

	private String nombre;
	private int edad;
	private int sueldo;
	private TipoImpuesto tipo1;

	public PersonaFiscal(String _nom, int _edad, int _sueldo, String _tipo) {

		this.nombre = _nom;
		this.edad = _edad;
		this.sueldo = _sueldo;
		vincularTipoImpuesto(_tipo);
	}

	public void vincularTipoImpuesto(String _tipo) {
		if (_tipo.equals("A")) {
			this.tipo1 = new TipoImpuesto("A", 20, 30);
		} else if (_tipo.equals("B")) {
			this.tipo1 = new TipoImpuesto("A", 10, 5);
		} else if (_tipo.equals("C")) {
			this.tipo1 = new TipoImpuesto("A", 30, 25);
		} else if (_tipo.equals("D")) {
			this.tipo1 = new TipoImpuesto("A", 10, 30);
		}
	}

	public int calcularImpuesto() {

		int impuesto = 0;
		if (this.edad <= 30) {
			impuesto = this.sueldo * this.tipo1.getPorcentaje30() / 100;
		} else if (this.edad > 30) {
			impuesto = this.sueldo * this.tipo1.getPorcentaje() / 100;
		}

		return impuesto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int _edad) {
		this.edad = _edad;
	}

	public int getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(int _sueldo) {
		this.sueldo = _sueldo;
	}
}
