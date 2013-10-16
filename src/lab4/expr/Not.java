package expr;

import java.util.Map;
import java.util.Set;

public class Not extends Expr {
    Expr ex1;
	public Not(Expr ex1) {
		// TODO Auto-generated constructor stub
		this.ex1 = ex1;
	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		// TODO Auto-generated method stub
		return !ex1.value(map);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "¬"+ex1.toString();
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		ex1.collectVariables(set);	
	}

}
