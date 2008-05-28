package interpretor;

import java.util.Comparator;

public interface Variable {
	public static class VariableComparator implements Comparator{

		public int compare(Object o1, Object o2) {
			String n1 = o1 instanceof Variable ? ((Variable)o1).getName() : (String)o1;
			String n2 = o2 instanceof Variable ? ((Variable)o2).getName() : (String)o2;
			return n1.compareTo(n2);
		}};

	String getName();
	Object getValue();
}
