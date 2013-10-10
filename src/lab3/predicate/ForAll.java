package predicate;

import java.util.HashSet;
import java.util.Set;

import term.Term;
import term.Variable;

public class ForAll implements Expr {
	private Variable var;
	private Expr expr;
	public ForAll(Variable var, Expr expr){
		this.var = var;
		this.expr = expr;
	}
	
	public String toString(){
		return "∀" + var.toString() + "." + expr.toString();
	}
	
	public ForAll substitute(Variable x, Term term){
		if(var.equals(x)){ 
			return this;
		}
		Set<Variable> set = new HashSet<Variable>();
		term.collectVariables(set);
		if(set.contains(var)){ // 
			Variable newVar = new Variable();
			return new ForAll(newVar, expr.substitute(var, newVar).substitute(x, term)); // var är bunden
		}
		return new ForAll(var, expr.substitute(x, term)); // var förekommer inte i term
		
	}
}
