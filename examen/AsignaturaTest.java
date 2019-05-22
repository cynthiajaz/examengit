package examen;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignaturaTest {

	@Test
	public void nota1() {
		Asignatura e = new Asignatura(2.5,3.5);
		assertTrue(e.getNota1() == 2.5);
	}
	@Test
	public void nota2() {
		Asignatura e = new Asignatura(2.5,3.5);
		assertTrue(e.getNota2() == 3.5);
	}
	
	@Test
	public void asignatura() {
		Asignatura e = new Asignatura(5.2, 6.6);
		assertTrue(e.nota1 == 5.2);
		assertTrue(e.nota2 == 6.6);
	}
	@Test
	public void setn1() {
		Asignatura e = new Asignatura(5.2,6.6);
		assertTrue(e.nota1 == e.getNota1());
	}
	@Test
	public void setn2() {
		Asignatura e = new Asignatura(5.2,6.6);
		assertTrue(e.nota2 == e.getNota2());
	}
}
