package expr;

import java.util.Map;
import java.util.Set;

public class Variable extends Expr {
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	public boolean value(Map<Variable, Boolean> map) {
		return map.get(this);
	}

	public void collectVariables(Set<Variable> set) {
		set.add(this);
	}

	public boolean equals(Object o) {
		if (o instanceof Variable) {
			return this.hashCode() == o.hashCode();
		}
		return false;
	}

	public int hashCode() {
		return name.hashCode();
	}

	public String toString() {
		return name;
	}
}
