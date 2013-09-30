package expr;

import java.util.Map;
import java.util.Set;

public class Equivalence extends Expr {
	private Expr expr0, expr1;

	public Equivalence(Expr expr0, Expr expr1) {
		this.expr0 = expr0;
		this.expr1 = expr1;
	}

	public boolean value(Map<Variable, Boolean> map) {
		return false;
	}

	public void collectVariables(Set<Variable> set) {
		expr0.collectVariables(set);
        expr1.collectVariables(set);
	}

	public String toString() {
		return "(" + expr0.toString() + " == " + expr1.toString() + ")";
	}
}
