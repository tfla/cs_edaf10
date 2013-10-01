package expr;

import java.util.Map;
import java.util.Set;

public class Negation extends Expr {
	Expr expr;

	public Negation(Expr expr) {
		this.expr = expr;
	}

	public boolean value(Map<Variable, Boolean> map) {
		return !(expr.value(map));
	}

	public void collectVariables(Set<Variable> set) {
		expr.collectVariables(set);
	}

	public String toString() {
		return "¬" + expr.toString();
	}
}
