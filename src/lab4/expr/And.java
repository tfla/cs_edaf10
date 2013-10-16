package expr;

import java.util.Map;

public class And extends BinExpr {

	public And(Expr ex1,Expr ex2) {
		// TODO Auto-generated constructor stub
		super(ex1,ex2);
	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		// TODO Auto-generated method stub
		return ex1.value(map) && ex2.value(map);
	}

	@Override
	public String op() {
		// TODO Auto-generated method stub
		return "⋀";
	}

}
