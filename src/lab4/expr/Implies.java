package expr;

import java.util.Map;

public class Implies extends BinExpr {

	public Implies(Expr ex1,Expr ex2) {
		// TODO Auto-generated constructor stub
		super(ex1,ex2);
	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		// TODO Auto-generated method stub
		if (ex1.value(map)){
			return ex2.value(map);
		}
		return true;
	}

	@Override
	public String op() {
		// TODO Auto-generated method stub
		return "⇒";
	}

}
