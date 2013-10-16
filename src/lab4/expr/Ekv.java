package expr;

import java.util.Map;

public class Ekv extends BinExpr {

	public Ekv(Expr ex1,Expr ex2) {
		super(ex1,ex2);
	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		return ex1.value( map) == ex2.value(map);
	}

	@Override
	public String op() {
		return "⇔";
	}
	
}
