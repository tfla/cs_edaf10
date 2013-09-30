package test;

import static org.junit.Assert.*;

import org.junit.Test;

import expr.*;

public class Tests {
	Expr expr;

	@Test
	public final void testTautologies() {
		/*
		assertTrue("Message", method());
		assertFalse("Message", method());
		assertNull("Message", method());
		assertEquals("Message", method());
		*/
		Variable p = new Variable("p");
		Variable q = new Variable("q");
		expr = new Implication(new Implication(new Negation(p), new Negation(q)), new Implication(new Implication(new Negation(p), q), p));
		assertTrue("A tautology was reported as non-tautology. ", expr.isTautology());
	}

/*
	@Test
	public final void testNonTautologies() {
		
	}
*/
}
