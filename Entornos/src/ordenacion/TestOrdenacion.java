package ordenacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOrdenacion {
	
	@Test
	void testConstructor() {
		Ordenacion o = new Ordenacion();
	}
	
	@Test
	void testOrden1() {
		assertTrue(Ordenacion.ordenacionTres(1, 2, 3));
	}
	
	@Test
	void testOrden2() {
		assertTrue(Ordenacion.ordenacionTres(3, 2, 1));
	}
	
	@Test
	void testOrden3() {
		assertTrue(Ordenacion.ordenacionTres(2, 3, 1));
	}
	
	@Test
	void testOrden4() {
		assertTrue(Ordenacion.ordenacionTres(3, 1, 2));
	}
	
	@Test
	void testOrden5() {
		assertTrue(Ordenacion.ordenacionTres(2, 1, 3));
	}
	
	@Test
	void testOrden6() {
		assertTrue(Ordenacion.ordenacionTres(1, 3, 2));
	}
	
	@Test
	void testOrden7() {
		assertFalse(Ordenacion.ordenacionTres(1, 1, 1));
	}

}
