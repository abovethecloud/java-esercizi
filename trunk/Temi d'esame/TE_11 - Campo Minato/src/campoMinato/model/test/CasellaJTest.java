package campoMinato.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import campoMinato.model.Casella;

public class CasellaJTest {

	public Casella casella1 = new Casella(1, 2);

	@Test
	public void test0001() {

		System.out.println(casella1.getX());
		if (casella1.getX() != 150)
			fail("X errata");
		
		System.out.println(casella1.getY());
		if (casella1.getY() != 200)
			fail("Y errata");
	}

	@Test
	public void test0002() {
		if (casella1.isMine() || casella1.isClicked() || casella1.isFlag())
			fail("problema booleani");

	}
}
