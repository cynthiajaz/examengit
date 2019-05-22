package examen;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstudianteTest {

	@Test
	public void codigo() {
		Estudiante e = new Estudiante("ADG","Mario","hombre");
		assertTrue(e.getCodigo()=="ADG");
	}
	@Test
	public void nombre() {
		Estudiante e = new Estudiante("ADG","Mario","hombre");
		assertTrue(e.getNombre()=="Mario");
	}
	@Test
	public void sexo() {
		Estudiante e = new Estudiante("ADG","Mario","hombre");
		assertTrue(e.getSexo()=="hombre");
	}
	@Test
	public void estudiante() {
		Estudiante e = new Estudiante("ADG","Mario","hombre");
		assertTrue(e.nombre == "Mario");
		assertTrue(e.codigo == "ADG");
		assertTrue(e.sexo == "hombre");
	}
	@Test
	public void setc() {
		Estudiante e = new Estudiante("ADG","Mario","hombre");
		assertTrue(e.codigo == e.getCodigo());
	}
	@Test
	public void setn() {
		Estudiante e = new Estudiante("ADG","Mario","hombre");
		assertTrue(e.nombre == e.getNombre());
	}
	@Test
	public void sets() {
		Estudiante e = new Estudiante("ADG","Mario","hombre");
		assertTrue(e.sexo == e.getSexo());
	}

}
