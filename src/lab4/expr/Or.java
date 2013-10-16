package expr;

import java.util.Map;

public class Or extends BinExpr {

	public Or(Expr ex1,Expr ex2){
		super(ex1,ex2);
	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		// TODO Auto-generated method stub
		return ex1.value(map) || ex2.value(map);
	}

	@Override
	public String op() {
		// TODO Auto-generated method stub
		return "⋁";
	}

}
