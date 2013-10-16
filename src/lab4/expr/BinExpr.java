package expr;

import java.util.Map;
import java.util.Set;

public abstract class BinExpr extends Expr {
	Expr ex1,ex2;
	public BinExpr(Expr ex1,Expr ex2) {
		this.ex1=ex1;
		this.ex2=ex2;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		// TODO Auto-generated method stub
		ex1.collectVariables(set);
		ex2.collectVariables(set);
	}

	public abstract String op();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + ex1.toString() + " " + op() + " " + ex2.toString() + ")";
	}

}
