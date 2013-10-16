package expr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Expr {
	public abstract String toString();
    protected abstract void collectVariables(Set<Variable> set);

    public boolean isTautology() {
        List<Variable> list = new ArrayList<Variable>(variables());
        return testAll(list, new HashMap<Variable, Boolean>());
    }

    private boolean testAll(List<Variable> list, Map<Variable, Boolean> map) {
    	 if (list.isEmpty()) {
             return value(map);
         } else {
             Variable variable = list.remove(list.size() - 1);
             List<Variable> list1 = new ArrayList<Variable>(list);
             map.put(variable, false);
             if (!testAll(list, map)) {
                 return false;
             }
             map.put(variable, true);
             return testAll(list1, map);
         }
    }

    public abstract boolean value(Map<Variable, Boolean> map);

    public Set<Variable> variables() {
        Set<Variable> set = new HashSet<Variable>();
        collectVariables(set);
        return set;
    }
    
    private String testAll(List<Variable> list, Map<Variable, Boolean> map, StringBuilder s, int i) {         
        if (list.size()>i){  
    	Variable a = list.get(i);
            map.put(a, false);
    	    testAll(list,map,s,i+1);
            map.put(a,true);
            testAll(list,map,s,i+1);
        }
        else 
        {
        boolean n= value(map);
          s.append(map.values() + " " + value(map) + "\r\n");
        }
    	return s.toString();
    }
}
