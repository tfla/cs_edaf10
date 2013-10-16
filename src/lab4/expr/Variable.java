package expr;

import java.util.Map;
import java.util.Set;

public class Variable extends Expr {
	String name;
	public Variable(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		// TODO Auto-generated method stub
		set.add(this);

	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		// TODO Auto-generated method stub
		return false;
	}
	public String toString(){
		return name;
	}
	public int hashCode(){
		return name.hashCode();
	}

}
