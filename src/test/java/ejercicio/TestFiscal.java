package ejercicio;

import org.junit.Assert;
import org.junit.Test;



public class TestFiscal {

	@Test
	public void prueba1A() {
		PersonaFiscal p1 = new PersonaFiscal("Daniel Pastor", 18, 1000, "A");
		int impuesto = p1.calcularImpuesto();
		Assert.assertEquals(300, impuesto);

	}

	@Test
	public void prueba2A() {
		PersonaFiscal p1 = new PersonaFiscal("Daniel Pastor Sellers", 50, 1000, "A");
		int impuesto = p1.calcularImpuesto();
		Assert.assertEquals(200, impuesto);

	}

	@Test
	public void prueba1B() {
		PersonaFiscal p1 = new PersonaFiscal("Daniel Pastor ", 18, 1000, "B");
		int impuesto = p1.calcularImpuesto();
		Assert.assertEquals(50, impuesto);

	}

	@Test
	public void prueba2B() {
		PersonaFiscal p1 = new PersonaFiscal("Daniel Pastor Sellers", 50, 1000, "B");
		int impuesto = p1.calcularImpuesto();
		Assert.assertEquals(100, impuesto);

	}

	@Test
	public void prueba1C() {
		PersonaFiscal p1 = new PersonaFiscal("Daniel Pastor", 18, 1000, "C");
		int impuesto = p1.calcularImpuesto();
		Assert.assertEquals(250, impuesto);

	}

	@Test
	public void prueba2C() {
		PersonaFiscal p1 = new PersonaFiscal("Daniel Pastor Sellers", 50, 10020, "C");
		int impuesto = p1.calcularImpuesto();
		Assert.assertEquals(300, impuesto);

	}

	@Test
	public void prueba1D() {
		PersonaFiscal p1 = new PersonaFiscal("Daniel Pastor", 18, 1000, "D");
		int impuesto = p1.calcularImpuesto();
		Assert.assertEquals(3020, impuesto);

	}

	@Test
	public void prueba2D() {
		PersonaFiscal p1 = new PersonaFiscal("Daniel Pastor Sellers", 50, 1000, "D");
		int impuesto = p1.calcularImpuesto();
		Assert.assertEquals(1020, impuesto);

	}

}
