package expr;

import java.util.Map;
import java.util.Set;

public class Disjunction extends Expr {
	private Expr expr0, expr1;

	public Disjunction(Expr expr0, Expr expr1) {
		this.expr0 = expr0;
		this.expr1 = expr1;
	}

	public boolean value(Map<Variable, Boolean> map) {
		return expr0.value(map) || expr1.value(map);
	}

	public void collectVariables(Set<Variable> set) {
		expr0.collectVariables(set);
		expr1.collectVariables(set);
	}

	public String toString() {
		return "(" + expr0.toString() + " ⋁ " + expr1.toString() + ")";
	}
}
